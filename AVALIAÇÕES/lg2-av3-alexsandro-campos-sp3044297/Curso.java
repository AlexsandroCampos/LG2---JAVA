import java.util.List;
import java.util.ArrayList;

public class Curso{
  private String nome;
  private String sigla;
  private List<Projeto> projetos;

  public Curso(String nome, String sigla){
    this.projetos = new ArrayList<>();
    this.nome = nome;
    this.sigla = sigla;
  }

  public String getNome(){
    return this.nome;
  }

  public String getSigla(){
    return this.sigla;
  }

  public List<Projeto> getProjetos(){
    return this.projetos;
  }

  public void adicionarProjeto(Projeto projeto){
    this.projetos.add(projeto);
  }

  public int getNumeroProjetos(){
    return projetos.size();
  }

  public int getNumeroProjetosAtivos(){
    int numeroProjetosAtivos = 0;

    for(int i=0; i<this.projetos.size(); i++){
      if(projetos.get(i).getAtivo() == true){
        numeroProjetosAtivos = numeroProjetosAtivos + 1;
      }
    }

    return numeroProjetosAtivos;
  }

  public List<Projeto> getProjetosAtivos(){
    List<Projeto> projetosAtivos = new ArrayList<>();
    for (Projeto projeto: this.projetos) {
      if(projeto.getAtivo() == true){
        projetosAtivos.add(projeto);
      }
    }
    return projetosAtivos;
  }
  
}