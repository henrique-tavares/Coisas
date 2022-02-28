fn main() {
    my_function();

    let a = sum(11, 22);
    println!("The value of a is: {}", a);
}

fn my_function() {
    println!("Another function!");
}

fn sum(x: i32, y: i32) -> i32 {
    // return x + y;
    x + y
}
// Statements end with ";", expressions don't
// Expressions return values, statements don't
