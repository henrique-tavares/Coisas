package main

import "fmt"

type batata int

var x batata
var y int

func main() {
	fmt.Printf("x: %v, %T\n", x, x)
	x = 42
	fmt.Printf("x: %v, %T\n", x, x)

	y = int(x)
	fmt.Printf("y: %v, %T\n", y, y)
}
