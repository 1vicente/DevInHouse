# Semana 5 DiH

## [M1S05] Ex 1 - Classe Funcionário

    Em um arquivo `app.js` incluído em `index.html` de tipo módulo `type="module"`:

    Crie uma classe **Funcionario** para representar um(a) empregado(a) de uma empresa, contendo os atributos `cpf`, `nomeCompleto` e `salario`.

    Implemente também um método `promover(percentual)` que recebe como parâmetro um percentual, devendo o salário ser aumentado pelo percentual indicado no argumento do método.

    Crie e utilize um objeto desta classe para testar a implementação.

    Exemplo:

    const ada = new Funcionario("528.442.040-31", "Ada Lovelace", 1000);

    console.log(ada.salario); // 1000

    ada.promover(50);

    console.log(ada.salario); // 1500


    ---
    Extras:

    • Crie a classe em um arquivo separado `Funcionario.js`, a exporte como padrão (`export default`), importe-a em `app.js` e use-a no código.

    • Valide o CPF informado e imprima no console se o CPF informado é válido ou não.

---
## [M1S05] Ex 2 - Classe Fatura

    Em três arquivos (`index.html`, `app.js`, `Fatura.js`) resolva o seguinte exercício:

    Inclua o arquivo `app.js` em `index.html` como `type="module"`.

    Em `Fatura.js`, crie uma classe chamada **Fatura** que possa ser utilizada por uma fábrica, representando um item vendido e a exporte como padrão (`export default`). 

    Uma fatura deve incluir as seguintes informações como atributos :
    • `id`: _number_ identificador do item faturado (código do produto)
    • `descricao`: _string_ com a descrição do item
    • `quantia`: _number_ com a quantidade comprada do item
    • `preco`: _number_ com o preço unitário do item

    Sua classe deve ter um construtor que inicialize todos os atributos. 
    Se a quantidade não for positiva, ela deve ser indicada como `0` (zero). 
    Se o preço por item não for positivo ele deve ser indicado como `0`.
    
    Implemente um **método** chamado `obterValorTotal()` que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço do item).
    
    Importe a classe `Fatura` em `app.js` e crie pelo menos uma instância desta classe para testar a implementação.

    Exemplos:

    const melao = new Fatura(123, "Melão", 2, 3);

    const valor = melao.obterValorTotal();

    console.log(valor); // 6

    Extra: Crie um método _getter_ de nome `valorTotal` que faz o mesmo cálculo implementado em `obterValorTotal`, mas que possa ser acessado sem o uso dos parêntesis.
    
---

## [M1S05] Ex 3 - Classe Personagem

    Em três arquivos (`index.html`, `app.js`, `Personagem.js`) resolva o seguinte exercício:

    Inclua o arquivo `app.js` em `index.html` como `type="module"`.

    Para modelar um jogo de ação, em `Personajem.js`, crie a classe **Personagem** que possua os atributos `nome` e `percentualVida` e a exporte como padrão (`export default`).

    O `nome` deve ser indicado no construtor da classe, e o percentual de vida é iniciado com 100.

    Crie o método `sofreuDano(percentualDano)` cuja implementação diminua o valor de `percentualDano` do percentual de vida do personagem
    (até o limite de zero).

    Crie também o método `usouKitMedico()` que adiciona 10 pontos ao percentual de vida do personagem (até o limite de 100).

    Importe a classe `Personagem` em `app.js` e crie pelo menos uma instância de personagem para testar.

    Exemplo:

    const alyx = new Personagem("Alyx");

    console.log(alyx.percentualVida); // 100

    alyx.sofreuDano(50);

    console.log(alyx.percentualVida); // 50

    alyx.usouKitMedico();

    console.log(alyx.percentualVida); // 60

---

## [M1S05] Ex 4 - Subclasses Animal

    Em três arquivos (`index.html`, `app.js`, `Animal.js`) resolva o seguinte exercício:

    Inclua o arquivo `app.js` em `index.html` como `type="module"`.

    No arquivo `Animal.js`, crie a classe **Animal** com os atributos `nome`, `idade` e `som`.

    Depois crie as subclasses (de **Animal**) **Cachorro** e **Gato** com os atributos `nome` e `idade`, inicializando o atributo `som` da superclasse com `"latido"` e `"miado"`, respectivamente e exporte ambas com `export` comuns.

    Importe as classes `Cahorro` e `Gato` para `app.js`, crie uma instância de cada subclasse para testar, conforme abaixo.

    Exemplos:

    const snoopy = new Cachorro('snoopy', 10);
    console.log( snoopy.som );   // "latido"     
    const frajola = new Gato('frajola', 8);
    console.log( frajola.som );   // "miado"

---

## [M1S05] Ex 5 - Classe Área

    Em três arquivos (`index.html`, `app.js`, `CalculadoraDeArea.js`) resolva o seguinte exercício:

    Inclua o arquivo `app.js` em `index.html` como `type="module"`.

    Em `CalculadoraDeArea.js`, crie uma classe **CalculadoraDeArea** que tenha os atributos `tipo` (_string_), `base` (_number_) e `altura` (_number_).

    Implemente o método `calcular()` que faça o cálculo da área conforme o `tipo` do polígono informado:

    - "triangulo":  `(base * altura) / 2`
    - "quadrado" e "retangulo" : `base * altura`

    Importe a classe `CalculadoraDeArea` em `app.js` e teste a implementação com instâncias dessa classe para um triângulo de base 6 cm e altura 8 cm, para um quadrado de base e altura de 4 cm e um retângulo de base 4 cm e altura 6 cm.

    Imprima o resultado calculado no console.

    Exemplos:


    const quadA = new CalculadoraDeArea("quadrado", 6, 6);
    const areaQA = quadA.calcular();
    console.log(areaQA); // 36

    const triangB = new CalculadoraDeArea("triangulo", 8, 7);
    const areaTB = triangB.calcular();
    console.log(areaTB); // 28


---

## [M1S05] Ex 6 - Classe Juros

    Em três arquivos (`index.html`, `app.js`, `Juros.js`) resolva o seguinte exercício:

    Inclua o arquivo `app.js` em `index.html` como `type="module"`.

    Os juros de uma aplicação podem ser calculados de forma simples ou composta.
    Para o cálculo, geralmente se usa a letra `C` ou `M` para representar o montante final da aplicação, a letra `i` para representar a taxa aplicada (ao mês ou anual) e a letra `t` indicando o tempo (em meses ou anos) da aplicação.

    Em `Juros.js`, crie uma classe **Juros**, que tenha como atributos o `capitalInicial`, a `taxaAplicada` e o `tempo` (no mesmo período: meses ou anos) exportando-a como padrão (`export default`).

    **a)** Adicione o método `calcularJurosSimples()` que faça o cálculo usando a fórmula `J = C * i * t`

    **b)** Adicione o método `calcularJurosCompostos()` que faça o cálculo usando a fórmula `M = C * (1 + i) ** t`

    **c)** Importe a classe em `app.js` e teste a implementação da classe imprimindo no console os valores de juros simples e composto para uma aplicação de 10.000 reais a uma taxa de 7% ao mês (ou seja, 0.07) pelo período de 24 meses.

    **d)** Teste também (imprimindo igualmente no console) os valores de juros simples e composto para uma aplicação de 10.000 reais a uma taxa de 15% ao ano (ou seja, 0.15) pelo período de 10 anos.

---

## [M1S05] Ex 7 - Classe Time

    Em quatro arquivos (`index.html`, `app.js`, `Time.js`, `Partida.js`) resolva o seguinte exercício:

    Inclua o arquivo `app.js` em `index.html` como `type="module"`. 

    O sistema de pontuação por partida no Campeonato Brasileiro de Futebol funciona assim:

        Vitória = 3 pontos
        Derrota = 0 pontos
        Empate  = 1 ponto

    **a)** Em `Time.js`, implemente uma classe **Time** com os atributos: `nome` do time, `sigla` do time, quantidade de `vitorias`, `derrotas`, `empates`, 
    quantidade de `golsMarcados` e `golsSofridos`.

    **b)** Adicione nesta classe métodos _getters_ para atributos calculados: `numeroDeJogos` (soma de vitorias, derrotas e empates) e `numeroDePontos` (aplicando regra de pontuação acima).

    **c)** Em `Partida.js`, crie uma classe **Partida**, com os atributos: `siglaTimeA`, `golsTimeA`, `siglaTimeB`, `golsTimeB`.

    **d)** Adicione na classe `Time` um método `computarPartida`, que receba uma instância (objeto) de `Partida` como argumento. Se a partida recebida como argumento tiver como time participante (time A ou B) o time da classe, 
    deve-se atualizar os atributos de `vitorias`/`derrotas`/`empates` do time dependendo do resultado da partida e `golsMarcados`/`golsSofridos` conforme placar da partida.

    **e)** Adicione mais um método `exibirSituacao()` que imprima no console todos os atributos do time (para conferência das implementações acima).

    **f)** Em `app.js` importe e teste suas classes criando uma instâncias dela e instâncias de partidas a serem computadas, para conferir os resultados.

---

## [M1S05] Ex 8 - Classe Usuário

    Crie uma pagina HTML de autenticacao baseado no layout em anexo.

    Dado a classe __Usuário__ abaixo:


    class Usuario {
        constructor(nome, email, senha) {
            this.nome = nome;
            this.email = email;
            this.senha = senha;
        }

        autenticar(emailInformado, senhaInformada) {
            return (this.email === emailInformado && this.senha === senhaInformada);
        }
    }

    Use esta classe 'Usuário' para implementar a autenticação quando for clicado no botão 'Acessar'.

    Dicas:
    a) Instancie um usuário indicando seus atributos: nome, email e senha (podem ser dados fixos e indicados no momento da criação do objeto).
    b) Colocar no evento relacionado ao botão a chamada para uma função que faça uso do método 'autenticar' deste objeto previamente instanciado.
    c) Se a autenticação tiver sucesso (resultado = true), exibir mensagem de sucesso na tela, caso contrário, exibir mensagem de credenciais inválidas.
    Sugestão: aplique estilo CSS na página para praticar!