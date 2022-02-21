package main

import "fmt"

func main() {
	esporteFavorito := "basquete"

	switch esporteFavorito {
	case "futebol":
		fmt.Println("Seu esporte favorito é futebol")
	case "basquete":
		fmt.Println("Seu esporte favorito é basquete")
	case "vôlei":
		fmt.Println("Seu esporte favorito é vôlei")
	default:
		fmt.Println("Não sei qual o seu esporte favorito")
	}
}
