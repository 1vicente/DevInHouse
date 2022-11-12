
const comunicaApi = fetch('https://randomuser.me/api/?results=4')
  .then((response) => response.json()
    .then((data) => retornoHtml(data))
    );

const retornoHtml = retornoApi => {

  const retornoApi2 = retornoApi.results
  let retornoNome
  let retornoEmail
  let retornoEndereco
  let retornoFoto
  let insereAblablublu
  retornoJs.innerHTML = ""
  console.log(retornoApi2);
  let i = 1
  

  retornoApi2.forEach(user => {
    retornoNome = `${user.name.title} ${user.name.first} ${user.name.last}` 
    retornoEmail = `${user.email}`
    retornoEndereco = `${user.location.street.name} - ${user.location.street.number}, ${user.location.city} - ${user.location.state} - ${user.location.country}`
    retornoFoto = `${user.picture.large}`


    retornoJs.innerHTML += `<div class="container">
    <div class="imagem">
        <img src="${retornoFoto}" alt="">
    </div>
    <div class="ablablublu">
        <p> ${retornoNome}</p>
        <p> ${retornoEmail}</p>
        <p> ${retornoEndereco}</p>
        </div>
    </div>
    `
    console.log(i++, retornoNome, retornoEmail, retornoEndereco,retornoFoto)


  });
}

const retornoJs = document.getElementById('retornoAtividade')