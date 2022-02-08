public class Conta {
  private int codigo;
  private double saldo;
  private double limite;

  public Conta(int codigo, double saldo, double limite){
    this.setCodigo(codigo);
    this.setSaldo(saldo);
    this.setLimite(limite);
  }
  public void depositar(double valor) {
    if(valor > 0){
      saldo = saldo + valor;
    }
    else {
      throw new IllegalArgumentException("");
    }
  }

  public void sacar(double valor) {
    if(saldo + limite >= valor) {
      saldo = saldo - valor;
    }
    else {
      throw new IllegalArgumentException("");
    }
    
  }

  public void transferir(Conta conta, double valor) {
    if(saldo + limite >= valor) {
      saldo = saldo - valor;
      conta.saldo = conta.saldo + valor;
    }
    else {
      throw new IllegalArgumentException("");
    }
  }
  public int getCodigo(){
    return codigo;
  }
  public double getSaldo(){
    return saldo;
  }
  public double getLimite(){
    return limite;
  }
  private void setCodigo(int codigo) {
    if(codigo < 0) {
      throw new IllegalArgumentException("");
    }
    this.codigo = codigo;
  }
  private void setSaldo(double saldo) {
    if(saldo < 0) {
      throw new IllegalArgumentException("");
    }
    this.saldo = saldo;
  }
  private void setLimite(double limite) {
    if(limite <= 0) {
      throw new IllegalArgumentException("");
    }
    this.limite = limite;
  }
  
}