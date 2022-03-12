pub fn build_response(http_status_line: &str, contents: String) -> String {
    format!(
        "{}\r\nContent-Length: {}\r\n\r\n{}",
        http_status_line,
        contents.len(),
        contents
    )
}
