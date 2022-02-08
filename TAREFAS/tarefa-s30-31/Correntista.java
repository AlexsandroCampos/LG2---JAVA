import java.util.List;
import java.util.ArrayList;

public class Correntista{
  private int codigo;
  private String nome; 
  private List<Conta> contas;

  public Correntista(int codigo, String nome){
    this.contas = new ArrayList<>();
    this.codigo = codigo;
    this.nome = nome;
  }

  public void addConta(Conta conta){
    this.contas.add(conta);
  }

  public double totalTarifas(){
    double tarifaTotal = 0.0;
    for (Conta conta : contas) {
      tarifaTotal = tarifaTotal + conta.calcularTarifa();
    }
    return tarifaTotal;
  }

   public int getCodigo(){
    return this.codigo;
  }

   public String getNome(){
    return this.nome;
  }

   public List<Conta> getContas(){
    return this.contas;
  }  
}