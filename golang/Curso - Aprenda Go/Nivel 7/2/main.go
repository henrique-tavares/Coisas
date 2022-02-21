package main

import "fmt"

type pessoa struct {
	nome      string
	sobrenome string
	idade     int
}

func mudeMe(p *pessoa) {
	p.idade = 9
	p.nome = "Vector"
	p.sobrenome = "AEEEAH!"
}

func main() {
	p := pessoa{
		nome:      "Caio",
		sobrenome: "Borges",
		idade:     30,
	}

	fmt.Printf("p: %v\n", p)

	mudeMe(&p)

	fmt.Printf("p: %v\n", p)
}
