fn main() {
    // Onwership rules:
    //  1. Each value in Rust has a variable that's called its owner.
    //  2. There can be only one owner at a time.
    //  3. When the owner goes out of scope, the value will be dropped.

    // s is not valid here, it's not yet declared
    {
        let _s = String::from("hello");
        // do stuff with s
    }
    // this scope is now over, and s is no longer valid

    let x = 5; // Variable (value in stack)
    let _y = x; // Copy

    let s1 = String::from("hello"); // Pointer Variable (value in heap)
    let _s2 = s1; // Move (neither shallow nor deep copy), s1 is now invalid

    // println!("{}, world", s1); => Invalid (borrow after move)

    let s1 = String::from("hello");
    let _s2 = s1.clone(); // Explicit copy

    println!("{}, world", s1);

    let s = String::from("hello");
    takes_ownership(s); // Move occurs

    // println!("{}", s); => Invalid

    let x = 5;
    makes_copy(x); // Copy occurs
    println!("{}", x); // Valid

    let s1 = gives_ownership();
    let s2 = String::from("hello");
    let s2 = takes_and_gives_back(s2);
    println!("s1 = {}, s2 = {}", s1, s2);

    let s1 = String::from("hello");
    let len = calculate_length(&s1);
    println!("The lenght of '{}' is {}", s1, len);

    let mut s1 = String::from("hello");
    change(&mut s1);
    println!("mut s1 = {}", s1);

    // The rules of references
    //  1. At any given time, you can have either one mutabel reference
    //  or any number of immutable references.
    //
    //  2. References must always be valid.

    #[allow(unused_mut)]
    let mut s1 = String::from("hello world");
    let word = first_word(&s1);
    // s1.clear(); => Invalid, because there is a immutable reference
    println!("s1 = {}, word = {}", s1, word);
}

fn takes_ownership(some_string: String) {
    println!("{}", some_string);
}

fn makes_copy(some_integer: i32) {
    println!("{}", some_integer);
}

fn gives_ownership() -> String {
    let some_string = String::from("hello");

    some_string
}

fn takes_and_gives_back(a_string: String) -> String {
    a_string
}

// Without references
// fn calculate_length(s: String) -> (String, usize) {
//     (s, s.len())
// }

// With references (basically a pointer to a variable)
// References don't take ownership
fn calculate_length(s: &String) -> usize {
    s.len()
}

fn change(some_string: &mut String) {
    some_string.push_str(", world");
}

fn first_word(s: &str) -> &str {
    for (i, b) in s.bytes().enumerate() {
        if b == b' ' {
            return &s[0..i];
        }
    }

    &s[..]
}
