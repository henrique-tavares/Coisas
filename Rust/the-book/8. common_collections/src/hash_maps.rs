use std::collections::HashMap;

pub fn exec() {
    let mut scores = HashMap::new();
    scores.insert(String::from("Blue"), 10);
    scores.insert(String::from("Yellow"), 50);

    scores.insert(String::from("Blue"), 20);

    scores.entry(String::from("Yellow")).or_insert(30);

    scores.entry(String::from("Red")).or_insert(30);
    scores.entry(String::from("Red")).or_insert(30);

    println!("{:?}", scores);

    if let Some((team_name, score)) = scores.get_key_value("Red") {
        println!("Team {} has {} points!", team_name, score);
    }

    for (k, v) in scores.iter() {
        println!("{}: {}", k, v);
    }

    let text = "hello world wonderfull world";

    let mut map = HashMap::new();

    for word in text.split_whitespace() {
        let count = map.entry(word).or_insert(0);
        *count += 1;
    }

    println!("{:?}", map);
}
