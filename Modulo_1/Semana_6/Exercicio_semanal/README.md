# Semana 6 DiH

## [M1S06] Ex 1 - Sleep

    Crie uma função chamada **sleep**, que recebe como argumento um  valor qualquer.

    Quando chamada, essa função precisa retornar, após 3 segundos (setTimeout), uma Promise resolvida com o valor que foi passado como argumento.

    Ex.:

    function sleep ( valor ) {
    return new Promise ( (res, rej) => { 
        setTimeout( ... )
    })
    }

    Chame esta função e confirme o funcionamento dela (lembre-se que o valor do tempo de espera é aproximado!)

---
## [M1S06] Ex 2 - Timer

    Utilizando o **setInterval**, crie uma função que mostre o horário atual e atualize automaticamente a cada 2 segundos.

    O horário deve ser mostrado no formato **HH:MM:SS**.
    ---

## [M1S06] Ex 3 - Promise (all)

    Para aprovação de um empréstimo, um banco usa as funções descritas abaixo:
    - Aprovação do cadastro pessoal 
    - Aprovação do valor solicitado
    Ambas retornam uma promise para fazer o  processamento em segundo plano (no código, este processamento está simulado).

    Para o cliente instanciado no código abaixo, foram executadas ambas as funções e criadas variáveis para armazenar este retorno.

    Usando o método '**Promise.all()**', recupere o resultado de ambas as promises e imprima 'APROVADO' ou 'REPROVADO', conforme os resultados das promises forem resolvidos ou rejeitados.

    Por fim, imprima a frase 'Fim do Processamento', qualquer que seja o resultado (resolve ou reject) das promises ('finally').

    javascript
    function aprovarDadosCadastrais( cliente ) {
        return new Promise( (resolve, reject) => {
            if (cliente.cpf === 11111111111)
                resolve(true);
            else 
                reject(false);
        });
    }

    function aprovarValorSolicitado( cliente, valor ) {
        return new Promise( (resolve, reject) => {
            if (cliente.margem >= valor)
                resolve(true);
            else 
                reject(false);
        });
    }

    const cliente = { cpf: 11111111111, nome: 'Calleri', margem: 1000.0 };
    const aprovacaoCadastro = aprovarDadosCadastrais(cliente);
    const aprovacaoValor = aprovarValorSolicitado(cliente, 300.0);

    // continue com o tratamento dos resultados de ambas as promises...
---

## [M1S06] Ex 4 - Promise (race)

    O sistema de uma empresa, após efetuar a venda, chama funções remotas de duas empresas de entrega dos pedidos, e aquela que responder mais rápido nossa requisição fica responsável pela entrega.

    O retorno das chamadas foram adicionados nas constantes abaixo: '_retornoEmpresa1_' e '_retornoEmpresa2_'.

    Usando '**Promise.race()**', recupere o valor da promise da empresa vencedora e imprima o resultado.

    javascript
    const retornoEmpresa1 = new Promise( (resolve, reject) => 
        setTimeout(resolve, 5000, "Empresa 1") ); // 5 segundos
    const retornoEmpresa2 = new Promise( (resolve, reject) => 
        setTimeout(resolve, 3000, "Empresa 2") ); // 3 segundos

    // ... continue daqui ....  


---

## [M1S06] Ex 5 - async-await

    Altere as funções abaixo usando **async-await** para retorno e tratamento de promises:

    javascript
    function obterClienteNoBancoDeDados(idCliente) {
        return new Promise( (resolve, reject) => {
                const cliente = { nome: 'bruce wayne', id: idCliente };
                resolve(cliente);
        });
    }

    function processar() {
        obterClienteNoBancoDeDados(7)
            .then(cliente => console.log(cliente));
    }

    processar();

---

## [M1S06] Ex 6 - Fetch

    Existe uma API pública que retorna a idade média das pessoas que possuem o nome passado como parâmetro.
    Para o cálculo, é usada uma base de dados interna deles, que pode ser subdividida pelo país passado também como parâmetro.

    Faça uma chamada para esta API e descubra a idade média das pessoas com seu nome aqui no Brasil, conforme exemplo abaixo. 
    Imprima o nome e a idade média retornados.
    A idade está representada na propriedade '_age_' do retorno da API:

    https://api.agify.io/?country_id=BR&name=thais

    _Obs_.: Se seu nome não constar na base deles (age == null), usar outro nome para os testes.

---

## [M1S06] Ex 7 - Fetch

    Quanto será que está a preço do Bitcoin hoje???
    Vamos descobrir!

    Obtenha os dados nessa API : https://api.coincap.io/v2/assets/bitcoin, imprima a frase:
    '_O preço do Bitcoin - <simbolo do bitcoin> em dólares hoje é $ <preço do bitcoin>_`.

    Dicas:
    a) Repare que o retorno desta API encapsula os dados dentro de um objeto '_data_'.
    b) Use as propriedades '_symbol_' e '_priceUsd_' do retorno para preencher os valores na frase.

---

## [M1S06] Ex 8 - Fetch

    Existe a API **'Random User Generator'**, que gera usuários fakes para fins de testes e protótipos.
    Vamos usá-la para praticar e consumir APIs com promises.

    A URL da API é esta abaixo, onde o argumento 'results' representa a quantidade de resultados que queremos retornar:
    https://randomuser.me/api/?results=4

    Verifique a documentação e exemplo de retorno em: 
    https://randomuser.me/documentation#howto, ou 
    faça uma chamada para a API (no navegador ou console) para verificar um exemplo de resultado.

    Com base no json de retorno, monte uma página web com layout semelhante ao **anexo**, contendo dados de usuários de sistema com 
    foto, título, nome, sobrenome, e-mail e endereço completo.
    O layout (css) é livre, desde que apresente as informações solicitadas.

    **Dicas**:
    a) Perceba que os resultados ficam dentro do campo _'results'_ do json de retorno;
    b) Para a foto, use a versão grande do campo _'picture'_: 'large' (grande);
    c) Para o nome, use os campos de _'name'_: 'title' (título), 'first' (nome), 'last' (sobrenome);
    d) Para o endereço, use os campos de _'location'_: 'street' (rua), 'city' (cidade), 'state' (estado), 'country' (país);
    e) Como é uma chamada remota para o serviço, o resultado pode demorar alguns segundos para retornar.

    **extra**:
    Adicione um campo para que o usuário selecione a quantidade de itens que deseja exibir