mod encapsulation;
mod state_pattern;
mod trait_objects;

fn main() {
    trait_objects::exec();
    println!();
    state_pattern::exec();
}
