import java.util.List;
import java.util.ArrayList;

public class Empresa{
  private String cnpj;
  private String nome;

  public Empresa(String cnpj, String nome){
    this.cnpj = cnpj;
    this.nome = nome;
  }
  
  public String getCnpj(){
    return this.cnpj;
  }

  public String getNome(){
    return this.nome;
  }
}