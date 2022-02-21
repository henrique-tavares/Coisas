package main

import (
	"fmt"
	"math"
)

type quadrado struct {
	lado float64
}

func (q quadrado) area() float64 {
	return q.lado * q.lado
}

type círculo struct {
	raio float64
}

func (c círculo) area() float64 {
	return 2 * math.Pi * c.raio
}

type figura interface {
	area() float64
}

func info(f figura) float64 {
	return f.area()
}

func main() {
	q := quadrado{
		lado: 5,
	}

	c := círculo{
		raio: 5,
	}

	fmt.Println(info(q))
	fmt.Println(info(c))
}
