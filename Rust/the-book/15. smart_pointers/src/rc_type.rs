use std::rc::Rc;

#[derive(Debug)]
enum List<T> {
    Cons(T, Rc<Self>),
    Nil,
}

use List::*;

pub fn exec() {
    let a = Rc::new(Cons(5, Rc::new(Cons(10, Rc::new(Nil)))));
    println!("{:?} | count = {}", a, Rc::strong_count(&a));

    let b = Cons(3, Rc::clone(&a));
    println!("{:?} | count = {}", b, Rc::strong_count(&a));

    let c = Cons(4, Rc::clone(&a));
    println!("{:?} | count = {}", c, Rc::strong_count(&a));

    // Rc (Reference Count) Smart Pointers allow for multiple variables
    // to own the same data, and the underlying data is only dropped once
    // all of its references are already dropped.
    // Note that, this is read-only and single-threaded.
}
