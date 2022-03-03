#![allow(dead_code, unused_variables)]

struct ImportantExerpt<'a> {
    part: &'a str,
}

impl<'a> ImportantExerpt<'a> {
    fn return_part(&self, announcement: &str) -> &str {
        println!("Attention please: {}", announcement);
        self.part
    }
}

pub fn exec() {
    /*  Little explanation on the borrow checker:
        let r;                 ---------+-- 'a
        {                      -+-- 'b  |
            let x = 5;          |       |
            r = &x;             |       |
        }                      -+       |
        println!("r = {}", r); ---------|
    */

    let string1 = "abcd";
    let string2 = "xyz";

    let result = longest(string1, string2);
    println!("The longest string is: {}", result);

    let novel = String::from("Call me Ishmal. Some years ago...");
    let first_sentence = novel.split('.').next().unwrap().trim();
    let _i = ImportantExerpt {
        part: first_sentence,
    };
    // Now this struct will live as long as its references will
    // in this case "novel" (_i.path -> first_sentence -> novel)

    let s: &'static str = "I have a static lifetime";
    // By default all string literals have a static lifetime
}

// &i32        => a reference
// &'a i32     => a reference with an explicit lifetime
// &'a mut i32 => a mutable reference with an explicit lifetime

// This lifetime relashionship states the following:
// the lifetime of the return value will be the same
// as the smallest lifetime between the parameters
// NOTE: the lifetime of a return value always must be tied
// to a paramenter lifetime
fn longest<'a>(x: &'a str, y: &'a str) -> &'a str {
    if x.len() > y.len() {
        x
    } else {
        y
    }
}

// Lifetime Elision
// 1. Each parameter that is a reference gets its own lifetime parameter
// 2. If there is exactly on input lifetime paremeter,
// that lifetime is assigned to all output lifetime paramenters
// 3. If there are multiple input lifetime parameters, but one of them
// is &self ou &mut self the lifetime of self is assigned to all
// output lifetime parameters.
