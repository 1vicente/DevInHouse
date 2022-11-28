## [M1S08] Ex 1 - Criação do projeto - Criar uma aplicação angular usando o CLI

- Criação do projeto - Criar uma aplicação angular usando o CLI
  - sem roteamento (routing=false)
  - style(scss)
  - com o prefixo **ntap**	
- No template principal escreva Hello World

## [M1S08] Ex 2 - Instalação do Bootstrap Framework CSS que vamos utilizar para estilizarmos nossa aplicação

- Instalação do Bootstrap Framework CSS que vamos utilizar para estilizarmos nossa aplicação
- Configure os arquivos na configuração de estilo do projeto angular
- No template principal adicione algum componente do bootstrap só para testar o funcionamento da biblioteca
  (pode ser botão ou um card simples)

## [M1S08] Ex 3 - Crie um componente para a listagem de notificações (notification-list)

- Crie um componente para a listagem de notificações (notification-list)
- Sugestão para componente do bootstrap (list-group-item)
- Adicione alguns itens de exemplos para listagem
- Título, subtítulo e data.

‌
## [M1S08] Ex 4 - Criação de menu superior(navbar)

- criação de menu superior(navbar)
  - adicione a logo imagem e o nome da aplicação (NotificationApp)
  - Por enquanto, pode ser adicionado no componente de listagem, posteriormente será movido para seu próprio componente

## [M1S08] Ex 5 - Criação de rodapé (footer)

- criação de rodapé (footer)
  - Informações do ano de criação da aplicação e a empresa.
  - Por enquanto, pode ser adicionado no componente de listagem, posteriormente será movido para seu próprio componente.

## [M1S08] Ex 6 - Transforme o menu superior e o rodapé e um componente para cada (header e footer)

- Transforme o menu superior e o rodapé e um componente para cada (header e footer).
- Chame através das tags do seletor dentro do componente da listagem.
  
## [M1S08] Ex 7 - Mover valores estáticos que estão no template para passar a olhar para o TS do componente.

- Crie uma variável no arquivo TS do componente para os valores estáticos que estão no template para passar a olhar para o TS do componente.


## [M1S08] Ex 8 - Extrair da variável para uma arquivo typescript só para armazenar os valores estáticos

- Extrair da variável para uma arquivo typescript só para armazenar os valores estáticos.
- Utilize o ng-for para realizar o loop no template.
  
## [M1S08] Ex 9 - Adicionar evento ao clique do botão

- Adicione uma nova propriedade booleana "lido" para os objetos na constante.
- Crie um botão para "lido" quando for realizado o clique do botão, deve alterar o status de "false" para "true".

‌
## [M1S08] Ex 10 - Crie uma classe de estilização para diminuir a opacidade da linha ou alteração da cor da fonte

- Crie uma classe de estilização para diminuir a opacidade da linha ou alteração da cor da fonte.
- Quando acontecer o clique no botão o valor do lido passara a ser "true" e no template deve ser adicionado um ngClass.