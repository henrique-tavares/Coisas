package main

import "testing"

func TestAbs(t *testing.T) {
	res := Abs(-1)
	if res != 1 {
		t.Errorf("Abs(-1) = %v; want 1", res)
	}
}
