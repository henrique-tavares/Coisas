mod advanced_functions_and_closures;
mod advanced_traits;
mod advanced_types;
mod declarative_macros;
mod procedural_macros;
mod unsafe_rust;

fn main() {
    unsafe_rust::exec();
    println!();
    advanced_types::exec();
    println!();
    advanced_functions_and_closures::exec();
    println!();
    declarative_macros::exec();
    println!();
    procedural_macros::exec();
}
