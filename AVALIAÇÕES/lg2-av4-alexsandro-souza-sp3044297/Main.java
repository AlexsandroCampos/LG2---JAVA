class Main {
  public static void main(String[] args) {
    Pilha<Integer> p1 = new Pilha<>(2);

    p1.empilha(1);
    p1.empilha(2);
    p1.empilha(3);

    System.out.println(p1.desempilha());
    System.out.println(p1.topo());
    System.out.println(p1.tamanho());
    System.out.println(p1.vazia());

    System.out.println("------------");

    Fila<Integer> f1 = new Fila<>(2);

    f1.enfileirar(1);
    f1.enfileirar(2);
    f1.enfileirar(3);

    System.out.println(f1.desenfileirar());
    System.out.println(f1.primeiro());
    System.out.println(f1.tamanho());
    System.out.println(f1.vazia());
  }
}