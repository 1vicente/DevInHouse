import { Autentica }  from './Usuario.js'

function capturaValores () {
  const nome = document.getElementById('nomeHtml')
  const email = document.getElementById('emailHtml')
  const senha = document.getElementById('senhaHtml')


  const autenticacao = new Autentica("Vicente", "vicente@vicente.com", "DevInHouse")

  const testaLogin = autenticacao.login(email.value, senha.value)

  testaLogin == true ? retornoJS.innerHTML = `Bem-vindo ${nome.value}. Login efetuado com sucesso`: retornoJS.innerHTML = "Usuário e/ou Senha inválido(s)"
}

const botao = document.getElementById('entrar')
botao.addEventListener('click', capturaValores)

const retornoJS = document.getElementById('retornoJs')