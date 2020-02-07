function contar()
{
    var inicio = document.getElementById("int")
    var fim = document.getElementById("end")
    var passo = document.getElementById("add")

    var res = document.getElementById("res")

    // console.log(`Inicio tam = ${inicio.value.length}\nFim tam = ${fim.value.length}\nPasso tam = ${passo.value.length}`)

    if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0)
    {
        alert("[ERRO] Preencha os dados corretamente.")
        return 1
    }

    inicio = Number(inicio.value)
    fim = Number(fim.value)
    passo = Number(passo.value)

    // console.log(`Inicio = ${inicio}\nFim = ${fim}\nPasso = ${passo}`)

    if ((passo == 0) || (passo < 0 && fim > inicio) || (passo > 0 && fim < inicio))
    {
        alert("[ERRO] Preencha os dados corretamente.")
        return 1
    }

    res.innerHTML = ""

    if (passo < 0)
    {
        for (let i = inicio; i >= fim; i += passo)
        {
            if (i + passo < fim)
            {
                res.innerHTML += `${i} \u{1F3C1}`
            }
            else
            {
                res.innerHTML += `${i} \u{1F449} `
            }
            // console.log(`i = ${i}`)
        }
    }

    else
    {
        for (let i = inicio; i <= fim; i += passo)
        {
            if (i + passo > fim)
            {
                res.innerHTML += `${i} \u{1F3C1}`
            }
            else
            {
                res.innerHTML += `${i} \u{1F449} `
            }
            // console.log(`i = ${i}`)
        }
    }
}