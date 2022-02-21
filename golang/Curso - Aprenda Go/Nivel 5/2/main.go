package main

import "fmt"

type pessoa struct {
	nome           string
	sobrenome      string
	saboresSorvete []string
}

func main() {

	pessoas := map[string]pessoa{
		"Rocha": {
			nome:           "Carlos",
			sobrenome:      "Rocha",
			saboresSorvete: []string{"Napolitano", "Baunilha"},
		},
		"Araújo": {
			nome:           "Andréia",
			sobrenome:      "Araújo",
			saboresSorvete: []string{"Chocolate", "Flocos"},
		},
	}

	for _, pessoa := range pessoas {
		fmt.Println(pessoa.nome, pessoa.sobrenome)
		fmt.Print("Sabores favoritos de sorvete:")
		for _, saborSorvete := range pessoa.saboresSorvete {
			fmt.Printf(" %v", saborSorvete)
		}
		fmt.Println()
	}
}
