pub fn exec() {
    // Scalar Data Types

    // Integers (defalut: i32)
    let a = 98_222; // Decimal
    let b = 0xff; // Hex
    let c = 0o77; // Octal
    let d = 0b_1111_0000; // Binary
    let e = b'A'; // Byte (u8 only)

    println!("The value of a is: {}", a);
    println!("The value of b is: {}", b);
    println!("The value of c is: {}", c);
    println!("The value of d is: {}", d);
    println!("The value of e is: {}", e);
    println!();

    // Floating-point Numbers (default: f64)
    let f = 2.0;
    let g: f32 = 3.0;

    println!("The value of f is: {}", f);
    println!("The value of g is: {}", g);
    println!();

    // Arithimetical Operators
    let sum = 5 + 10;
    let subtraction = 95.5 - 4.3;
    let multiplication = 4 * 30;
    let division = 56.7 / 32.2;
    let remainder = 43 % 5;

    println!("The value of sum is: {}", sum);
    println!("The value of subtraction is: {}", subtraction);
    println!("The value of multiplication is: {}", multiplication);
    println!("The value of division is: {}", division);
    println!("The value of remainder is: {}", remainder);
    println!();

    // Booleans
    let t = true;
    let f: bool = false;

    println!("The value of t is: {}", t);
    println!("The value of f is: {}", f);
    println!();

    // Character
    let c = 'c';
    let inf = '∞';
    let emoji = '👌';

    println!("The value of c is: {}", c);
    println!("The value of inf is: {}", inf);
    println!("The value of emoji is: {}", emoji);
    println!();

    // Compound Data Types

    // Tuples
    let tup = ("Let's get Rusty", 100_000);
    let (_channel, _sub_count) = tup;
    let _channel = tup.0;
    let _sub_count = tup.1;

    println!("The value of tup is: {:?}", tup);

    // Arrays
    let error_codes = [200, 404, 500];
    let _not_found = error_codes[1];

    let byte = [0; 8];

    println!("The value of error_codes is: {:?}", error_codes);
    println!("The value of byte is: {:?}", byte);
}
