import { Fatura } from './Fatura.js'

const fatura = new Fatura(123, "Melão", 2, 3)


console.log(fatura.obterValorTotal())
console.log(fatura.valorTotal)