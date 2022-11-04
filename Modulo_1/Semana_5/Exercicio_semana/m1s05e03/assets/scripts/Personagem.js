
export class Personagem {
    percentualVida = 100

    constructor (nome) {
        this.nome = nome
        this.percentualVida = 100
    }

    sofreuDano (percentualDano) {
        this.percentualVida = this.percentualVida - percentualDano
        return `Dano recebido: ${percentualDano} / Vida atual ${this.percentualVida}`
    }

    get usouKitMedico () {
        this.percentualVida = this.percentualVida < 90 ? this.percentualVida + 10 : this.percentualVida = 100;
        return `Cura recebida: 10 / Vida atual ${this.percentualVida}`
    }
}