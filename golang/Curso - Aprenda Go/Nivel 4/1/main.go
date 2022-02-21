package main

import "fmt"

func main() {
	arr := [5]int{1, 2, 3, 4, 5}

	fmt.Printf("arr: %T\n", arr)
	for i, num := range arr {
		fmt.Printf("arr[%v] = %v\n", i, num)
	}
}
