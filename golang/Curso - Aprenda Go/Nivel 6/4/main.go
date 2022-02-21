package main

import "fmt"

type pessoa struct {
	nome      string
	sobrenome string
	idade     int
}

func (p pessoa) apresentar() {
	fmt.Println("Olá, meu nome é:", p.nome, p.sobrenome, "e tenho", p.idade, "anos.")
}

func main() {
	p := pessoa{
		nome:      "Ricardo",
		sobrenome: "Almeida",
		idade:     20,
	}

	p.apresentar()
}
