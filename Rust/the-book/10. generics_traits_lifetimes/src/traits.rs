#![allow(dead_code, unused_variables)]

pub struct NewsArticle {
    pub author: String,
    pub headline: String,
    pub content: String,
}

impl Summary for NewsArticle {
    fn summarize_author(&self) -> String {
        format!("{}", self.author)
    }
}

pub struct Tweet {
    pub username: String,
    pub content: String,
    pub reply: bool,
    pub retweet: bool,
}

impl Summary for Tweet {
    fn summarize(&self) -> String {
        format!("@{}: {}", self.username, self.content)
    }

    fn summarize_author(&self) -> String {
        format!("@{}", self.username)
    }
}

pub trait Summary {
    fn summarize_author(&self) -> String;

    fn summarize(&self) -> String {
        format!("(Read more from {}...)", self.summarize_author())
    }
}

pub fn notify(item: &impl Summary) {
    println!("Breaking news! {}", item.summarize())
}

// Implementation above is basically syntax sugar for:
// pub fn notify<T: Summary>(item: &T)
// However, you shouldn't always use that:
// pub fn notify(item1: &(impl Summary + Display), item2: &(impl Summary + Display))
// pub fn notify<T: Summary + Display>(item1: &T, item2: &2)
// In the first one: item1 and item2 may be of different types
// while on the second one they are of the same type

use std::fmt::{Debug, Display};

fn function_without_where<T: Display + Clone, U: Clone + Debug>(t: &T, u: &U) -> i32 {
    42
}

fn function_with_where<T, U>(t: &T, u: &U) -> i32
where
    T: Display + Clone,
    U: Clone + Debug,
{
    42
}

// Even though it returns a type that implements Summary, it must return a unique concrete type
fn returns_summerizable() -> impl Summary {
    Tweet {
        username: String::from("horse_ebooks"),
        content: String::from("of course, as you probably already know, people"),
        reply: false,
        retweet: false,
    }
}

struct Pair<T> {
    x: T,
    y: T,
}

impl<T> Pair<T> {
    fn new(x: T, y: T) -> Self {
        Self { x, y }
    }
}

impl<T: Display + PartialOrd> Pair<T> {
    fn cmp_display(&self) {
        if self.x >= self.y {
            println!("The largest number is x = {}", self.x);
        } else {
            println!("The largest number is y = {}", self.y);
        }
    }
}

trait Useless {
    fn useless_method(&self) -> String {
        format!("I'm a useless method")
    }
}
// Blanket implementations
impl<T: Display> Useless for T {}

pub fn exec() {
    let tweet = Tweet {
        username: String::from("johndoe"),
        content: String::from("Hello world!"),
        reply: false,
        retweet: false,
    };

    let article = NewsArticle {
        author: String::from("John Doe"),
        headline: String::from("The Sky is falling!"),
        content: String::from("The sky is not actually falling."),
    };

    println!("Tweet summary: {}", tweet.summarize());
    println!("Article summary: {}", article.summarize());

    notify(&tweet);

    println!("{}", returns_summerizable().summarize());

    println!(
        "{}, {}, {}",
        10.useless_method(),
        3.14.useless_method(),
        "aaa".useless_method()
    )
}
