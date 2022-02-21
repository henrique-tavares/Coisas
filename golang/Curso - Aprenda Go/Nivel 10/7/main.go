package main

import (
	"fmt"
	"math/rand"
	"sync"
)

func main() {
	c := make(chan int)
	go gen(10, c)

	for v := range c {
		fmt.Println(v)
	}
}

func gen(n int, c chan<- int) {
	var wg sync.WaitGroup

	for i := 0; i < n; i++ {
		wg.Add(1)
		go func(c chan<- int) {
			for j := 0; j < 10; j++ {
				c <- rand.Intn(1e3)
			}
			wg.Done()
		}(c)
	}

	wg.Wait()
	close(c)
}
