 import  java.time.LocalDate;

class Main {
  public static void main(String[] args) {
    Correntista cor1 = new Correntista(1, "Maria");

    ContaCorrente cc1 = new ContaCorrente(1, LocalDate.of(2000, 1, 9), 10.0, cor1, 15.0);

    ContaPoupanca cp1 = new ContaPoupanca(1, LocalDate.of(2004, 2, 11), 10.0, cor1, LocalDate.of(2000, 1, 15));

    Empresa emp1 = new Empresa("111.111.111.11", "Google");

    ContaSalario cs1 = new ContaSalario(1, LocalDate.of(2000, 1, 15), 10.0, cor1, emp1);

    cc1.depositar(100.0);
    cc1.sacar(30.0);
    cp1.depositar(40.0);
    cs1.depositar(50.0);

    for (Conta conta : cor1.getContas()) {
      System.out.println(conta.getSaldo());
    }

    System.out.println(cor1.totalTarifas());



  }
}