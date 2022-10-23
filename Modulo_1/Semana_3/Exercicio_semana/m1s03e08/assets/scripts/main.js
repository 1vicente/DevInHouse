
const uneDobraRetorna = (a,...rest) => {
    const retorno = document.getElementById('retornoJs')
    let dobra = []
    rest.forEach(i => {
        dobra.push(i*2)
    });
    const tudoJunto = [...a, ...dobra]
    retorno.innerHTML = `${tudoJunto}`
}

const r1 = [1, 2, 3]

uneDobraRetorna(r1, 4, 5, 6)