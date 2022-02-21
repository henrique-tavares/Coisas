package main

import "fmt"

func main() {
	fmt.Println(calcula(soma, 10, 45))
}

func soma(a, b int) int {
	return a + b
}

func calcula(op func(int, int) int, x int, y int) int {
	return op(x, y)
}
