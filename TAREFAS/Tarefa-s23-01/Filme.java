import java.util.List;
import java.util.ArrayList;

public class Filme {
  private String titulo;
  private Integer ano;
  private List <Papel> papeis;
  
  public Filme (String titulo, Integer ano ) {
    this.papeis = new ArrayList<>();
    this.titulo = titulo;
    this.ano = ano;
  }

  public void contratarAtor(Ator ator, String personagem) {
    Papel papel = new Papel( personagem, ator, this);
    this.addPapel(papel);
    ator.addPapel(papel);
  }

  public String getTitulo() {
    return titulo;
  }

  public Integer getAno() {
    return ano;
  }

  public void addPapel (Papel papel) {
    this.papeis.add(papel);
  }

  public List<Papel> getPapel() {
    return papeis;
  }
}
