pub fn exec() {
    let x = Some(10);

    // matches are exhaustive
    match x {
        Some(num) => println!("match 1: {}", num),
        None => (),
    }

    // _ => Otherwise
    match x {
        Some(num) => println!("match 2: {}", num),
        _ => (),
    }

    // Basically syntax sugar for match above
    if let Some(num) = x {
        println!("match 3: {}", num);
    }
}
