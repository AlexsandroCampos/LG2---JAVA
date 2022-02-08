class Main {
  public static void main(String[] args) {

    Funcionario f1 = new Funcionario("Carlos");
    Funcionario f2 = new Funcionario("Ana");
    Funcionario f3 = new Funcionario("João");
    Funcionario f4 = new Funcionario("Pedro");
    Funcionario f5 = new Funcionario("Joana");
    Funcionario f6 = new Funcionario("Alex");
    Funcionario f7 = new Funcionario("Lucas");

    f1.addSubordinado(f2);
    f1.addSubordinado(f3);
    f1.addSubordinado(f4);
    f1.addSubordinado(f5);
    f1.addSubordinado(f6);

    System.out.println(f1.isChefe());
    System.out.println(f1.getQuantidadeSubordinados());

    for(Funcionario f: f1.getSubordinados()){
      System.out.println(f.getNome());
    }
  }
}