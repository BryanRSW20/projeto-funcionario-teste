let path_selected
let id_selected

const showModalDeletar = function(path, id){
    path_selected = path
    id_selected = id
    $('#modalDeletar').modal('show')
}

const deletar = function(){
    if (path_selected != "" && id_selected != ""){
        window.location.href='/' + path_selected + '/delete/' + id_selected
    }
}

var modal = document.getElementById('Modal')

var btn = document.getElementById('openModal')

var span = document.getElementsByClassName('close')[0];

btn.onclick = function(){
    modal.style.display = 'block';
}

span.onclick = function(){
    modal.style.display = 'none';

}

window.onclick = function(event){
    if (event.target == modal) {
        modal.style.display = 'none';
    }
}

//  Autenticação Login

    function armazenar(){
        var name = document.getElementById('username');

        var senha = document.getElementById('senha');

        var letraMinuscula = /[a-z]/g;

        var letraMaiuscula = /[A-Z]/g;

        var numeros = /[0-9]/g;

        if(name.value.length == 0){
            alert("Você precisa preencher o campo de nome");
        } else if(senha.value.length == 0){
            alert("Você precisa inserir uma senha")
        } else if(name.value.length == 0 && senha.value.length == 0){
            alert("Você precisa preencher os campos de nome e senha!")
        } else{
            localStorage.setItem('username', name.value);
            localStorage.setItem('senha', senha.value);
            alert('Sua conta foi criada, bem-vindo a JSoft!')
        }
    }

    function checar() {
        var lsUser = localStorage.getItem('username');
        var lsSenha = localStorage.getItem('senha');

        var UserName = document.getElementById('UserName');
        var UserSenha = document.getElementById("UserSenha");

        if(UserName.value = lsUser && UserSenha.value == lsSenha){
            alert("Você está logado")
            window.open('/agenda/list')
        } else{
            alert("Ocorreu um erro")
        }
    }

    function toggleDarkMode() {
        const btnCor = document.querySelector('.btn-dark-mode');
        const varCor = '$cor-fundo';

        btnCor.addEventListener('click', _ => {
            console.log(e);
        })
    }

    function NavToggle() {

        var x = document.getElementById("NavMenu");
        if (x.className === "nav-menu") {
            x.className += "responsive";
        }else{
            x.className = "nav-menu"
        }
    }