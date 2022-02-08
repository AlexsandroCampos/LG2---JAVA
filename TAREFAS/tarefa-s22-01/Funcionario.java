import java.util.List;
import java.util.ArrayList;

public class Funcionario{
  private String nome;
  private List<Funcionario> subordinados;

  public Funcionario(String nome){
    this.subordinados = new ArrayList<>();
    this.nome = nome;
  }

  public void addSubordinado(Funcionario funcionario){
    if(getQuantidadeSubordinados() < 5){
      this.subordinados.add(funcionario);
    }
    else{
      throw new IllegalArgumentException("");
    }
  }

  public String getNome(){
    return this.nome;
  }

  public List<Funcionario> getSubordinados(){
    return this.subordinados;
  }

  public boolean isChefe(){
    return this.subordinados.size() > 0;
  }

  public int getQuantidadeSubordinados(){
    return this.subordinados.size();
  }
}