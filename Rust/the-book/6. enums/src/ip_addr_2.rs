#[derive(Debug)]
enum IpAddr {
    V4(u8, u8, u8, u8),
    V6(String),
}

pub fn exec() {
    let localhost_v4 = IpAddr::V4(127, 0, 0, 1);
    let localhost_v6 = IpAddr::V6(String::from("::1"));

    println!("localhost_v4 = {:?}", localhost_v4);
    println!("localhost_v6 = {:?}", localhost_v6);
}
