function onlyNumberKey(evt) {

    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
        return false;
    return true;
}

function estacaoDoAno() {
    var entradaDateHtml = document.getElementById("dateHtml").value
    var resultado = document.getElementById("retornoJs")
    var entradaNovo = entradaDateHtml.split("-")
    var dia = parseInt(entradaNovo[2])
    var mes = parseInt(entradaNovo[1])

    if (dia >= 22) {
        mes = 1 + mes 
    } 

    if ( mes >= 10 && mes < 13) {
        resultado.innerHTML = "De 22/09 à 21/12 é primavera";
    } else if ( mes >= 7 && mes < 10) {
        resultado.innerHTML = "De 22/06 à 21/09 é inverno";
    } else if ( mes >= 4 && mes < 7) {
        resultado.innerHTML = "De 22/03 à 21/06 é outono";
    } else {
        resultado.innerHTML = "De 22/12 à 21/03 é verão";
    }
}