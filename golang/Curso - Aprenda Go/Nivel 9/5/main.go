package main

import (
	"fmt"
	"sync"
	"sync/atomic"
)

func main() {
	var wg sync.WaitGroup
	count := int64(0)
	goRoutines := 1000

	wg.Add(goRoutines)

	for i := 0; i < goRoutines; i++ {
		go func(i int) {
			defer wg.Done()

			atomic.AddInt64(&count, 1)
			v := atomic.LoadInt64(&count)
			fmt.Printf("Go Routine #%04v: (count=%v)\n", i, v)
		}(i)
	}

	wg.Wait()
	fmt.Printf("\nValor final: %v\n", count)
}
