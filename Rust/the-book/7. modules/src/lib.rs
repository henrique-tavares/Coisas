#![allow(dead_code)]

mod back_of_house;
mod front_of_house;

fn eat_at_restaurant() {
    // Absolute path
    crate::front_of_house::hosting::add_to_waitlist();

    // Relative path
    self::front_of_house::hosting::add_to_waitlist();
    front_of_house::hosting::add_to_waitlist();
}

// use crate::front_of_house::hosting;
// use self::front_of_house::hosting;
use front_of_house::hosting;

fn eat_at_restaurant_2() {
    hosting::add_to_waitlist()
}

fn eat_breakfast() {
    let mut meal = back_of_house::Breakfast::summer("Rye");
    meal.toast = String::from("Wheat");
}

fn serve_order() {}
