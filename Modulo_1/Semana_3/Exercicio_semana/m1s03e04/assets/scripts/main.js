
const mesclaObjetos = (y, z) => {
    const juntos = {...y, ...z}
    const retorno = document.getElementById('retornoJs')
    console.log(juntos);
    retorno.innerText = JSON.stringify(juntos)
}


const objUm = { a: 1, b: 2 };
const objDois = { c: 3, d: 4 };

const botao = document.getElementById('botaoHtml')
botao.addEventListener('click', () => mesclaObjetos(objUm, objDois))