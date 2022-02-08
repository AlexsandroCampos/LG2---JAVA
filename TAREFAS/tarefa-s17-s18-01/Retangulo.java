public class Retangulo{
  private double base;
  private double altura;

  public Retangulo(double base, double altura){
    this.setBase(base);
    this.setAltura(altura);
  }
  public double calcularArea(){
    return base*altura;
  }
  public double calcularPerimetro(){
    return 2*(base + altura);
  }
  public double getBase(){
    return base;
  }
  public double getAltura(){
    return altura;
  }
  private void setBase(double base) {
    if(base <= 0) {
      throw new IllegalArgumentException("");
    }
    this.base = base;
  }
  private void setAltura(double altura) {
    if(altura <= 0) {
      throw new IllegalArgumentException("");
    }
    this.altura = altura;
  }
}