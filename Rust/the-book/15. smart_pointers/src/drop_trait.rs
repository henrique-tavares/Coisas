struct CustomSmartPointer {
    data: String,
}

impl Drop for CustomSmartPointer {
    fn drop(&mut self) {
        println!("Dropping CustomSmartPoint with data: `{}`!", self.data);
    }
}

pub fn exec() {
    // Once variables go out of scope, they are automatically dropped
    // We can customize this behavior by implementing the Drop Trait

    let _c = CustomSmartPointer {
        data: String::from("my stuff"),
    };
    let _d = CustomSmartPointer {
        data: String::from("other stuff"),
    };
    let _e = CustomSmartPointer {
        data: String::from("useless stuff"),
    };
    println!("CustomSmartPointers created.");
    println!();

    drop(_e); // Early drop
    println!();

    // Note that: _e.drop() is not possible,
    // because it would cause a double-free.
}
