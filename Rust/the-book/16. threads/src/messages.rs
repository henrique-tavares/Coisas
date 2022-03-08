use std::{sync::mpsc::channel, thread, time::Duration};

pub fn exec() {
    let (sender, receiver) = channel::<String>();
    let sender2 = sender.clone();

    thread::spawn(move || {
        let msgs = vec![
            String::from("hi"),
            String::from("from"),
            String::from("the"),
            String::from("thread"),
        ];

        for msg in msgs {
            sender.send(msg).unwrap();
            thread::sleep(Duration::from_secs(1));
        }
    });

    thread::spawn(move || {
        let msgs = vec![
            String::from("more"),
            String::from("messages"),
            String::from("for"),
            String::from("you"),
        ];

        for msg in msgs {
            sender2.send(msg).unwrap();
            thread::sleep(Duration::from_secs(1));
        }
    });

    for val in receiver {
        println!("Got: {}", val);
    }
}
