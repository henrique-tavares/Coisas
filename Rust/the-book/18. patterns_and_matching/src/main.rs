#![allow(dead_code, unused_variables)]

mod pattern_syntax;

fn main() {
    // Match Expressions

    #[derive(Debug)]
    enum Language {
        English,
        Spanish,
        Russian,
        Japanese,
    }

    let language = Language::English;

    match language {
        Language::English => println!("Hello world!"),
        Language::Spanish => println!("Hola mundo!"),
        Language::Russian => println!("Привет мир!"),
        other_lang => println!("Unsupported language: {:?}", other_lang),
    }

    // Conditional if let expressions

    let authorization_status: Option<&str> = None;
    let is_admin = false;
    let group_id = "34".parse::<u8>();

    if let Some(status) = authorization_status {
        println!("Authorization status: {}", status);
    } else if is_admin {
        println!("Authorization status: admin");
    } else if let Ok(group_id) = group_id {
        if group_id > 30 {
            println!("Authorization status: privileged");
        } else {
            println!("Authorization status: baisc");
        }
    } else {
        println!("Authorization status: guest");
    }

    // While let conditional loops

    let mut stack = Vec::new();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    while let Some(top) = stack.pop() {
        println!("{}", top);
    }

    // For loops

    let v = vec!['a', 'b', 'c'];

    for (index, value) in v.iter().enumerate() {
        print!("{} is at index {}", value, index);
    }

    // Let statements

    let x = 5;

    // let PATTERN = EXPRESSION;

    let (x, y, _) = (1, 2, 3);

    // Function parameters
    fn print_coordinates(&(x, y): &(i32, i32)) {
        println!("Current location: ({}, {})", x, y);
    }

    let point = (3, 5);
    print_coordinates(&point);

    // Irrefutable
    let x = 5;

    // Refutable
    let x: Option<&str> = None;
    if let Some(x) = x {
        println!("{}", x);
    }

    // Can only accept irrefutable patterns:
    // function parameters
    // let statements
    // for loops
}
