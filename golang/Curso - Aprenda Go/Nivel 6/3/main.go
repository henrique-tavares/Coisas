package main

import "fmt"

func main() {
	defer final()

	fmt.Println("bla bla bla ........")
	fmt.Println("bla bla bla ........")
	fmt.Println("bla bla bla ........")
	fmt.Println("bla bla bla ........")
	fmt.Println("bla bla bla ........")
	fmt.Println("bla bla bla ........")
	fmt.Println("bla bla bla ........")
}

func final() {
	fmt.Println("Só vou ser executado no final!")
}
