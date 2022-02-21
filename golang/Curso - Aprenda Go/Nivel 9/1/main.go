package main

import (
	"fmt"
	"sync"
)

func main() {
	wg := &sync.WaitGroup{}

	wg.Add(2)

	go func() {
		defer wg.Done()

		fmt.Println("Estou na primeira goroutine!")
	}()

	go func() {
		defer wg.Done()

		fmt.Println("Estou na segunda goroutine!")
	}()

	wg.Wait()
}
