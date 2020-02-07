function tabuada()
{
    var num = document.getElementById("num")
    var tab = document.getElementById("seltab")
    
    if (num.value.length == 0)
    {
        alert("[ERRO] Por favor, digite um número!")
        return 0
    }

    num = Number(num.value)
    tab.innerHTML = ""
    
    for (let i = 1; i <=10; i++)
    {
        let item = document.createElement("option")
        item.text = `${num} x ${i} = ${num * i}`
        item.value = `tab${i}`
        tab.appendChild(item)
    }
}