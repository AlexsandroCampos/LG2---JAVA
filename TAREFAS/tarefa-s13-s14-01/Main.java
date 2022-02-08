class Main {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.codigo = 1;
    c1.saldo = 0.0;
    c1.limite = 10.0;

    Conta c2 = new Conta();
    c2.codigo = 2;
    c2.saldo = 100.00;
    c2.limite = 50.0;

    c1.depositar(120.00);
    c2.depositar(50.50);

    c1.sacar(110.00);
    c2.sacar(200.00);
    c2.sacar(0.50);
    c2.sacar(10.0);

    c1.transferir(c2, 10.00);
    c1.transferir(c2, 30.00);

    System.out.println("");
  }
}