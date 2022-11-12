

async function obterClienteNoBancoDeDados(idCliente) {
    return new Promise( (resolve, reject) => {
            const cliente = { nome: 'bruce wayne', id: idCliente };
            resolve(cliente);
    });
}

async function processar() {
    await obterClienteNoBancoDeDados(7)
        .then(cliente => console.log(cliente));
}

async function juntaTudo () {
    await processar()
}

juntaTudo();