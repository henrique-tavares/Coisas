var listElement = document.querySelector('div#main ul');

var nomes = ["Diego", "Gabriel", "Lucas"];

for (let i = 0; i < nomes.length; i++)
{
    var nome = document.createElement('li')

    nome.innerText = nomes[i];
    nome.style.paddingTop = '5px'
    nome.style.paddingBottom = '5px'

    listElement.appendChild(nome)
}