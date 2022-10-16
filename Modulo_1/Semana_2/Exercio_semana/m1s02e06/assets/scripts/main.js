function onlyNumberKey(evt) {

    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 45 || ASCIICode > 57))
        return false;
    return true;
}

function entradaNumero() {
    var entradaNumeros1 = parseInt(document.getElementById("entradaNumeroHtml1").value)
    var entradaNumeros2 = parseInt(document.getElementById("entradaNumeroHtml2").value)
    var entradaOperacao = document.getElementById("operacaoHtml").value
    var resultado = document.getElementById("retornoJs")
    
    if (!isNaN(entradaNumeros1) && !isNaN(entradaNumeros2)) {
        resultado.innerHTML = `O resultado da operação é: ${eval(entradaNumeros1 + entradaOperacao + entradaNumeros2)}`
    }
}