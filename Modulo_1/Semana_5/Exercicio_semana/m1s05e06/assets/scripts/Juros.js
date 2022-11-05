
export class Juros {
    constructor (capitalInicial, taxaAplicada, tempo) {
        this.capitalInicial = capitalInicial
        this.taxaAplicada = taxaAplicada
        this.tempo = tempo
    }

    get calcularJurosSimples() {
        return `Valor acumulado: ${parseInt(this.capitalInicial + (this.capitalInicial * this.taxaAplicada * this.tempo))}`
    }

    get calcularJurosCompostos () {
        return `Valor acumulado: ${parseInt(this.capitalInicial * ( 1 + this.taxaAplicada) ** this.tempo)} `
    }
}

