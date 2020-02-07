function verificar()
{
    var txtano = document.getElementById("txtano")
    var sex = document.getElementsByName("radsex")
    var res = document.getElementById("res")
    var resp = document.getElementById("resp")
    var foto = document.createElement("img")
    foto.setAttribute("id", "foto")

    var data = new Date()

    if (txtano.value.length == 0 || Number(txtano.value) > data.getFullYear())
        alert("[ERRO] Preencha os dados corretamente.")
    
    else
    {
        var idade = data.getFullYear() - Number(txtano.value)
        var genero = ""

        if (sex[0].checked)
        {

            if (idade < 6)
            {
                resp.innerHTML = `Detectamos um menino de ${idade} anos`
                foto.setAttribute("src", "bebe.png")
                // foto.src = "bebe.png"
            }
            
            else if (idade < 15)
            {
                resp.innerHTML = `Detectamos um menino de ${idade} anos`
                foto.setAttribute("src", "crianca.png")
                // foto.src = "crianca.png"
            }
            
            else if (idade < 21)
            {
                resp.innerHTML = `Detectamos um adolescente de ${idade} anos`
                foto.setAttribute("src", "adolescente.png")
                // foto.src = "adolescente.png"
            }
            
            else if (idade < 50)
            {
                resp.innerHTML = `Detectamos um adulto de ${idade} anos`
                foto.setAttribute("src", "adulto.png")
                // foto.src = "adulto.png"
            }
            
            else
            {
                resp.innerHTML = `Detectamos um idoso de ${idade} anos`
                foto.setAttribute("src", "idoso.png")
                // foto.src = "idoso.png"
            }
            
            res.appendChild(foto)
        }
        
        else if (sex[1].checked)
        {
            if (idade < 6)
            {
                resp.innerHTML = `Detectamos uma menina de ${idade} anos`
                foto.setAttribute("src", "bebe2.png")
                foto.src = "bebe2.png"
            }
            
            else if (idade < 15)
            {
                resp.innerHTML = `Detectamos uma menina de ${idade} anos`
                foto.setAttribute("src", "crianca2.png")
                foto.src = "crianca2.png"
            }
            
            else if (idade < 21)
            {
                resp.innerHTML = `Detectamos uma adolescente de ${idade} anos`
                foto.setAttribute("src", "adolescente2.png")
                foto.src = "adolescente2.png"
            }
            
            else if (idade < 50)
            {
                resp.innerHTML = `Detectamos uma adulta de ${idade} anos`
                foto.setAttribute("src", "adulto2.png")
                foto.src = "adulto2.png"
            }
            
            else
            {
                resp.innerHTML = `Detectamos uma idosa de ${idade} anos`
                foto.setAttribute("src", "idoso2.png")
                foto.src = "idoso2.png"
            }
            
            res.appendChild(foto)
        }

        else alert("[ERRO] Preencha os dados corretamente.")   
    }
}