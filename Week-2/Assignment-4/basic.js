let action = document.querySelector('#action');
let contents2 = document.querySelector('#contents2');
let welcome = document.querySelector('h2');

action.addEventListener('click', () => {
    contents2.style.display = 'flex';
});

welcome.addEventListener('click', () => {//新增Request 1
    welcome.textContent = "Have a Good Time!";
});
