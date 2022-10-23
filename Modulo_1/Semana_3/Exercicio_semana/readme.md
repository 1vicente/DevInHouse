# Semana 3 DiH

## [M1S03] Ex 1 - Use Let, Const e Array

    Implemente uma função "**procuraMinMax**" que receba como parâmetro um array (numérico) e identifique o **menor** e o **maior** valor do mesmo. 

    Imprima no console estes valores ou **"Não é possível encontrar"** quando não for possível.

    Teste a função com as seguintes entradas:

    - [56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47]
    - []
    - [1]
    - [1, -1]
    - null
    - [-2,-2,-2,-2] 
    - [20,10, 30]  

    Obs.: Use let e const para declarar variáveis se for necessário.
    Extra: Faça com uma arrow function.
---
## [M1S03] Ex 2 - Mensagem Arrow

    Em um arquivo **app.js** (incluído em **index.html**) faça o seguinte:

    No documento **js** faça uma **arrow function** para retornar uma mensagem (string) de **"Olá, Mundo!"**.

    Armazene esta **arrow function** em uma constante (**const**) de nome **1**.

    Chame a função **mensagemOla** e exiba o retorno desta função no console.

    Ajuste a função **mensagemOla** para que receba um parâmetro **nome** e retorne a mensagem **"Olá, [nome]!"**.

    > Exemplo:

        mensagemOla("Mariana");
        // "Olá, Mariana!"

    Ao final, devemos ter uma função que monta uma mensagem de olá customizada com o nome informado por parâmetro.

    > Dica:
    > https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Functions/Arrow_functions

    Extra: Caso queira, podes experimentar criar um **campo de texto**, um **botão** e um **parágrafo** em **index.html** e fazer com que a função de nome seja executada ao pressionarmos o botão, que o nome pode seja lido do campo de texto e a mensagem seja exibida no parágrafo.
    ---

## [M1S03] Ex 3 - Concatenar Spread

    Para treinar os conceitos de Spread.

    Crie dois arquivos:
    - **index.html**
    - **app.js**

    Em **app.js** desenvolva uma função que receba **dois arrays** e realize a **concatenação** entre eles utilizando o operador **Spread**.
    Apresente o resultado no console.log(novoArray).

    > Exemplo:

        const novoArray = concatena([1, 2, 3], [4, 5, 6]);
        console.log(novoArray);
        // novo array deve ser [1, 2, 3, 4, 5, 6]

    **Obs.:** Em **index.html** deve ser incluído o arquivo **app.js**, para executarmos o script com a função.

    > Dica:
    > https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Operators/Spread_syntax

    Extra: Faça com uma arrow function.
---

## [M1S03] Ex 4 - Mesclando Objetos

    Para exercitarmos *spread* com objetos:
    Em um arquivo **app.js** incluído em **index.html** escreva uma função de nome **mesclaObjetos**, que aceita dois objetos como parâmetro e retorna um novo objeto que contem todos os pares chave-valor do primeiro e do segundo objetos.

    > Exemplo:

        const objUm = { a: 1, b: 2 };
        const objDois = { c: 3, d: 4 };
        const novoObjeto = mesclaObjetos(objUm, objDois);
        console.log(novoObjeto);
        // { a: 1, b: 2, c: 3, d: 4 }

    Extra: Faça utilizando arrow function.

---

## [M1S03] Ex 5 - Parâmetros Infinitos

    Para treinar os conceitos de Rest.

    Crie dois arquivos:
    - **index.html**
    - **app.js**

    No arquivo **apps.js**, utilizando o operador **Rest**, crie uma função que receba como parâmetro uma **quantidade indefinida de variáveis** inteiras (números inteiros).

    A função deve retornar a soma de todos os **parâmetros** (...).
    Após executada a função, o resultado deve ser exibido no console.

    > Exemplo:

        const resultado = somaTudo(1, 2, 3, 4);
        console.log(resultado);
        // resultado deve ser 10

    **Obs.:** Em **index.html** deve ser incluído o arquivo **app.js**, para rodar o script e executarmos a função.

    > Dica:
    > https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Functions/rest_parameters

    Extra: Faça com uma arrow function.

---

## [M1S03] Ex 6 - Palíndromo

    Um *palindrome* (palíndromo), segundo o dicionário Houaiss, 
    **"diz-se de frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa"**, como por exemplo: *osso*, *Ana*, *radar*. 

    Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado. 

    Implemente uma função em JavaScript que receba uma **string** como parâmetro e retorne se determinada palavra é um palindromo ou não.

    > Exemplo:

        const teste1 = verificaPalindromo("ana");
        // true

        const teste2 = verificaPalindromo("julia");
        // false

    Obs.: Use let e const para declarar variáveis se for necessário.
    Extra: Faça com uma arrow function.

---

## [M1S03] Ex 7 - Destruct

    Em um arquivo **app.js** incluído em **index.html**, crie um objeto com a seguinte estrutura:

        const pessoa = {
        nome: 'Ada',
        idade: 36
        profissao: 'matemática'
        };

    Faça uma função que receba este objeto por parâmetro, desestruture-o no começo da função (utilizando _destruct_) criando três variáveis (**nome**, **idade**, **profissao**).

    Faça ainda com que a função retorne uma _string_ com a seguinte mensagem:

        "Esta é Ada, tem 36 anos e é matemática."

    Concatene as variáveis criadas com _destruct_ para formar a mensagem.

    Chame a função passando o objeto por parâmetro e exiba o retorno no console.


    Extra: Faça o destruct acontecer diretamente na linha de declaração dos parâmetros da função. Por fim faça com uma arrow function.

---

## [M1S03] Ex 8 - Une, Dobra e Retorna

    Para exercitarmos *rest* e repetições com vetores:

    Em um arquivo **app.js** incluído em **index.html** escreva uma função **arrow** e armazene-a em uma variável de nome **uneDobraRetorna**, que aceita um **array** de números e qualquer outra quantidade de números como parâmetro. A função deve retornar um novo vetor que começa com o vetor inicial concatenado com os outros parâmetros extra dobrados de valor.

    > Exemplo:

        const r1 = uneDobraRetorna([1, 2, 3], 4, 4)
        console.log(r1) // [1, 2, 3, 8, 8]

        const r2 = uneDobraRetorna([2], 10, 4, 8) 
        console.log(r2) // [2, 20, 8, 16]

        const r3 = uneDobraRetorna([6, 8]) 
        console.log(r3) // [6, 8]
