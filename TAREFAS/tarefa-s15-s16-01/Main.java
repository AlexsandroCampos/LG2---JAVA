class Main {
  public static void main(String[] args) {
    Quadrado q1 = new Quadrado(5);
    System.out.println(q1.lado);
    System.out.println(q1.calcularArea());
    System.out.println(q1.calcularPerimetro());

    System.out.println("-----------");

    Quadrado q2 = new Quadrado(10);
    System.out.println(q2.lado);
    System.out.println(q2.calcularArea());
    System.out.println(q2.calcularPerimetro());

    System.out.println("-----------");

    Retangulo r1 = new Retangulo(20, 10);
    System.out.println(r1.base);
    System.out.println(r1.altura);
    System.out.println(r1.calcularArea());
    System.out.println(r1.calcularPerimetro());

    System.out.println("-----------");

    Retangulo r2 = new Retangulo(30, 11);
    System.out.println(r2.base);
    System.out.println(r2.altura);
    System.out.println(r2.calcularArea());
    System.out.println(r2.calcularPerimetro());

    System.out.println("-----------");

    Retangulo r3 = new Retangulo(40, 29);
    System.out.println(r3.base);
    System.out.println(r3.altura);
    System.out.println(r3.calcularArea());
    System.out.println(r3.calcularPerimetro());

    System.out.println("-----------");

    Circulo c1 = new Circulo(9);
    System.out.println(c1.raio);
    System.out.println(c1.calcularArea());
    System.out.println(c1.calcularPerimetro());

    System.out.println("-----------");

    Circulo c2 = new Circulo(15);
    System.out.println(c2.raio);
    System.out.println(c2.calcularArea());
    System.out.println(c2.calcularPerimetro());

    System.out.println("-----------");

    Circulo c3 = new Circulo(5);
    System.out.println(c3.raio);
    System.out.println(c3.calcularArea());
    System.out.println(c3.calcularPerimetro());

    System.out.println("-----------");

    Conta co1 = new Conta(1, 0.0, 10.0);

    Conta co2 = new Conta(2, 100.00, 50.0);

    co1.depositar(120.00);
    co2.depositar(50.00);

    co1.sacar(110.00);
    co2.sacar(200.00);

    co1.transferir(co2, 10.00);
    co1.transferir(co2, 30.00);

    System.out.println(co1.saldo);
    System.out.println(co2.saldo);
  }
}