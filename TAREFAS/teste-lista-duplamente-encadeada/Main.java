class Main {
  public static void main(String[] args) {

    ListaDuplamenteEncadeada<Integer> l2 = new ListaDuplamenteEncadeada<>();

    l2.adicionarFim(2);
    l2.adicionarFim(4);
    l2.adicionarFim(6);
    l2.adicionarFim(8);

    l2.adicionar(3, 17);
    NoDuplamente<Integer> proximo = l2.getCabeca().getProximo();
    for(int i=0; i<l2.getTamanho(); i++){
      System.out.println(proximo.getElemento());
      proximo = proximo.getProximo();
    }

    System.out.println(l2.buscar(4));
  }
}