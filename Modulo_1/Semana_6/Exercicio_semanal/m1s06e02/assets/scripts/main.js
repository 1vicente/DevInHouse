

async function horaAtual () {
    setInterval(() => {
        let hora = new Date
        console.log(hora)
        retornoJs.innerHTML = hora
    }, 2000);
}

const retornoJs = document.getElementById('retornoJs')

horaAtual();
