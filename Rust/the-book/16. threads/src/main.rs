mod creating;
mod messages;
mod sharing;

fn main() {
    creating::exec();
    println!();
    messages::exec();
    println!();
    sharing::exec();
}
