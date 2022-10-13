function onlyNumberKey(evt) {

    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
        return false;
    return true;
}

function calculaFaixaIdade() {
    var idade = parseInt(document.getElementById("idadeHtml").value)
    var resultado = document.getElementById("retornoJs")

    if (idade <= 15 ) 
        resultado.innerHTML = "Indivíduos de até 15 anos são considerados jovens.";
    else if (idade >= 16 && idade <= 64)
        resultado.innerHTML = "Indivíduos com idade entre 16 até 64 anos são considerados adultos.";
    else if (idade >= 65)
        resultado.innerHTML = "Indivíduos de 65 anos em diante são considerados idosos.";    
}