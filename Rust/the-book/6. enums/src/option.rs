pub fn exec() {
    /*
     enum Option<T> {
         Some(T),
         None,
     }
    */

    let some_number = Some(5);
    let some_string = Some("a string");
    let absent_number: Option<i32> = None;
    println!("some_number = {:?}", some_number);
    println!("some_string = {:?}", some_string);
    println!("absent_number = {:?}", absent_number);

    let x = 5;
    let y = Some(5);
    let _sum = x + y.unwrap_or(0);
}
