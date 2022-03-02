mod control_flow;
mod data_types;
mod functions;
mod variables;

fn main() {
    variables::exec();
    println!();
    data_types::exec();
    println!();
    control_flow::exec();
    println!();
    functions::exec();
}
