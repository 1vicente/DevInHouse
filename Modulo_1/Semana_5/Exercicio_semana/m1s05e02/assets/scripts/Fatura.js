
export class Fatura {
    valor
    
    constructor (id, descricao, quantia, preco) {
        this.id = parseInt(id)
        this.descricao = String(descricao)
        this.quantia = parseInt(quantia) >= 0 ? parseInt(quantia) : 0;
        this.preco = parseFloat(preco) >= 0 ? parseFloat(preco) : 0;
    }

    obterValorTotal() {
       let valor = this.quantia * this.preco
       return `Metodo - Valor total R$: ${valor}`
    }

    get valorTotal() {
        return `Getter - Valor total R$: ${this.quantia * this.preco}`
    }
}