var a = window.document.querySelector("div#area");

a.addEventListener("click", clickar)
a.addEventListener("mouseenter", entrar)
a.addEventListener("mouseout", saiu)

function clickar()
{
    a.innerHTML = "Clickou!"
}

function entrar()
{
    a.innerHTML = "Entrou!"
}

function saiu()
{
    a.innerHTML = "Saiu!"
}
