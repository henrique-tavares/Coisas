function nac()
{
    var pais = document.getElementById("pais")
    var nac = document.getElementById("nac")


    switch (pais.value.toLowerCase())
    {
        case "brasil":
            nac.value = "Brasileiro!"
            break
        
        case "estados unidos":
            nac.value = "Estadunidense!"
            break
        
        case "frança":
            nac.value = "Frances"
            break
    }

}