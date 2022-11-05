
export class Area {
    constructor (tipo, base, altura) {
        this.tipo = String(tipo)
        this.base = parseFloat(base)
        this.altura = parseFloat(altura)
    }

    get calcular () {
        switch (this.tipo) {
            case "triangulo":
                return `Área do triângulo ${(this.base * this.altura) / 2} cm²`
            
            case "quadrado":
                return `Área do quadrado ${this.base * this.altura} cm²`
       
            default:
                break;
        }
    }
}