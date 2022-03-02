pub fn exec() {
    let _a = [1, 2, 3];

    let mut v = Vec::new();
    v.push(1);
    v.push(2);
    v.push(3);

    {
        let _v2 = vec![1, 2, 3];
        // Both the vector and its values will be dropped once its owner goes out of scope
    }

    let mut v = vec![1, 2, 3, 4, 5];

    let third = &v[2];
    // let a = &v[20]; => This will panic!
    println!("The third element is: {}", third);

    match v.get(2) {
        Some(third) => println!("The third element is: {}", third),
        None => println!("There is no thrid element."),
    }

    if let Some(tenth) = v.get(10) {
        println!("The tenth element is: {}", tenth);
    } else {
        println!("There is no tenth element.");
    }

    println!("{:?}", v);

    for i in v.iter_mut() {
        *i += 50;
    }

    for i in v.iter() {
        println!("{}", i);
    }

    enum SpreadsheetCell {
        Int(i32),
        Float(f64),
        Text(String),
    }

    let row = vec![
        SpreadsheetCell::Int(3),
        SpreadsheetCell::Text(String::from("Blue")),
        SpreadsheetCell::Float(10.12),
    ];

    match row.get(1) {
        Some(cell) => match cell {
            SpreadsheetCell::Int(i) => println!("{}", i),
            _ => println!("Not a integer!"),
        },
        None => (),
    }
}
