public class Faxineiro implements Salario{
  private double salarioFixo;
  private double ValorHorasExtras;

  public Faxineiro(double salarioFixo, double ValorHorasExtras){
    this.salarioFixo = salarioFixo;
    this.ValorHorasExtras = ValorHorasExtras;
  }

  public double calcularSalario(){
    return salarioFixo + ValorHorasExtras;
  }

}