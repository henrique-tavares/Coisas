use std::{fs, io, thread, time::Duration};

use crate::utils::build_response;

pub fn index() -> Result<String, io::Error> {
    let contents = fs::read_to_string("index.html")?;

    Ok(build_response("HTTP/1.1 200 OK", contents))
}

pub fn not_found() -> Result<String, io::Error> {
    let contents = fs::read_to_string("404.html")?;

    Ok(build_response("HTTP/1.1 404 NOT FOUND", contents))
}

pub fn sleep() -> Result<String, io::Error> {
    thread::sleep(Duration::from_secs(5));
    index()
}
