package main

import "fmt"

func main() {
	a := 42
	fmt.Printf("a: %d | %#b | %#x\n", a, a, a)

	b := a << 1
	fmt.Printf("b: %d | %#b | %#x\n", b, b, b)
}
