var btnElement = document.querySelector('button');

btnElement.onclick = function()
{
    var boxElement = document.createElement('div');

    boxElement.setAttribute('class','quad')
    boxElement.style.width = '100px';
    boxElement.style.height = '100px';
    boxElement.style.backgroundColor = '#f00'
    boxElement.style.margin = 'auto';
    boxElement.style.marginTop = '10px';

    boxElement.onmouseover = function()
    {
        boxElement.style.backgroundColor = getRandomColor();
    }

    var divElement = document.querySelector('div#main');
    divElement.appendChild(boxElement);
}

function getRandomColor()
{
    var letters = '0123456789ABCDEF';
    var color = '#';

    for (let i = 0; i < 6; i++)
    {
        color += letters[Math.round(Math.random() * 15)];
    }

    return color;
}