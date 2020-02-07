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

var btnElement = document.querySelector('button');
var txtElement = document.querySelector('input');

btnElement.onclick = function ()
{
    var nome = document.createElement('li')

    if (txtElement.value == '')
    {
        alert("Por favor, digite um nome.");
        return null;
    }

    nomes.push(txtElement.value)

    nome.innerText = nomes[nomes.length - 1];
    nome.style.paddingTop = '5px';
    nome.style.paddingBottom = '5px';

    listElement.appendChild(nome);

    txtElement.value = '';
    txtElement.focus();
}