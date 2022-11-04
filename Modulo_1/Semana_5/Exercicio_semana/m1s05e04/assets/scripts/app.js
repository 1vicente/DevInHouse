import { Cachorro } from './Animal.js'
import { Gato } from './Animal.js'

const snoopy = new Cachorro('snoopy', 10);
console.log(`
Nome.: ${snoopy.nome}
Idade: ${snoopy.idade}
Som..: ${snoopy.som}` );

const frajola = new Gato('frajola', 8);

console.log(`
Nome.: ${frajola.nome}
Idade: ${frajola.idade}
Som..: ${frajola.som}` );


