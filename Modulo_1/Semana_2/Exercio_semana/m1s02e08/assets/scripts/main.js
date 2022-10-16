function onlyNumberKey(evt) {

    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
        return false;
    return true;
}

function calculaFaixaIdade() {
    var entradaNumeroHtml = parseInt(document.getElementById("numeroHtml").value)
    var resultado = document.getElementById("retornoJs")

    for (var i = 2; i <= entradaNumeroHtml; i++) {
        controle = 0
        for (var j = 2; j <= i; j++) {
            resto = i % j
            if (resto == 0) {
                controle+= 1
            }
        }
        if (controle > 1) {
            continue
        } else if (controle <= 1) {
            primos.push(i + " ")
            quantidade+= 1
        }

        resultado.innerHTML = `Existem ${quantidade} números primos. <br>${primos} são primos`
    }



    // if (idade <= 15 ) 
    //     resultado.innerHTML = "Indivíduos de até 15 anos são considerados jovens.";
    // else if (idade >= 16 && idade <= 64)
    //     resultado.innerHTML = "Indivíduos com idade entre 16 até 64 anos são considerados adultos.";
    // else if (idade >= 65)
    //     resultado.innerHTML = "Indivíduos de 65 anos em diante são considerados idosos.";    

}

var primos=[]
var resto;
var controle = 0;
var quantidade = 0;
// Percorra os números de o a 1000 e exiba no console os números primos e ao final a quantidade de números primos que existem nesse intervalo.

// Realize o commit do exercício resolvido.
