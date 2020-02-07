function mouse()
{
    var txtvel = document.getElementById("vel")
    var vel = Number(txtvel.value)
    var res = document.getElementById("res")

    if (vel > 80)
    {
        res.value = "Multado!"
    }
    else
    {
        res.value = "Não multado!"
    }
}