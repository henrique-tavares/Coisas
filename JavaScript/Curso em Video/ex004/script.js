function somar()
{
    var txt1 = document.getElementsByName("num1")[0]
    var txt2 = document.getElementsByName("num2")[0]
    var res = document.getElementsByName("res")[0]
    var n1 = Number(txt1.value)
    var n2 = Number(txt2.value)
    res.value = n1+n2
}

function subtrair()
{
    var txt1 = document.getElementsByName("num1")[1]
    var txt2 = document.getElementsByName("num2")[1]
    var res = document.getElementsByName("res")[1]
    var n1 = Number(txt1.value)
    var n2 = Number(txt2.value)
    res.value = n1 - n2
}

function multiplicar()
{
    var txt1 = document.getElementsByName("num1")[2]
    var txt2 = document.getElementsByName("num2")[2]
    var res = document.getElementsByName("res")[2]
    var n1 = Number(txt1.value)
    var n2 = Number(txt2.value)
    res.value = n1 * n2
}

function dividir()
{
    var txt1 = document.getElementsByName("num1")[3]
    var txt2 = document.getElementsByName("num2")[3]
    var res = document.getElementsByName("res")[3]
    var n1 = Number(txt1.value)
    var n2 = Number(txt2.value)
    res.value = n1 / n2
}

function mod()
{
    var txt1 = document.getElementsByName("num1")[4]
    var txt2 = document.getElementsByName("num2")[4]
    var res = document.getElementsByName("res")[4]
    var n1 = Number(txt1.value)
    var n2 = Number(txt2.value)
    res.value = n1 % n2
}

function exp()
{
    var txt1 = document.getElementsByName("num1")[5]
    var txt2 = document.getElementsByName("num2")[5]
    var res = document.getElementsByName("res")[5]
    var n1 = Number(txt1.value)
    var n2 = Number(txt2.value)
    res.value = n1 ** n2
}