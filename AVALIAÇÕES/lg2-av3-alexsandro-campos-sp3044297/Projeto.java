import java.util.List;
import java.util.ArrayList;

public class Projeto{
  private String titulo;
  private boolean ativo;
  private Curso curso;
  private List<Pessoa> participantes;

  public Projeto(String titulo, boolean ativo, Curso curso){
    this.participantes = new ArrayList<>();
    this.titulo = titulo;
    this.ativo = ativo;
    this.curso = curso;
    curso.adicionarProjeto(this);
  }

  public String getTitulo(){
    return this.titulo;
  }

   public boolean getAtivo(){
    return this.ativo;
  }

   public Curso getCurso(){
    return this.curso;
  }

  public List<Pessoa> getParticipantes(){
    return this.participantes;
  }

  public void adicionarParticipante(Pessoa pessoa){
    if(this.ativo == false){
      throw new RuntimeException("Não é possível adicionar participante em um projeto não ativo");
    }
    else{
      this.participantes.add(pessoa);
    }
  }

  public int getNumeroParticipantes(){
    return participantes.size();

  }
}