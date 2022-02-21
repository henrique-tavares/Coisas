package main

import "fmt"

func main() {
	arr := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

	fmt.Printf("arr: %T\n", arr)
	for i, num := range arr {
		fmt.Printf("arr[%v] = %v\n", i, num)
	}
}
