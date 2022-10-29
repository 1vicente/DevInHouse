
const recebeDados = () => {
    let resultado = document.getElementById("retornoJs")
    let cadastroClientesTemp = [{}]
    cadastroClientesTemp.nome = document.getElementById("nomeHtml").value
    cadastroClientesTemp.cpf = document.getElementById("cpfHtml").value
    cadastroClientesTemp.celular = document.getElementById("celularHtml").value
    cadastroClientesTemp.senha = document.getElementById("senhaHtml").value
    cadastroClientesTemp.senhaC = document.getElementById("senhaCHtml").value
    cadastroClientesTemp.id = Math.floor(1000 + Math.random() * 90000)
    cadastroClientesTemp.saldo = 0

    cadastroClientes.push(cadastroClientesTemp)

    resultado.innerHTML = `Sua conta foi criada com o ID ${cadastroClientesTemp.id}`
}

let cadastroClientes = [{}]

const botao = document.getElementById('enviar-cadastro')
botao.addEventListener('click', recebeDados)

const valorBloqueado = document.getElementById('valorHtml')

const operacao = document.getElementById('operacaoHtml')
operacao.addEventListener('change', (event) => event.target.value == "consulta" ? valorBloqueado.disabled = true :  valorBloqueado.disabled = false) 