function onlyNumberKey(evt) {

    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
        return false;
    return controle = 0
}

function calculaTabuada() {
    var numeroTabuada = parseInt(document.getElementById("numeroTabuadaHTML").value)
    var resultado = document.getElementById("retornoJs")
    var resultado2 = document.getElementById("retornoJs2")
    resultado.innerHTML = ""
    resultado2.innerHTML = ""

    while (controle < 6) {
        var multiplicacao = numeroTabuada * controle
        resultado.innerHTML += numeroTabuada + "X" + controle + "=" + multiplicacao + "<br>"; 
        controle ++ 
    }
    while (controle < 11) {
        var multiplicacao = numeroTabuada * controle
        resultado2.innerHTML += numeroTabuada + "X" + controle + "=" + multiplicacao + "<br>"; 
        controle ++
    }
    (controle >= 11) ? controle = 0: true ;
}