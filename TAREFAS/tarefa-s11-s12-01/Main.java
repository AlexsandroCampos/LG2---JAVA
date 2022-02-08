class Main {
  public static void main(String[] args) {
    Quadrado q1 = new Quadrado();
    q1.lado = 5;
    System.out.println(q1.lado);
    System.out.println(q1.calcularArea());
    System.out.println(q1.calcularPerimetro());

    System.out.println("-----------");

    Quadrado q2 = new Quadrado();
    q2.lado = 10;
    System.out.println(q2.lado);
    System.out.println(q2.calcularArea());
    System.out.println(q2.calcularPerimetro());

    System.out.println("-----------");

    Retangulo r1 = new Retangulo();
    r1.base = 20;
    r1.altura = 10;
    System.out.println(r1.base);
    System.out.println(r1.altura);
    System.out.println(r1.calcularArea());
    System.out.println(r1.calcularPerimetro());

    System.out.println("-----------");

    Retangulo r2 = new Retangulo();
    r2.base = 30;
    r2.altura = 11;
    System.out.println(r2.base);
    System.out.println(r2.altura);
    System.out.println(r2.calcularArea());
    System.out.println(r2.calcularPerimetro());

    System.out.println("-----------");

    Retangulo r3 = new Retangulo();
    r3.base = 40;
    r3.altura = 29;
    System.out.println(r3.base);
    System.out.println(r3.altura);
    System.out.println(r3.calcularArea());
    System.out.println(r3.calcularPerimetro());

    System.out.println("-----------");

    Circulo c1 = new Circulo();
    c1.raio = 9;
    System.out.println(c1.raio);
    System.out.println(c1.calcularArea());
    System.out.println(c1.calcularPerimetro());

    System.out.println("-----------");

    Circulo c2 = new Circulo();
    c2.raio = 15;
    System.out.println(c2.raio);
    System.out.println(c2.calcularArea());
    System.out.println(c2.calcularPerimetro());

    System.out.println("-----------");

    Circulo c3 = new Circulo();
    c3.raio = 5;
    System.out.println(c3.raio);
    System.out.println(c3.calcularArea());
    System.out.println(c3.calcularPerimetro());

    System.out.println("-----------");
  }
}