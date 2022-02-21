package main

import "fmt"

type pessoa struct {
	nome      string
	sobrenome string
	idade     int
}

func (p *pessoa) falar() {
	fmt.Printf("Oi, meu nome é %s %s, e tenho %v anos.\n", p.nome, p.sobrenome, p.idade)
}

type humano interface {
	falar()
}

func dizerAlgumaCoisa(h humano) {
	h.falar()
}

func main() {
	p := pessoa{
		nome:      "Ricardo",
		sobrenome: "Almeida",
		idade:     20,
	}

	p.falar() // p.falar() => (&p).falar()

	// dizerAlgumaCoisa(p) | Não funciona, pois falar() está definido apenas para *pessoa
	dizerAlgumaCoisa(&p)
}
