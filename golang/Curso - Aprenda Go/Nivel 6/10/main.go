package main

import "fmt"

func main() {
	a := autoIncrementa()
	b := autoIncrementa()
	c := autoIncrementa()

	fmt.Println(a())
	fmt.Println(a())
	fmt.Println(a())

	fmt.Println(b())
	fmt.Println(b())

	fmt.Println(c())

}

func autoIncrementa() func() int {
	i := 0
	return func() int {
		i += 1
		return i
	}
}
