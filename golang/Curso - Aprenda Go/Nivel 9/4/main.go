package main

import (
	"fmt"
	"runtime"
	"sync"
)

var wg sync.WaitGroup
var mu sync.Mutex

func main() {
	count := 0
	goRoutines := 1000

	wg.Add(goRoutines)

	for i := 0; i < goRoutines; i++ {
		go func(i int) {
			defer wg.Done()

			mu.Lock()
			defer mu.Unlock()

			v := count
			fmt.Printf("Go Routine #%04v: Ler (count=%v)\n", i, v)
			runtime.Gosched()
			v += 1
			count = v
			fmt.Printf("Go Routine #%04v: Escrever (count=%v)\n", i, v)
		}(i)
	}

	wg.Wait()
	fmt.Printf("\nValor final: %v\n", count)
}
