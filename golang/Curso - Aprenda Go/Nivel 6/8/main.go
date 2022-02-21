package main

import "fmt"

func main() {
	somaDentro := somaFora()

	fmt.Println(somaDentro(2, 4))
}

func somaFora() func(int, int) int {
	return func(i1, i2 int) int {
		return i1 + i2
	}
}
