import java.time.LocalDate;

public abstract class Conta{
  private int numero;
  private LocalDate dataAbertura;
  protected double saldo;
  protected double tarifa;
  private Correntista correntista;

  public Conta(int numero, LocalDate dataAbertura, double tarifa, Correntista correntista){
    this.numero = numero;
    this.dataAbertura = dataAbertura;
    this.tarifa = tarifa;
    this.correntista = correntista;
    correntista.addConta(this);
  }

  public void sacar(double valor) {
    if(saldo >= valor) {
      saldo = saldo - valor;
    }
    else{
      throw new IllegalArgumentException("");
    }
  }

  public void depositar(double valor) {
    if(valor > 0){
      saldo = saldo + valor;
    }
    else{
      throw new IllegalArgumentException("");
    }
  }

  public abstract double calcularTarifa();

  public int getNumero(){
    return this.numero;
  }

  public LocalDate getDataAbertura(){
    return this.dataAbertura;
  }

  public Correntista getCorrentista(){
    return this.correntista;
  }

  public double getSaldo(){
    return this.saldo;
  }
}