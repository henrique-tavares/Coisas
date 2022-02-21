package main

import (
	"fmt"
)

func main() {
	// Usando buffer
	c1 := make(chan int, 1)
	c1 <- 42

	fmt.Println("Com buffer:", <-c1)

	// Usando go func
	c2 := make(chan int)

	go func() {
		c2 <- 42
	}()

	fmt.Println("Com go func:", <-c2)
}
