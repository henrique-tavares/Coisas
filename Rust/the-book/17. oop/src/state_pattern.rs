pub fn exec() {
    let mut post = Post::new();

    post.modify_text("I ate a salad for lunch today");
    println!("content = {}", post.content());

    post.request_review();
    println!("content = {}", post.content());

    post.approve();
    println!("content = {}", post.content());
}

struct Post {
    content: String,
    state: Option<Box<dyn State>>,
}

impl Post {
    pub fn new() -> Self {
        Self {
            content: String::from(""),
            state: Some(Box::new(Draft {})),
        }
    }

    pub fn modify_text(&mut self, text: &str) {
        self.content = String::from(text);
    }

    pub fn content(&self) -> &str {
        if self.state.as_ref().unwrap().can_get_content() {
            &self.content
        } else {
            ""
        }
    }

    pub fn request_review(&mut self) {
        if let Some(state) = self.state.take() {
            if state.can_request_review() {
                self.state = Some(state.next());
            }
        }
    }

    pub fn approve(&mut self) {
        if let Some(state) = self.state.take() {
            if state.can_approve() {
                self.state = Some(state.next());
            }
        }
    }
}

#[derive(Debug)]
struct Draft {}

#[derive(Debug)]
struct PendingReview {}

#[derive(Debug)]
struct Published {}

trait State {
    fn can_request_review(&self) -> bool {
        false
    }

    fn can_approve(&self) -> bool {
        false
    }

    fn can_get_content(&self) -> bool {
        false
    }

    fn prev(self: Box<Self>) -> Box<dyn State>;
    fn next(self: Box<Self>) -> Box<dyn State>;
}

impl State for Draft {
    fn prev(self: Box<Self>) -> Box<dyn State> {
        self
    }

    fn next(self: Box<Self>) -> Box<dyn State> {
        Box::new(PendingReview {})
    }

    fn can_request_review(&self) -> bool {
        true
    }
}

impl State for PendingReview {
    fn prev(self: Box<Self>) -> Box<dyn State> {
        Box::new(Draft {})
    }

    fn next(self: Box<Self>) -> Box<dyn State> {
        Box::new(Published {})
    }

    fn can_approve(&self) -> bool {
        true
    }
}

impl State for Published {
    fn prev(self: Box<Self>) -> Box<dyn State> {
        Box::new(PendingReview {})
    }

    fn next(self: Box<Self>) -> Box<dyn State> {
        self
    }

    fn can_get_content(&self) -> bool {
        true
    }
}
