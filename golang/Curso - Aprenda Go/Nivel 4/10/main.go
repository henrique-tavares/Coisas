package main

import "fmt"

func main() {
	names := map[string][]string{
		"almeida_jorge":   {"Cinema", "Dormir", "Comer"},
		"almeida_cláudia": {"Dançar", "Balada", "Salada"},
		"almeida_carlos":  {"Ler", "Cachorro", "Gato"},
	}

	names["almeida_marquinhos"] = []string{"Jogar", "Youtube"}

	delete(names, "almeida_jorge")

	for k, v := range names {
		fmt.Printf("%v => %v\n", k, v)
	}
}
