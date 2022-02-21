package main

import (
	"fmt"
	"math/rand"
)

func main() {
	c := make(chan int)

	go func() {
		for i := 0; i < 100; i++ {
			c <- rand.Intn(1e3)
		}
		close(c)
	}()

	for v := range c {
		fmt.Println(v)
	}
}
