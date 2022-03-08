#[derive(Debug)]
enum Node<T> {
    Cons(T, Box<Self>),
    Nil,
}
use Node::*;

#[derive(Debug)]
struct List<T> {
    head: Node<T>,
    len: u32,
}

impl<T> List<T> {
    fn new(mut data: Vec<T>) -> Self {
        let mut node: Node<T> = Nil;
        let len = data.len() as u32;

        data.reverse();
        for elem in data {
            node = Cons(elem, Box::new(node));
        }

        Self { head: node, len }
    }
}

pub fn exec() {
    let list = List::new(vec![1, 2, 3, 4]);

    println!("{:?}", list);
}
