use unicode_segmentation::UnicodeSegmentation;

pub fn exec() {
    // Strings are stored as a collection of UTF-8 encoded bytes
    let _s1 = String::new();
    let _s2 = "initial contents";
    let _s3 = _s2.to_string();
    let _s4 = String::from("initial contents");

    let mut s = String::from("foo");
    s.push_str("bar");
    s.push(' ');
    s += "foobaz";
    println!("{}", s);

    let s1 = String::from("Hello, ");
    let s2 = String::from("world!");
    let s3 = s1 + &s2;
    println!("{}", s3);

    let s1 = String::from("hello");
    let s2 = String::from("world");
    let s3 = format!("{}, {}!", s1, s2);
    println!("{}\n", s3);

    let hello = String::from("नमस्ते");

    // Bytes
    // [224, 164, 168, 224, 164, 174, 224, 164, 184, 224, 165, 141, 224, 164, 164, 224, 165, 135]
    for b in hello.as_bytes() {
        println!("{}", b);
    }
    println!();

    // Chars
    // ['न', 'म', 'स', '्', 'त', 'े']
    for c in hello.chars() {
        println!("{}", c);
    }
    println!();

    // Graphemes
    // ["न", "म", "स्", "ते"]
    for g in hello.graphemes(true) {
        println!("{}", g);
    }
    println!();
}
