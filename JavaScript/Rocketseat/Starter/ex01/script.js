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

    var divElement = document.querySelector('div#main');
    divElement.appendChild(boxElement);
}