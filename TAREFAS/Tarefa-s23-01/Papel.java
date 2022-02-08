public class Papel {
  private String personagem;
  private Ator ator;
  private Filme filme;

  public Papel(String personagem, Ator ator, Filme filme) {
    this.personagem = personagem;
    this.ator = ator;
    this.filme = filme;
  }

  public String getPersonagem() {
    return personagem;
  }

  public Ator getAtor() {
    return ator;
  }

  public Filme getFilme() {
    return filme;
  }
}