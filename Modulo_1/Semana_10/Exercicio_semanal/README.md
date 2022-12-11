
# [M1S01] Roteiro de Exercícios
Projeto Notificações - Continuação

‌

![](https://trello.com/1/cards/638e30effba2a90171c98bd5/attachments/638e32be35789d01120d1d61/download/image.png)

Fala Turma!
Leiam atentamente as informações deste card pois ele será um guia para realizações dos exercícios.  O objetivo será a continuação do nosso projeto NotificationApp. Vamos adicionar novas funcionalidades durante essa semana!

_Basicamente trata-se de uma aplicação web que uma lista de notificações._

**Lembram-se:** _"Em cada etapa/exercício execute o projeto e verifique se tudo está funcionando corretamente, sem erros no console do navegador e do terminal onde foi executado o comando para subir a aplicação"_

‌Ex 1 - Preparação do projeto
Ex 2 - Criação do componente de filtro
Ex 3 - Criação de Evento do componente filtro com o componente "pai" (o componente que chama ele)
Ex 4 - Criação de Páginas
Ex 5 - Configuração de roteamento
Ex 6 - Configuração de rotas - Continuação	
Ex 7 - Utilização de roteamento dinamico
Ex 8 - Comunicação entre componente de Filtro e Listagem
Ex 9 - Lógica do método vinculado ao evento de saída do componente de Filtro
Ex 10 - Configurar o redirecionamento das opções de menu no componente de cabeçalho (header)
___
## [M1S10] Ex 1 - Preparação do projeto
**Preparação do projeto**
	\- Utilize o mesmo projeto referente a lista de exercícios da semana 8 (NotificationApp)
	outra opção e fazer o clone do repositório para continuarmos do ponto que paramos

```
<https://github.com/DEVin-Philips/curso-angular/tree/main/notification-app>
```
‌___
## [M1S10] Ex 2 - Criação do componente de filtro
**Criação do componente de filtro**
	\- Crie um componente para filtro
	\- Neste componente adicione 3 botões para realização da filtragem (Todos, Lidos, Não Lidos)
	Sugestão: Ao invés de repetir o botão você pode optar pela criação de uma lista com essas opções
	e no template utilizar essa lista paga criar os botões de acordo com a lista utilizando o ngFor.

___
## [M1S10] Ex 3 - Criação de Evento do componente filtro com o componente "pai" (o componente que chama ele)
**Criação de Evento do componente filtro com o componente "pai" (o componente que chama ele)**
	\- Crie uma variavel do tipo Output dentro do componente de filtro e
	inicialize com uma instancia do event emitter do tipo string
	\- Crie Método para capturar o evento de click dos botões do filtro
	Ainda neste método dispare o emit da variavel output que foi criada anteriormente
___
## [M1S10] Ex 4 - Criação de Páginas
**Criação de Páginas**
	\- Crie dois componentes que serão as duas páginas que teremos na aplicação
	\- Utilize o Angular CLI para criação dos componentes
	Sugestão: Adicione os dois componentes dentro de uma pasta pages ficando com o caminho app/pages/componente-que-criou
	\- Crie o componente Home e About


___
## [M1S10] Ex 5 - Configuração de roteamento
**Configuração de roteamento**
\- Crie o componente Home (app/pages/home)
\- Mova o componente onde "abraça" a listagem de notificações para este componente home	
Hoje ele está dentro do app.component.html
Agora ao invés de chamar o componente da listagem no app.component.html você pode chamar o home.component.html

- Crie o componente About (app/pages/sobre)
- Crie um titulo e uma descrição fictícia	

‌___
## [M1S10] Ex 6 - Configuração de rotas - Continuação
**Configuração de rotas - Continuação**		
	\- Esta configuração pode ser feita sem arquivo específico de roteamento (routing) ou se caso quiser utilizar o arquivo app.routing.ts
	para organizar melhor a responsabilidade	
	\- Dentro do arquivo app.module.ts adicione a configuração de roteamento root do RouterModule
	\- Para a constante que será o argumento da chamada do root você pode criar 3 endereços(paths)
	para aplicação
	\- Endereço "/" e "/home" será responsavél pela renderização do componente Home
	\- O endereço "/" irá redirecionar para o "/home"
	\- Endereço "/sobre" será responsavél pela renderização do componente Sobre

```
Obs: O endereço do path Home terá 3 variações
	"home/lidos"
	"home/nao-lidos"
	"home/todos"	
```
‌
## [M1S10] Ex 7 - Utilização de roteamento dinamico
**Utilização de roteamento dinamico**
Após configuração você precisa voltar ao app.component.html e utilizar a tag de roteamento (router-outlet)
para que o angular saiba qual componente irá renderizar de acordo com a configuração definida

- Após essa configuração você pode testar a renderização passando direto na URL o endereço que você quer navegar

‌
___
## [M1S10] Ex 8 - Comunicação entre componente de Filtro e Listagem
**Comunicação entre componente de Filtro e Listagem**
	\- Agora vamos voltar no momento do filtro para realizar o redirecionamento correto baseado no botão escolhido
	\- No componente pai (Listagem) precisa receber o event emitter do componente filho (Filtro)
	\- Crie um método dentro do componente de Listagem para receber esse evento de saída (output) do componente de filtro
	\- Agora na chamada do componente de filtro dentro do template(html) da listagem Vincule o método de saída		
___
## [M1S10] Ex 9 - Lógica do método vinculado ao evento de saída do componente de Filtro
**Lógica do método vinculado ao evento de saída do componente de Filtro**
\- Adicione a lógica para este método para que quando receber o filtro deve acionar a rota com o parametro específico
\- No método de inicialização do componente precisamos criar essa lógica
\- Não esqueça de realização a injeção do router
\- capturar filtro por rota
\- o valor do filtro irá fazer uma filtragem na lista de registros
para saber se vai apresentar apenas as notifcações lidas, não lidas e todas
___
## [M1S10] Ex 10 - Configurar o redirecionamento das opções de menu no componente de cabeçalho (header)
**Configurar o redirecionamento das opções de menu no componente de cabeçalho (header)**
	\- Adicione o seletor RouterLink passando o path que de acordo com as opções
	\- Para a opção de menu Home adicione o path "/" ou "/home"
	\- Para a opção de menu Sobre adicione o path "/sobre"
	\- Após essa configuração você já conseguirá navegar entre as páginas pelo menu