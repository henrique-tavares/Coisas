pub struct Breakfast {
    pub toast: String,
    seasonal_fruit: String,
}

impl Breakfast {
    pub fn summer(toast: &str) -> Breakfast {
        Breakfast {
            toast: String::from(toast),
            seasonal_fruit: String::from("peaches"),
        }
    }
}

// If the enum is pub, all of its variants are pub as well
pub enum Appetizer {
    Soup,
    Salad,
}

pub fn fix_incorrect_order() {
    cook_order();
    super::serve_order();
}

fn cook_order() {}
