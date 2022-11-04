
class Animal {
    constructor (nome, idade) {
        this.nome = nome
        this.idade = idade
    }
}

export class Cachorro extends Animal {
    som = "latido"

}

export class Gato extends Animal {
    som = "miado"
}