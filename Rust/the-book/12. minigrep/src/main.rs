use std::{env, process};

use colored::Colorize;
use minigrep::Config;

fn main() {
    let config = Config::new(env::args()).unwrap_or_else(|err| {
        eprintln!("[{}] {}", "ERROR".red(), err);
        process::exit(1);
    });

    println!("Searching for: {:?}", config.query);
    println!("In file: {:?}", config.filename);

    if let Err(e) = minigrep::run(config) {
        eprintln!("[{}] Aplication error: {}", "ERROR".red(), e);
        process::exit(1);
    };
}
