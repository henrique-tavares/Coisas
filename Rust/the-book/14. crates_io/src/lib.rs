//! # Art
//!
//! A library for modeling artistic concepts

pub use kinds::{PrimaryColor, SecondaryColor};
pub use utils::mix;

pub mod kinds {
    #[derive(Debug, PartialEq)]
    /// The primary colors according to the RYB coloer model
    pub enum PrimaryColor {
        Red,
        Yellow,
        Blue,
    }

    #[derive(Debug, PartialEq)]
    /// The secondary colors according to the RYB coloer model
    pub enum SecondaryColor {
        Orange,
        Green,
        Purple,
    }
}

pub mod utils {
    use crate::kinds::{
        PrimaryColor::{self, *},
        SecondaryColor::{self, *},
    };

    /// Combines two primary colors in equal amounts to create a secondary color
    ///
    /// # Examples
    ///
    /// ```
    /// use henrique_art_test::{kinds::*, utils::*};
    ///
    /// let red = PrimaryColor::Red;
    /// let blue = PrimaryColor::Blue;
    ///
    /// assert_eq!(SecondaryColor::Purple, mix(red, blue).unwrap())
    /// ```
    ///
    /// # Errors
    ///
    /// It returns an error when the mix does not produce a secondary color
    /// e.g. red + red == red
    pub fn mix(c1: PrimaryColor, c2: PrimaryColor) -> Result<SecondaryColor, &'static str> {
        match (c1, c2) {
            (Red, Yellow) | (Yellow, Red) => Ok(Orange),
            (Red, Blue) | (Blue, Red) => Ok(Purple),
            (Yellow, Blue) | (Blue, Yellow) => Ok(Green),
            _ => Err("This mix does not produce a secondary color"),
        }
    }
}
