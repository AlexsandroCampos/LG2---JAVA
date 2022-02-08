import java.util.List;
import java.util.ArrayList;

public class Aviao{
  private int numero;
  private double pesoLimite;
  private List<Carga>cargas;

  public Aviao(double pesoLimite, int numero){
    this.cargas = new ArrayList<>();
    this.pesoLimite = pesoLimite;
    this.numero = numero;
  }

  public void adicionarCarga(Carga carga){
    if(getTotalPeso()+carga.getPeso() > pesoLimite) {
      throw new IllegalArgumentException("");
    }
    cargas.add(carga);
  }

  public double getTotalPeso(){
    double pesoTotal = 0.0;
    for (int i=0; i<cargas.size(); i++){
      pesoTotal = pesoTotal + cargas.get(i).getPeso();
    }
    return pesoTotal;
  }

  public double getTotalDisponível(){
    return  pesoLimite - getTotalPeso();
  }

  public int getNumero(){
    return numero;
  }

  public double getPesoLimite(){
    return pesoLimite;
  }

  public List<Carga> getCargas(){
    return cargas;
  }

}