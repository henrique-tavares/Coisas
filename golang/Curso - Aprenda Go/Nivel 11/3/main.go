package main

import "fmt"

type erroEspecial struct {
	err error
}

func (err erroEspecial) Error() string {
	return fmt.Sprint(err.err)
}

func main() {
	res, err := foo(5, erroEspecial{fmt.Errorf("number is not even!")})
	if err != nil {
		fmt.Println(err)
		return
	}

	fmt.Println(res)
}

func foo(n int, err error) (int, error) {
	if n%2 != 0 {
		return 0, err
	}

	return n / 2, nil
}
