
const recebeDados = () => {
    let resultado = document.getElementById("retornoJs")
    let cadastroClientesTemp = [{}]
    cadastroClientesTemp.nome = document.getElementById("nomeHtml").value
    cadastroClientesTemp.cpf = document.getElementById("cpfHtml").value
    cadastroClientesTemp.celular = document.getElementById("celularHtml").value
    cadastroClientesTemp.senha = document.getElementById("senhaHtml").value
    cadastroClientesTemp.id = Math.floor(1000 + Math.random() * 90000)
    cadastroClientesTemp.saldo = 0

    cadastroClientes.push(cadastroClientesTemp)

    resultado.innerHTML = `Sua conta foi criada com o ID ${cadastroClientesTemp.id}`
}

const operacao = (x) => {
    switch (x) {
        case "saque":
            validaConta(cadastroClientes)
            break;

        case "deposito":
            break;

        case "consulta":
            let infoCliente =  validaConta(cadastroClientes)
            let saldo = infoCliente.saldo
            let id = infoCliente.id
            resultado.innerHTML = `Saldo da conta ${id}: R$ ${saldo}`
            break;

        default:
            break;
    }
}

const validaConta = (clientes) => {
    let idConta = parseInt(document.getElementById('contaHtml').value)
    let senhaConta = parseInt(document.getElementById('senhaDHtml').value)

    let encontraConta = clientes.find(item => item.id == idConta)
    if (encontraConta.id == idConta && encontraConta.senha == senhaConta) {
        return encontraConta
    } else {
        resultado.innerHTML = `Conta e/ou senha inválida`
    }

}



let resultado = document.getElementById("retornoJs")

let cadastroClientes = [{id: 1, senha: 1, saldo: 0}]

const botaoCadastro = document.getElementById('enviar-cadastro')
botaoCadastro.addEventListener('click', recebeDados)

const botaoOperacao = document.getElementById('enviar-operacao')
botaoOperacao.addEventListener('click', function() { operacao(checaOperacao.value); } )

const valorBloqueado = document.getElementById('valorHtml')

const checaOperacao = document.getElementById('operacaoHtml')

checaOperacao.addEventListener('change', (event) => event.target.value == "consulta" ? valorBloqueado.disabled = true :  valorBloqueado.disabled = false) 