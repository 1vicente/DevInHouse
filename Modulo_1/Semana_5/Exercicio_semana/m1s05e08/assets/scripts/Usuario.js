export class Autentica {
  constructor(nome, email, senha) {
      this.nome = nome;
      this.email = email;
      this.senha = senha;
  }

  login(emailInformado, senhaInformada) {
      return (this.email === emailInformado && this.senha === senhaInformada);
  }
}