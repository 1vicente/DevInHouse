
const caputaValor = () => {
    sleep(entrada.value)
}

async function sleep (valor) {
    return new Promise ((resolvido, rejeitado) => {
        setTimeout(() => {
            retornoJs.innerHTML = `O valor ditado foi ${valor}`;
          }, 3000)
    })
}

const retornoJs = document.getElementById('retornoJs')
const entrada = document.getElementById('entradaHtml')
const botao = document.getElementById('retorno')
botao.addEventListener('click',caputaValor)