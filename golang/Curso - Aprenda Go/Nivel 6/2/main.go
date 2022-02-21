package main

import "fmt"

func main() {
	arr := []int{1, 2, 3, 4, 5}

	fmt.Println(soma(arr...))
	fmt.Println(somaArr(arr))
}

func soma(nums ...int) int {
	total := 0
	for _, num := range nums {
		total += num
	}

	return total
}

func somaArr(nums []int) int {
	total := 0
	for _, num := range nums {
		total += num
	}

	return total
}
