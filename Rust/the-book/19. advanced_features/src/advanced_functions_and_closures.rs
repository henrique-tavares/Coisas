#![allow(dead_code)]

pub fn exec() {
    // Function pointers
    let x = 5;

    println!(
        "{}: {} | {}",
        x,
        do_twice(add_one, x),
        do_twice_2(add_one, x)
    );

    // Tuple structs, may be considered as function pointers, as a constructor
    #[derive(Debug)]
    enum Status {
        Value(u32),
    }

    let list_of_statuses = (0_u32..20).map(Status::Value).collect::<Vec<_>>();

    println!("{:?}", list_of_statuses);
}

fn add_one(x: i32) -> i32 {
    x + 1
}

fn do_twice(f: fn(i32) -> i32, arg: i32) -> i32 {
    f(arg) + f(arg)
}

// It's best to use trait bounds, which would allow us to pass
// either a function pointer or a closure
// Fn: immutably borrow its arguments
// FnMut: mutably borrow its arguments
// FnOnce: take ownership of its arguments
// A function pointer automatically implements these three traits

fn do_twice_2<F>(f: F, arg: i32) -> i32
where
    F: Fn(i32) -> i32,
{
    f(arg) + f(arg)
}

fn returns_closure() -> impl Fn(i32) -> i32 {
    |x| x + 1
}

fn returns_closure_2(a: i32) -> Box<dyn Fn(i32) -> i32> {
    // Even though these closures have the same signature
    // they have different types
    if a > 0 {
        Box::new(move |b| a + b)
    } else {
        Box::new(move |b| a - b)
    }
}
