package main

import "fmt"

func main() {
	names := map[string][]string{
		"almeida_jorge":   {"Cinema", "Dormir", "Comer"},
		"almeida_cláudia": {"Dançar", "Balada", "Salada"},
		"almeida_carlos":  {"Ler", "Cachorro", "Gato"},
	}

	fmt.Printf("names: %v\n", names)
}
