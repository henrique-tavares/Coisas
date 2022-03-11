// There are three types of porcedual macros:
// - Custom derive macros
// - Atribute-like macros
// - Function-like macros

// Custom derive macros
use hello_macro::HelloMacro;
use hello_macro_derive::HelloMacro;

#[derive(HelloMacro)]
struct Pancakes;

pub fn exec() {
    Pancakes::hello_macro();
}

// Attribute-like macros
// #[route(GET, "/")]
// fn index() {
//     // ...
// }

// #[proc_macro_attribute]
// pub fn route(attr: TokenStream, item: TokenStream) -> TokenStream {
//     // ...
// }

// Function-like macros
// let sql = sql!(SELECT * FROM posts WHERE id=1);

// #[proc_macro]
// pub fn sql(input: TokenStream) -> TokenStream {
//     // ...
// }
