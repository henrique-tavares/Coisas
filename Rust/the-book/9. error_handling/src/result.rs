use std::{fs::File, io::ErrorKind};

pub fn exec() {
    /*
       enum Result<T, E> {
           Ok(T),
           Err(E),
       }
    */

    let _f = match File::open("hello.txt") {
        Ok(file) => file,
        Err(error) => match error.kind() {
            ErrorKind::NotFound => match File::create("hello.txt") {
                Ok(file) => file,
                Err(err) => panic!("Problem creating the file: {:?}", err),
            },
            other_error => panic!("Problem opening the file: {:?}", other_error),
        },
    };

    // Using closures
    let _f = File::open("hello.txt").unwrap_or_else(|err| {
        if err.kind() == ErrorKind::NotFound {
            File::create("hello.txt").unwrap_or_else(|err| {
                panic!("Problem creating the file: {:?}", err);
            })
        } else {
            panic!("Problem opening the file: {:?}", err)
        }
    });
}
