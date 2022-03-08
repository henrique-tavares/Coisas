use std::{
    cell::RefCell,
    rc::{Rc, Weak},
};

pub fn exec() {
    exec1();
    println!();
    exec2();
}

#[derive(Debug)]
enum List<T> {
    Cons(T, RefCell<Rc<Self>>),
    Nil,
}

use List::*;

impl<T> List<T> {
    fn tail(&self) -> Option<&RefCell<Rc<Self>>> {
        match self {
            Cons(_, item) => Some(item),
            Nil => None,
        }
    }
}

fn exec1() {
    let a = Rc::new(Cons(5, RefCell::new(Rc::new(Nil))));

    println!("a initial rc count = {}", Rc::strong_count(&a));
    println!("a next item = {:?}", a.tail());

    let b = Rc::new(Cons(10, RefCell::new(Rc::clone(&a))));

    println!("a rc count after b creation = {}", Rc::strong_count(&a));
    println!("b initial rc count = {}", Rc::strong_count(&b));

    if let Some(link) = a.tail() {
        *link.borrow_mut() = Rc::clone(&b);
    }

    println!("b rc count after changing a = {}", Rc::strong_count(&b));
    println!("a rc count after changing a = {}", Rc::strong_count(&a));

    // Uncomment the next line to see that we have a cycle;
    // it will overflow the stack
    // println("a next item = {:?}", a.tail());
    // This happens because a contains b that contains a and it goes on forever.
}

#[derive(Debug)]
struct Node {
    value: i32,
    parent: RefCell<Weak<Self>>,
    children: RefCell<Vec<Rc<Node>>>,
}
// A Weak smart pointer is basically a Rc smart pointer, but
// is contains non-owned data, what this means is as does not intefere
// on when the original data should be dropped.
// This makes sense because a child node shouldn't own its parent,
// If a child is dropped its parent remains.

fn exec2() {
    let leaf = Rc::new(Node {
        value: 5,
        parent: RefCell::new(Weak::new()),
        children: RefCell::new(vec![]),
    });

    println!(
        "leaf strong = {}, weak = {}",
        Rc::strong_count(&leaf),
        Rc::weak_count(&leaf)
    );

    {
        let branch = Rc::new(Node {
            value: 10,
            parent: RefCell::new(Weak::new()),
            children: RefCell::new(vec![Rc::clone(&leaf)]),
        });

        *leaf.parent.borrow_mut() = Rc::downgrade(&branch);

        println!(
            "branch strong = {}, weak = {}",
            Rc::strong_count(&branch),
            Rc::weak_count(&branch)
        );

        println!("leaf parent = {:?}", leaf.parent.borrow().upgrade());
        println!(
            "leaf strong = {}, weak = {}",
            Rc::strong_count(&leaf),
            Rc::weak_count(&leaf)
        );
    }

    println!("leaf parent = {:?}", leaf.parent.borrow().upgrade());
    println!(
        "leaf strong = {}, weak = {}",
        Rc::strong_count(&leaf),
        Rc::weak_count(&leaf)
    );
}
