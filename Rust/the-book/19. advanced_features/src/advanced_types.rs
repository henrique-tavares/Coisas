#![allow(dead_code)]

use std::fmt;

pub fn exec() {
    let w = Wrapper(vec![String::from("hello"), String::from("world")]);
    println!("w = {}", w);

    // Type aliases
    type Kilometers = u32;

    let x = 5_u32;
    let y: Kilometers = 5;

    println!("x + y = {}", x + y);

    // Never type

    // This actually won't compile because the function is returning `()`
    // fn bar() -> ! {
    //     // Will never return
    // }

    for i in 0..10 {
        let _x = match i {
            i if i >= 5 => i,
            _ => continue, // `continue` has a never type
        };
    }

    let _x = match Some(10) {
        Some(x) => x,
        None => panic!("error"), // `panic!` also has a never type
    };

    // `loop` also has a never type unless it contains a break statement

    // Dinamically sized types

    // This is not possible the compile can't figure out its size
    // let s1: str = "Hello there!";

    // So, we put it behind a reference, which has a known size,
    // in this case a memory address and a lenght (both are usize)
    let _s1: &str = "Hello there!";

    // Generics are by default sized, but we can turn this restriction off
    // with this special syntax (only works for `Sized`)
    fn foo<T: ?Sized>(_t: &T) {}
}

// Newtype Pattern
struct Wrapper(Vec<String>);

// This is not possible, hence the newtype pattern
// impl Display for Vec<String> {}

impl fmt::Display for Wrapper {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(f, "[{}]", self.0.join(", "))
    }
}
