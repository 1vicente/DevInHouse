import { Funcionario } from './Funcionario.js'

const resultado = new Funcionario("528.442.040-31", "Ada Lovelace", 1000)

console.log ("REsultado" + resultado)
console.log("Salário Novo" + resultado.promover(50))