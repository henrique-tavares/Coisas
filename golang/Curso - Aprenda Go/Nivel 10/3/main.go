package main

import (
	"fmt"
)

func main() {
	c := gen()
	receive(c)

	fmt.Println("about to exit")
}

func gen() <-chan int {
	c := make(chan int)

	go func(c chan<- int) {
		for i := 0; i < 100; i++ {
			c <- i
		}
		close(c)
	}(c)

	return c
}

func receive(c <-chan int) {
	for v := range c {
		fmt.Println(v)
	}
}
