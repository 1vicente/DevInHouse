
export class Funcionario {

    salarioNovo

    constructor  (cpf, nomeCompleto, salario) {
        this.cpf = cpf
        this.nomeCompleto = nomeCompleto
        this.salario = salario
    }

    promover (percentual) {
        let salarioNovo = this.salario + (this.salario * (percentual / 100))
        console.log("O Salário antigo é: " + this.salario)
        console.log("O Salário novo é: " + salarioNovo)
        return salarioNovo
    }

}