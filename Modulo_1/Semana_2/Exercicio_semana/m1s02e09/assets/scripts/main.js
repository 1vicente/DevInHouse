function onlyNumberKey(evt) {

    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
        return false;
    return true;
}

function calculaPA() {

    var valor = parseInt(document.getElementById('valorInicialHtml').value);
    var razao = parseInt(document.getElementById('raizHtml').value);
    var resultado = document.getElementById("retornoJs")
    var pa = "";

    for(var count=1; count<=10 ; count++){ 
        pa += "Termo "+count+" = "+valor+"<br />";
        valor += razao;
    }
    resultado.innerHTML = pa
}