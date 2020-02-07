var listElement = document.querySelector('ul');
var buttonElement = document.querySelector('button');
var inputElement = document.querySelector('input');

var todos = JSON.parse(localStorage.getItem('list_todos')) || [];

function renderTodos()
{
    listElement.innerHTML = '';

    for (let i = 0; i < todos.length; i++)
    {
        var todoElement = document.createElement('li');
        todoElement.style.paddingTop = '2px';
        todoElement.style.paddingBottom = '2px';

        var todoText = document.createTextNode(todos[i]);

        var linkElement = document.createElement('a');

        linkElement.setAttribute('href','#');
        linkElement.setAttribute('onclick', `deleteTodo(${i})`)
        linkElement.style.paddingRight = '10px';

        var linkText = document.createTextNode('Excluir');
    
        linkElement.appendChild(linkText);

        todoElement.appendChild(linkElement);
        todoElement.appendChild(todoText);

        listElement.appendChild(todoElement);
    }

    saveToStorage();
}

renderTodos();

function deleteTodo(pos)
{
    todos.splice(pos, 1);
    renderTodos();
}

buttonElement.onclick = function addTodo() 
{
    if (inputElement.value == '')
    {
        alert("Por favor digitar um ToDo");
        return null;
    }

    todos.push(inputElement.value);

    inputElement.value = '';
    inputElement.focus();

    renderTodos();
}

function saveToStorage()
{
    localStorage.setItem('list_todos', JSON.stringify(todos));
}