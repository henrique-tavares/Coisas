package main

import "fmt"

func main() {
	x := func(num int) int {
		return -num
	}

	fmt.Println(x(100))
}
