#[derive(Debug)]
#[allow(dead_code)]
enum UsState {
    Alabama,
    Alaska,
    Arizona,
    Arkansas,
    California,
    // ...
}

#[allow(dead_code)]
enum Coin {
    Penny,
    Nickel,
    Dime,
    Quarter(UsState),
}

pub fn exec() {
    let coin = Coin::Quarter(UsState::Alaska);
    value_in_cents(coin);
}

fn value_in_cents(coin: Coin) -> u8 {
    match coin {
        Coin::Penny => 1,
        Coin::Nickel => 5,
        Coin::Dime => 10,
        Coin::Quarter(state) => {
            println!("State quarter from {:?}!", state);
            25
        }
    }
}
