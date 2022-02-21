package main

import "fmt"

func main() {
	arr := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

	fmt.Println("arr[:3] = ", arr[:3])
	fmt.Println("arr[4:] = ", arr[4:])
	fmt.Println("arr[1:7] = ", arr[1:7])
	fmt.Println("arr[2:9] = ", arr[2:9])
	fmt.Println("arr[2:len(arr)-1] = ", arr[2:len(arr)-1])

}
