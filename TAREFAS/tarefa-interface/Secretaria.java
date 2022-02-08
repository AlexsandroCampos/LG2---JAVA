public class Secretaria implements Salario{
  private double salarioFixo;
  private double ValorHorasExtras;

  public Secretaria(double salarioFixo, double ValorHorasExtras){
    this.salarioFixo = salarioFixo;
    this.ValorHorasExtras = ValorHorasExtras;
  }

  public double calcularSalario(){
    return salarioFixo + (ValorHorasExtras*0.5);
  }
}


