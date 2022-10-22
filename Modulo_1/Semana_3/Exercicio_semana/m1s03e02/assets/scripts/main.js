
function validaEntrada () {
    const entradaHtml = document.getElementById('nomeHtml').value
    const retorno = document.getElementById('retornoJs')

    if (entradaHtml === "") {
        retorno.innerHTML = "Insira um nome!"
        return
    } else {
        mensagemOla(entradaHtml, retorno)
    }
}


const mensagemOla = (nome, retorno) => {
    let nomeRecebido;
    
    nomeRecebido = nome
    
    return retorno.innerHTML = `Olá, ${nomeRecebido}!`
}