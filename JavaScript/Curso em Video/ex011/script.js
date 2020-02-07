var a = []
var sel = document.getElementById("sel")
sel.innerHTML = ""

function add()
{
    let num = document.getElementById("num")
    
    if (num.value.length == 0 || Number(num.value) < 1 || Number(num.value) > 100 || (a.indexOf(Number(num.value)) != -1))
    {
        alert("[ERRO] Por favor, digite um número válido")
        num.value = ""
        return 1
    }

    a.push(Number(num.value))
    a.sort((a, b) => a - b)
    
    let item = document.createElement("option")
    
    item.value = `valor${a.indexOf(Number(num.value))}`
    item.text = `Valor ${Number(num.value)} adicionado!`
    sel.appendChild(item)
    res.innerHTML = ""
    
    num.value = ""
    num.focus()
}

function fin()
{
    let res = document.getElementById("res")

    res.innerHTML = `Ao todo, temos ${a.length} números cadastrados <br><br>`
    res.innerHTML += `O maior valor informado foi ${maiorElemento(a)} <br><br>`
    res.innerHTML += `O menor elemento encontrado foi ${menorElemento(a)} <br><br>`
    res.innerHTML += `Somando todos os valores, temos ${soma(a)} <br><br>`
    res.innerHTML += `A média dos valores informadas é ${media(a)}`
}

function media(a)
{
    let media = 0

    for (let i in a) media += a[i]

    media /= a.length

    return media
}

function soma(a)
{
    let soma = 0

    for (let i in a) soma += a[i]

    return soma
}

let menorElemento = (a) => a[0]

let maiorElemento = (a) => a[a.length - 1]


