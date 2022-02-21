package main

import "fmt"

func main() {
	func() {
		fmt.Println("Sou uma função anônima.")
	}()
}
