class Main {
  public static void main(String[] args) {

    Vendedor v1 = new Vendedor("Luana", 10000.0, 10.0);
    VendedorFixo vx1 = new VendedorFixo("Marcos", 40000.0, 13.0, 2000.0);

    System.out.println(v1.obterSalario());
    System.out.println(vx1.obterSalario());
  }
}