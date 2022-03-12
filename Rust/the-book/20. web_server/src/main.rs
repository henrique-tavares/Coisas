mod lib;
mod routes;
mod utils;

use std::io::prelude::*;
use std::net::{TcpListener, TcpStream};

use lib::threadpool::ThreadPool;

fn main() {
    let listener = TcpListener::bind("localhost:7878").unwrap();

    let pool = ThreadPool::new(5).unwrap();

    for stream in listener.incoming() {
        let stream = stream.unwrap();

        pool.execute(move || {
            handle_connection(stream);
        });
    }
}

fn handle_connection(mut stream: TcpStream) {
    let mut buffer = [0_u8; 1024];

    stream.read(&mut buffer).unwrap();
    // println!("Request: {}\n", String::from_utf8_lossy(&buffer));

    let response = if buffer.starts_with(b"GET / HTTP/1.1\r\n") {
        routes::index().unwrap()
    } else if buffer.starts_with(b"GET /sleep HTTP/1.1\r\n") {
        routes::sleep().unwrap()
    } else {
        routes::not_found().unwrap()
    };

    stream.write(response.as_bytes()).unwrap();
    stream.flush().unwrap();
}
