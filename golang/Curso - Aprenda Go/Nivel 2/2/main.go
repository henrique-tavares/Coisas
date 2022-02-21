package main

import "fmt"

func main() {
	a := 1 == 1
	b := 1 != 2
	c := 10 <= 5
	d := 10 < 10
	e := 99 >= 9
	f := 4 > 8

	fmt.Println(a, b, c, d, e, f)
}
