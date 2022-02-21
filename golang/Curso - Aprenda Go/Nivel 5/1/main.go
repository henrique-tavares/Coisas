package main

import "fmt"

type pessoa struct {
	nome           string
	sobrenome      string
	saboresSorvete []string
}

func main() {
	pessoa1 := pessoa{
		nome:           "Carlos",
		sobrenome:      "Rocha",
		saboresSorvete: []string{"Napolitano", "Baunilha"},
	}

	pessoa2 := pessoa{
		nome:           "Andréia",
		sobrenome:      "Araújo",
		saboresSorvete: []string{"Chocolate", "Flocos"},
	}

	fmt.Println(pessoa1.nome, pessoa1.sobrenome)
	fmt.Print("Sabores favoritos de sorvete:")
	for _, saborSorvete := range pessoa1.saboresSorvete {
		fmt.Printf(" %v", saborSorvete)
	}
	fmt.Println()

	fmt.Println(pessoa2.nome, pessoa2.sobrenome)
	fmt.Print("Sabores favoritos de sorvete:")
	for _, saborSorvete := range pessoa2.saboresSorvete {
		fmt.Printf(" %v", saborSorvete)
	}
	fmt.Println()
}
