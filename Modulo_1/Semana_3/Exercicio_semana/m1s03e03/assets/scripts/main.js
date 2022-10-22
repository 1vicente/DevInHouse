
const juntaArray = (a, b) => {
    const retorno = document.getElementById('retornoJs')
    let novoArray = [...a, ...b]

    retorno.innerHTML = `[${novoArray}]`

}

const primeiroArray = [1, 2, 3]
const segundoArray = [4, 5, 6]

const botao = document.getElementById('botaoHtml')
botao.addEventListener('click', () => juntaArray(primeiroArray, segundoArray))