function onlyNumberKey(evt) {

    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
        return false;
    return true;
}

function entradaNumero() {
    var entradaNumeros = parseInt(document.getElementById("entradaNumeroHtml").value)
    var resultado = document.getElementById("retornoJs")
    var par = 0
    var impar = 0

    for (var i = 0; i <= entradaNumeros; i++) {
        if ( i % 2 == 0) {
            console.log("Eh par" + i)
            par++
        } else {
            impar++
        }
    }
    resultado.innerHTML = `Quantidade de números pares: ${par} <br> Quantidade de números ímpares: ${impar}` 
}