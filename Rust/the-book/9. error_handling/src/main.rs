use std::{error::Error, fs};

mod panic;
mod question_mark;
mod result;

fn main() -> Result<(), Box<dyn Error>> {
    panic::exec(false);
    println!();
    result::exec();
    println!();
    question_mark::exec();
    println!();

    let _f = fs::read_to_string("hello.txt")?;

    Ok(())
}
