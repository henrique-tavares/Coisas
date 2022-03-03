mod generics;
mod lifetimes;
mod traits;

fn main() {
    generics::exec();
    println!();
    traits::exec();
    println!();
    lifetimes::exec();
}
