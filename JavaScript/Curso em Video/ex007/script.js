function carregar()
{
    var msg = document.getElementById("msg")
    var img = document.getElementById("img")

    var data = new Date()
    var hora = data.getHours()

    if (hora < 6)
    {
        msg.innerHTML = `Agora são ${hora} da madrugada.`
        img.src = "noite.png"
        document.body.style.background = "#012636"
    }
    else if (hora < 12)
    {
        msg.innerHTML = `Agora são ${hora} da manhã.`
        img.src = "manha.png"
        document.body.style.background = "#9bb8a2"
    }
    else if (hora < 19)
    {
        msg.innerHTML = `Agora são ${hora} da tarde.`
        img.src = "tarde.png"
        document.body.style.background = "#ac7157"
    }
    else
    {
        msg.innerHTML = `Agora são ${hora} da noite.`
        img.src = "noite.png"
        document.body.style.background = "#012636"
    }
}