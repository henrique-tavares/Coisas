package main

import "fmt"

func main() {
	birthYear := 2002
	for {
		fmt.Println(birthYear)
		birthYear++
		if birthYear > 2022 {
			break
		}
	}
}
