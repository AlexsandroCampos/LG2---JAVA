import java.util.List;
import java.util.ArrayList;

public class Ator {
  private String nome;
  private List<Papel> papeis;


  public Ator (String nome) {
    this.papeis = new ArrayList<>();
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void addPapel (Papel papel) {
    this.papeis.add(papel);
  }

  public List<Papel> getPapel() {
    return papeis;
  }
}

