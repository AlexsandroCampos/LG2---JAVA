class Main {
  public static void main(String[] args) {
    Vetor vetor1 = new Vetor(2);
    System.out.println(vetor1);
    vetor1.adicionar("Olá");
    vetor1.adicionar("Opa");
    System.out.println(vetor1);
    vetor1.adicionar("Eba");
    System.out.println(vetor1);

    System.out.println("---------------");

    VetorGenerico<String> vg1 = new VetorGenerico<>(2);
    System.out.println(vg1);
    vg1.adicionar("Hello");
    vg1.adicionar("World");
    System.out.println(vg1);
    vg1.adicionar("Nice");
    System.out.println(vg1);
    System.out.println(vg1.contem("Nice"));
  }
}