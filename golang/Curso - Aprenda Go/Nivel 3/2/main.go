package main

import "fmt"

func main() {
	for x := 65; x <= 90; x++ {
		fmt.Printf("%v:\n", x)
		for i := 0; i < 3; i++ {
			fmt.Printf("\t%#U\n", x)
		}
	}
}
