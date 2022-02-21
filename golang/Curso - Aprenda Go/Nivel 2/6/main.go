package main

import "fmt"

const (
	_ = (iota + 2022)
	prox_ano_1
	prox_ano_2
	prox_ano_3
	prox_ano_4
)

func main() {
	fmt.Println(prox_ano_1, prox_ano_2, prox_ano_3, prox_ano_4)
}
