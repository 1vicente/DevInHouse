
const pessoa = {  nome: 'Ada',  idade: 36,  profissao: 'matemática'};

const recebeFuncao = (a) => {
    const { nome, idade, profissao } = a
    const retorno = document.getElementById('retornoJs')
    
    retorno.innerHTML = `Esta é ${nome}, tem ${idade} anos e é ${profissao}`
}

function pegaEntradaHtml () {
    recebeFuncao(pessoa);
}

const botao = document.getElementById('botaoHtml')
botao.addEventListener('click', pegaEntradaHtml)