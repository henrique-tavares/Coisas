use std::{env, error::Error, fs};

pub fn run(config: Config) -> Result<(), Box<dyn Error>> {
    let contents = fs::read_to_string(config.filename)?;

    let queried_lines = match config.case_sensitive {
        true => search(config.query, &contents),
        false => search_case_insensitive(config.query, &contents),
    };

    if queried_lines.is_empty() {
        println!(
            "The term: {:?} was not found in the file: {:?}",
            config.query, config.filename
        );
        return Ok(());
    }

    for line in queried_lines {
        println!("{}", line);
    }
    Ok(())
}

pub fn search<'a>(query: &str, contents: &'a str) -> Vec<&'a str> {
    contents
        .lines()
        .filter(|&line| line.contains(query))
        .collect::<Vec<&str>>()
}

pub fn search_case_insensitive<'a>(query: &str, contents: &'a str) -> Vec<&'a str> {
    let query_lowercase = query.to_lowercase();

    contents
        .lines()
        .filter(|&line| line.to_lowercase().contains(&query_lowercase))
        .collect::<Vec<&str>>()
}

pub struct Config<'a> {
    pub query: &'a String,
    pub filename: &'a String,
    pub case_sensitive: bool,
}

impl<'a> Config<'a> {
    pub fn new(args: &'a [String]) -> Result<Self, &str> {
        let query = args
            .get(1)
            .ok_or_else(|| "Missing first argument: The searching term")?;

        let filename = args
            .get(2)
            .ok_or_else(|| "Missing second argument: The file path")?;

        let case_sensitive = env::var("CASE_INSENSITIVE").is_err();

        Ok(Self {
            query,
            filename,
            case_sensitive,
        })
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn case_sensitive() {
        let query = "duct";
        let contents = r#"\
Rust:
safe, fast, productive
Pick three.
Duct tape"#;

        assert_eq!(vec!["safe, fast, productive"], search(query, contents));
    }

    #[test]
    fn case_insensitive() {
        let query = "rUsT";
        let contents = r#"\
Rust:
safe, fast, productive
Pick three.
Trust me"#;

        assert_eq!(
            vec!["Rust:", "Trust me"],
            search_case_insensitive(query, contents)
        );
    }
}
