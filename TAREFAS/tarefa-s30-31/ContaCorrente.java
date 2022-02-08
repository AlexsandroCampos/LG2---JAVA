import java.time.LocalDate;

public class ContaCorrente extends Conta{
  private double limite;

  public ContaCorrente(int numero, LocalDate dataAbertura, double tarifa, Correntista correntista, double limite){
    super(numero, dataAbertura, tarifa, correntista);
    this.limite = limite;
  }

  public double calcularTarifa(){
    return this.tarifa * 1.5;
  }

  public void sacar(double valor) {
    if(saldo + limite >= valor) {
      saldo = saldo - valor;
    }
    else{
      throw new IllegalArgumentException("");
    }
  }

  public double getLimite(){
    return this.limite;
  }

}