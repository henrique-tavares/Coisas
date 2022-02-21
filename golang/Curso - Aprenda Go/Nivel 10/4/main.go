package main

import (
	"fmt"
)

func main() {
	quit := make(chan bool)
	c := gen(quit)

	receive(c, quit)

	fmt.Println("about to exit")
}

func gen(quit chan<- bool) <-chan int {
	c := make(chan int)

	go func() {
		for i := 0; i < 100; i++ {
			c <- i
		}
		quit <- true
	}()

	return c
}

func receive(c <-chan int, quit <-chan bool) {
	for {
		select {
		case v := <-c:
			fmt.Println(v)
		case <-quit:
			return
		}
	}
}
