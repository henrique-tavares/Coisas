package main

import "fmt"

type veiculo struct {
	portas int
	cor    string
}

type caminhonete struct {
	veiculo
	traçãoNasQuatro bool
}

type sedan struct {
	veiculo
	modeloLuxo bool
}

func main() {
	caminhonete1 := caminhonete{
		veiculo: veiculo{
			portas: 4,
			cor:    "vermelho",
		},
		traçãoNasQuatro: true,
	}

	sedan1 := sedan{
		veiculo: veiculo{
			portas: 2,
			cor:    "prata",
		},
		modeloLuxo: false,
	}

	fmt.Println(caminhonete1, caminhonete1.cor)
	fmt.Println(sedan1, sedan1.cor)
}
