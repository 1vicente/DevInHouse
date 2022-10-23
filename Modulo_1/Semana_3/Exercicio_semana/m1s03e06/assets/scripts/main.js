
const entradaHtml2 = (v) => {
    vLower = v.toLowerCase()
    let vReverso = v.split('').reverse().join('').toLowerCase()
    const retorno = document.getElementById('retornoJs')
    if (vLower === vReverso) {
        retorno.innerHTML = `A palavra ${v} é um palíndromo`
    } else {
        retorno.innerHTML = `A palavra ${v} não é um palíndromo`
    }
}

function pegaEntradaHtml () {

    const entradaHtml = document.getElementById('palindromoHtml').value
    entradaHtml2(entradaHtml);
}

const botao = document.getElementById('botaoHtml')
botao.addEventListener('click', pegaEntradaHtml)
