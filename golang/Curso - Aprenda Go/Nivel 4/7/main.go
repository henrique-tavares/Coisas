package main

import "fmt"

func main() {
	people := [][]string{
		{"Jorge", "Almeida", "Comer"},
		{"Carlos", "Almeida", "Cinema"},
		{"Cláudia", "Almeida", "Caminhar"},
	}

	for _, person := range people {
		fmt.Println(person)
	}
}
