function procuraMinMax() {

    let recebeValores = pegaSelecionado()
    let resultado = document.getElementById("retornoJs")

    recebeValores = recebeValores.sort()
    let tamanhoArray = recebeValores.length

    if (isNaN(recebeValores[0]) || recebeValores[0] == "" ) {
        resultado.innerHTML = "O campo selecionado não é um valor válido. Selecione outro"
    } else {
    resultado.innerHTML = `Mínimo: ${recebeValores[0]} <br> Máximo: ${recebeValores[tamanhoArray - 1]} <br> Array ordenado [${recebeValores}]`
    }
}

function pegaSelecionado () {

    var radios = document.getElementsByName("escolha");
    for (var i = 0; i < radios.length; i++) {
        if (radios[i].checked) {
            let retorno = radios[i].value.split(",").map(Number)
            return retorno;
        }
    }
}