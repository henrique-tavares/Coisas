mod if_let;
mod ip_addr_1;
mod ip_addr_2;
mod match_expr;
mod option;

// Enum variants can be considered as structs:
/*
 enum Message {
    Quit, => Unit type struct
    Move { x: i32, y: i32 }, => Regular struct
    Write(String), => Tuple struct (single)
    ChangeColor(i32, i32, i32) => Tuple Struct (multiple)
 }

 impl Message {
     fn some_function() {
         ...
     }
 }
*/

fn main() {
    ip_addr_1::exec();
    println!();
    ip_addr_2::exec();
    println!();
    option::exec();
    println!();
    match_expr::exec();
    println!();
    if_let::exec();
}
