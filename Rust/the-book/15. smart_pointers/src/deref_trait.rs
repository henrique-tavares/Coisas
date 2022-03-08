use std::ops::Deref;

struct MyBox<T>(T);

impl<T> MyBox<T> {
    fn new(x: T) -> MyBox<T> {
        MyBox(x)
    }
}

impl<T> Deref for MyBox<T> {
    type Target = T;

    fn deref(&self) -> &Self::Target {
        &self.0
    }
}

pub fn exec() {
    let x = 5;
    let y1 = &x;
    let y2 = Box::new(x);
    let y3 = MyBox::new(x);

    assert_eq!(5, x);
    assert_eq!(5, *y1);
    assert_eq!(5, *y2);
    assert_eq!(5, *y3); // assert(5, *(y3.deref()));

    // The compiler only knows hot to dereference a reference,
    // hence the implicit call to deref

    let m = MyBox::new(String::from("Rust"));
    hello(&m);
    // &MyBox<String> -> &String -> &str

    // Implicit Deref Coercions:
    // From &T to &U when T: Deref<Target=U>
    // From &mut T to &mut U when T: DerefMut<Target=U>
    // From &mut T to &U when T: Deref<Target=U>
}

fn hello(name: &str) {
    println!("Hello, {}!", name);
}
