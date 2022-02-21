package main

import "fmt"

var x int
var y string
var z bool

func main() {
	fmt.Printf("x: %v, %T\n", x, x)
	fmt.Printf("y: %v, %T\n", y, y)
	fmt.Printf("z: %v, %T\n", z, z)
}
