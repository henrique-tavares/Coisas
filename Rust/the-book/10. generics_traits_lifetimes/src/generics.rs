struct Point1<T> {
    x: T,
    y: T,
}

impl<T> Point1<T> {
    fn x(&self) -> &T {
        &self.x
    }

    fn y(&self) -> &T {
        &self.y
    }
}

impl Point1<f64> {
    fn desc(&self) -> &str {
        "I'm a float!"
    }
}

#[derive(Debug)]
struct Point2<T, U> {
    x: T,
    y: U,
}

impl<T: Clone, U: Clone> Point2<T, U> {
    fn mixup<V: Clone, W: Clone>(&self, other: &Point2<V, W>) -> Point2<T, W> {
        Point2 {
            x: self.x.clone(),
            y: other.y.clone(),
        }
    }
}

pub fn exec() {
    let list = vec![34, 50, 25, 100, 65];
    if let Some(largest) = get_largest(&list) {
        println!("{:?}", list);
        println!("{:?}", largest);
    }

    let list = vec!['y', 'm', 'a', 'q'];
    if let Some(largest) = get_largest(&list) {
        println!("{:?}", list);
        println!("{:?}", largest);
    }

    let p11 = Point1 { x: 5, y: 10 };
    println!("p11.x = {}, p11.y = {}", p11.x(), p11.y());
    let p12 = Point1 { x: 3.14, y: 2.73 };
    println!("p12.x = {}, p12.y = {} | {}", p12.x(), p12.y(), p12.desc());

    let p21 = Point2 { x: 5, y: 10.4 };
    let p22 = Point2 { x: "Hello", y: 'c' };
    let p23 = p21.mixup(&p22);
    println!("p21 = {:?}, p22 = {:?}, p23 = {:?}", p21, p22, p23);
}

fn get_largest<T>(list: &Vec<T>) -> Option<T>
where
    T: PartialOrd + Clone,
{
    if let Some(mut largest) = list.first() {
        for number in list.iter() {
            if number > largest {
                largest = number;
            }
        }
        Some(largest.clone())
    } else {
        None
    }
}
