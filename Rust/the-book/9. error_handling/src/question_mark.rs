use std::{
    fs::File,
    io::{self, Read},
};

pub fn exec() {
    match read_username_from_file_v1() {
        Ok(s) => println!("{}", s),
        Err(err) => println!("Problem opening file: {:?}", err),
    }

    match read_username_from_file_v2() {
        Ok(s) => println!("{}", s),
        Err(err) => println!("Problem opening file: {:?}", err),
    }
}

fn read_username_from_file_v1() -> Result<String, io::Error> {
    let mut f = match File::open("hello.txt") {
        Ok(file) => file,
        Err(err) => return Err(err),
    };

    let mut s = String::new();
    match f.read_to_string(&mut s) {
        Ok(_) => Ok(s),
        Err(err) => Err(err),
    }
}

fn read_username_from_file_v2() -> Result<String, io::Error> {
    let mut s = String::new();
    File::open("hello.txt")?.read_to_string(&mut s)?;
    Ok(s)
}
