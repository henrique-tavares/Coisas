use std::{
    sync::{Arc, Mutex},
    thread::{self, JoinHandle},
};

pub fn exec() {
    let m = Mutex::new(5);

    println!("m before = {:?}", m);

    {
        let mut num = m.lock().unwrap();
        *num += 1;
    }

    println!("m before = {:?}", m);

    let counter = Arc::new(Mutex::new(0));

    let handlers = (1..=100)
        .map(|i| {
            let counter = Arc::clone(&counter);
            thread::spawn(move || {
                let mut num = counter.lock().unwrap();

                *num += 1;
                println!("thread #{} | counter = {}", i, num);
            })
        })
        .collect::<Vec<JoinHandle<_>>>();

    for handle in handlers {
        handle.join().unwrap();
    }
}
