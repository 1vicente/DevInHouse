## [M1S09] Ex 1 - Bootstrap

Em um projeto angular, crie um novo template para um formulário de registro de matérias usando classes de estilização e estrutura bootstrap, o visual e a estrutura usando classes do bootstrap será avaliado, portanto caprichem no design ^-^.
O formulário deverá ter os seguintes campos inputs: **“nome”**, **“carga horária de horas aula”** e **“escola”**. Também no formulário deverá ter um campo **“Professor(a)”** que será um select com 4 opções, Otávio, Vivian, Leandro e Cláudia, além disso dois radiobutton verificando se a **matéria é opcional** ou não.
___
## [M1S09] Ex 2 - Componentes do bootstrap

No mesmo projeto angular crie um botão de enviar formulário que ao clicar carregue um modal do bootstrap com a mensagem “Formulário enviado com sucesso” e um botão para fechar o modal.

OBS: lembrar de importar o script js do bootstrap no arquivo angular.json
___
## [M1S09] Ex 3 - Componentes

Crie um componente geral com estilizações do bootstrap chamado navbar que será a principal forma de navegação de um site fictício.
Ex: https://getbootstrap.com/docs/5.2/components/navbar/#how-it-works

No final para verificar seu funcionamento chame o navbar no componente inicial (app)
___
## [M1S09] Ex 4 - Componente (Parte 1)

Crie um componente que será um card, este card poderá ser utilizado para indicar algumas informações sobre personagens da sua série favorita, exemplo, minha série favorita é **Game Of Thrones**, um de seus personagens é o Jon Snow. Essas informações são: **nome**, uma **imagem**, **nome do ator**, e uma breve **descrição**. No início esse componente será chamado de item-card e as informações serão fixas, escolha apenas um personagem.

___
## [M1S09] Ex 5 - Property Binding (Parte 2)

Parte 2. 
Com o mesmo componente criado anteriormente no exercício 2 iremos com a ajuda do property binding criaremos um objeto chamado personagem com o seguinte formato:
Exemplo:


```
	pesonagem: any = {
	    nome: 'Jon Snow',
	    imagem: 'https://tm.ibxk.com.br/2022/08/26/26174558850404.jpg?	ims=704x264',
	    nomeAtor: 'Kit Harington',
	    descricao:
	      'Ator ator britânico. É mais conhecido por interpretar Jon Snow na 	série televisiva Game of Thrones da HBO. Meu marido, mas ele não sabe U.u',
	  };
```


Sua missão será passar cada informação do objeto através do property binding, para substituir as informações antes fixas no template do componente item-card.

___
## [M1S09] Ex 6 - @Input (Parte 3)

Parte 3. 
Continuando nossa função de tornar um componente dinâmico iremos mudar a declaração do objeto, anteriormente criado no próprio componente, para ser passada através do **@input** do componente pai para o filho (item-card).
___
## [M1S09] Ex 7 - Injeção de dependência

Para praticar mais a organização de responsabilidades feita no front e também a injeção de dependências, iremos simular um projeto com comunicação para o localStorage. Primeiro crie um service para fazer a comunicação com o controlador do template e o envio de dados ao localStorage. 
A temática será a mesma abordada nas aulas. No html do template deverá ter um formulário bootstrap com dois inputs, um para capturar o email e outro para a senha, além disso também deverá haver um botão de enviar. Através do evento de click, visto rapidamente em aula envie esses dados até o localStorage no formato de objeto.
Deverá ser feito a injeção de dependência do service criado, para o controller.

**OBS: lembre-se do fluxo de informações: 
TEMPLATE > CONTROLLER > SERVICE > LOCAL STORAGE**

## [M1S09] Ex 8 - @Output

Com um componente de busca criado, adicione inicialmente apenas um input para receber a pesquisa, adicione um @output e chame-o por meio do componente pai (app).

A cada tecla digitada na busca, um console.log deve ser aberto em home com o texto que está sendo formado.