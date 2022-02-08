class Main {
  public static void main(String[] args) {

  Sacola<String> s1 = new Sacola<>();

  s1.adicionar("Alexsandro");
  s1.adicionar("Luana");
  System.out.println(s1.procurar("Alexsandro"));
  System.out.println(s1);
  }
}