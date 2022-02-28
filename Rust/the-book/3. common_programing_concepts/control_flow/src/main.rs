fn main() {
    // IF Statements
    let number = 5;

    // IF conditions must be explicity a boolean
    if number < 10 {
        println!("first condition was true");
    } else if number < 22 {
        println!("second condition was true");
    } else {
        println!("all conditions were false")
    }

    let condition = true;
    let number = if condition { 5 } else { 6 };
    println!(
        "The value of condition and number were: {:?}",
        (condition, number)
    );
    println!();

    // Loop
    loop {
        println!("again!");
        break;
    }
    println!();

    let mut counter = 0;
    let result = loop {
        counter += 1;

        if counter == 10 {
            break counter; // Loops may return values
        }
    };
    println!("The value of result is: {}\n", result);

    // While
    let mut number = 3;
    while number != 0 {
        println!("{}!", number);

        number -= 1;
    }
    println!("LIFTOFF!\n");

    // For or For In
    let arr = [10, 20, 30, 40, 50];
    for elem in arr {
        println!("The current value is: {}", elem)
    }
    println!();

    // x..y => Exclusive range | x..=y => Inclusive range
    for num in 0..10 {
        println!("{}!", num);
    }
}
