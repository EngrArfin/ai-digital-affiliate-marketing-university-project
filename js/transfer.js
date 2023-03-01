document.getElementById('btn-update').addEventListener('click', function(){
    const inputFiled = document.getElementById('input-filed');
    const inputText = inputFiled.value;
    const p = document.getElementById('input-text-display');
    p.innerText = inputText;
    inputFiled.value = '';

})
