
const somaEntrada = ([...rest]) => {
    let controle = 0
    const retorno = document.getElementById('retornoJs')
    rest.forEach((i) => {
        controle += parseInt(i)
    });
    return retorno.innerHTML = `Resultado da soma dos itens: ${controle}`
}

function pegaEntradaHtml () {

    const entradaHtml = document.getElementById('numerosHtml')
    const entradaHtmlArray = entradaHtml.value.split(",")

    somaEntrada(entradaHtmlArray);
}

const botao = document.getElementById('botaoHtml')
botao.addEventListener('click', () => pegaEntradaHtml())
