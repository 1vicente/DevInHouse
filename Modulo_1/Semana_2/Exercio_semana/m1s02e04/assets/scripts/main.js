function onlyNumberKey(evt) {

    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 47 || ASCIICode > 57))
        return false;
    return true;
}

function entradaNumeros() {
    var getEntradaNumeros = document.getElementById("entradaNumeroHtml").value
    if (!isNaN(getEntradaNumeros) && getEntradaNumeros >= 0 && getEntradaNumeros !== "") {
        console.log(getEntradaNumeros)
        storageNumberos.push(getEntradaNumeros)
        document.getElementById("entradaNumeroHtml").value = ''
        console.log(storageNumberos)
        document.getElementById("mostraDigitados").innerHTML = `Número inseridos: ${storageNumberos}`
    }
    resultado.innerHTML = ""
}
function somaNumeros () {
    var tamanho = storageNumberos.length - 1
    for (var i = 0; i <= tamanho; i++) {
        soma += parseInt(storageNumberos[i])
    }
    resultado.innerHTML = `O resultado da soma foi: ${soma}`
    soma = 0
    storageNumberos = []
}

var resultado = document.getElementById("retornoJs");
var soma = 0
var storageNumberos = [];