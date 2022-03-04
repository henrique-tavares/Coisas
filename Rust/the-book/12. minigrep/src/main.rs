use std::{env, process};

use colored::Colorize;
use minigrep::Config;

fn main() {
    let args = env::args().collect::<Vec<String>>();

    let config = Config::new(&args).unwrap_or_else(|err| {
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
