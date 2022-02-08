public class Quadrado {
  private double lado;

  public Quadrado(double lado){
    this.setLado(lado);
  }
  public double calcularArea() {
    return lado * lado;
  }

  public double calcularPerimetro() {
    return 4 * lado;
  }
  public double getLado(){
    return lado;
  }
  private void setLado(double lado) {
    if(lado <= 0) {
      throw new IllegalArgumentException("");
    }
    this.lado = lado;
  }
}