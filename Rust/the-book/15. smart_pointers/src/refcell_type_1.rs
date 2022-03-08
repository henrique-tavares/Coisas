#![allow(dead_code)]

pub trait Messenger {
    fn send(&self, msg: &str);
}

pub struct LimitTracker<'a, T: Messenger> {
    messenger: &'a T,
    value: usize,
    max: usize,
}

impl<'a, T> LimitTracker<'a, T>
where
    T: Messenger,
{
    pub fn new(messenger: &T, max: usize) -> LimitTracker<T> {
        LimitTracker {
            messenger,
            value: 0,
            max,
        }
    }

    pub fn set_value(&mut self, value: usize) {
        self.value = value;

        let percentage_of_max = self.value as f64 / self.max as f64;
        match percentage_of_max {
            p if p >= 1.0 => self.messenger.send("Error: you are over your quota!"),
            p if p >= 0.9 => self
                .messenger
                .send("Urgent warning: you've used over 90% of your quota!"),
            p if p >= 0.75 => self
                .messenger
                .send("Warning: you've used over 75% of your quota!"),
            _ => (),
        }
    }
}

mod tests {
    use std::cell::RefCell;

    use super::*;

    struct MockMessenger {
        // RefCells allows immutable or mutable borrows checked at runtime.
        sent_messages: RefCell<Vec<String>>,
    }

    impl MockMessenger {
        fn new() -> Self {
            Self {
                sent_messages: RefCell::new(vec![]),
            }
        }
    }

    impl Messenger for MockMessenger {
        // RefCell allows us to do a mutable borrow even when
        // the RefCell is immutable
        fn send(&self, msg: &str) {
            self.sent_messages.borrow_mut().push(String::from(msg));
        }
    }

    #[test]
    fn it_sends_an_over_75_percent_warning_message() {
        let mock_messager = MockMessenger::new();
        let mut limit_tracker = LimitTracker::new(&mock_messager, 100);

        limit_tracker.set_value(80);

        assert_eq!(mock_messager.sent_messages.borrow().len(), 1);
    }
}
