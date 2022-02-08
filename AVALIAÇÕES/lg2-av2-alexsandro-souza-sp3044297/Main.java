class Main {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("SP304429","Alexsandro");

    a1.setProntuario("SP010101");
    System.out.println(a1.getProntuario());

    a1.setNome("Alexsandro");
    System.out.println(a1.getNome());
    
  }
}