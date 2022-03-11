use crate::{my_vec, s};
pub fn exec() {
    let v1 = my_vec![1, 2, 3, 4];
    let v2 = my_vec!["a", "b", "c"];

    println!("{:?}, {:?}", v1, v2);

    let s1 = s!("teste");
    let s2 = s!(42);

    print!("{}, {}", s1, s2);
}

#[macro_export]
macro_rules! my_vec {
    ($($x:expr),*) => {
        {
            let mut temp_vec = Vec::new();
            $(
                temp_vec.push($x);
            )*
            temp_vec
        }
    };
}

#[macro_export]
macro_rules! s {
    ($s:expr) => {
        format!("{}", $s)
    };
}
