package main

import "fmt"

func main() {
	x := 4

	if x < 0 {
		fmt.Println("x é negativo!")
	} else if x > 0 {
		fmt.Println("x é positivo!")
	} else {
		fmt.Println("x é zero!")
	}
}
