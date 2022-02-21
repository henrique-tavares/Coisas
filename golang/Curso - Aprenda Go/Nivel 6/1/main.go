package main

import "fmt"

func main() {

	fmt.Println(ano())
	fmt.Println(nomeIdade())

}

func ano() int {
	return 2022
}

func nomeIdade() (int, string) {
	return 19, "Henrique"
}
