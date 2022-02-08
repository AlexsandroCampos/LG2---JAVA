class Main {
  public static void main(String[] args) {

    Faxineiro f1 = new Faxineiro(2000.0, 300.0);
    Secretaria s1 = new Secretaria(2000.0, 300.0);

    System.out.println(f1.calcularSalario());
    System.out.println(s1.calcularSalario());
  }
}

