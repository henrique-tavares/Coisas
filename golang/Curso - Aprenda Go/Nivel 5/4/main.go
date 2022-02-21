package main

import "fmt"

func main() {
	desafio := struct {
		paisCapital      map[string]string
		pontosTuristicos []string
	}{
		paisCapital: map[string]string{
			"Brasil":  "Brasília",
			"Espanha": "Madrid",
			"Itália":  "Roma",
			"França":  "Paris",
		},
		pontosTuristicos: []string{"Torre Eifel", "Cristo Redentor", "Torre de Pisa"},
	}

	fmt.Println(desafio)
}
