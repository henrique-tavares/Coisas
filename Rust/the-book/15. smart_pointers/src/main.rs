mod box_type;
mod deref_trait;
mod drop_trait;
mod rc_type;
mod refcell_type_1;
mod refcell_type_2;
mod reference_cycles;

fn main() {
    box_type::exec();
    println!();
    deref_trait::exec();
    println!();
    drop_trait::exec();
    println!();
    rc_type::exec();
    println!();
    refcell_type_2::exec();
    println!();
    reference_cycles::exec();
}
