use std::{collections::HashMap, hash::Hash, thread, time::Duration};

pub fn exec() {
    let simulated_intensity = 10;
    let simulated_random_number = 7;

    generate_workout(simulated_intensity, simulated_random_number);

    let x = vec![1, 2, 3];

    // A closure can capture variables in its surrounding scope
    let equal_to_x = |z| z == x;

    // By default it captures by borrowing, but with the move keyword
    // it takes ownership:
    // let equal_to_x = move |z| z == x;

    println!("can't use x here: {:?}", x);

    let y = vec![1, 2, 3];

    assert!(equal_to_x(y))
}

struct Cacher<K, V, F>
where
    K: Eq + Hash + Clone,
    F: Fn(&K) -> V,
{
    calculation: F,
    values_map: HashMap<K, V>,
}

impl<K, V, F> Cacher<K, V, F>
where
    K: Eq + Hash + Clone,
    F: Fn(&K) -> V,
{
    fn new(calculation: F) -> Self {
        Self {
            calculation,
            values_map: HashMap::new(),
        }
    }

    fn get(&mut self, value: &K) -> &V {
        let calculate = &self.calculation;

        self.values_map
            .entry(value.clone())
            .or_insert_with_key(|value| calculate(value))
    }
}

fn generate_workout(intensity: u32, random_number: u32) {
    let mut cached_results = Cacher::new(|num: &u32| -> u32 {
        println!("calculating slowly...");
        thread::sleep(Duration::from_secs(2));
        num.to_owned()
    });

    // A closure might infer its types later based on its first calling
    // let example_closure = |x| x;
    // let s = example_closure(String::from("Hello"));
    // let n = example_closure(5); => Error: mismatched types

    if random_number == 3 {
        println!("Take a break today! Remenber to stay hidrated!");
    } else if intensity < 25 {
        println!("Today, do {} pushups!", cached_results.get(&intensity));
        println!("Today, do {} situps!", cached_results.get(&intensity));
    } else {
        println!("Total, run for {} minutes!", cached_results.get(&intensity))
    }
}
