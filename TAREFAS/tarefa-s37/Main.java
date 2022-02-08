class Main {
  public static void main(String[] args) {

    ListaEncadeada<Integer> l1 = new ListaEncadeada<>();

    l1.adicionarInicio(2);
    l1.adicionarInicio(4);
    l1.adicionarInicio(6);
    l1.adicionarInicio(8);
    l1.removerFim();


    l1.adicionar(1, 17);
    No<Integer> proximo = l1.getCabeca();
    for(int i=0; i<l1.getTamanho(); i++){
      System.out.println(proximo.getElemento());
      proximo = proximo.getProximo();
    }

    System.out.println(l1.buscar(3));

    System.out.println("------------------");

    ListaDuplamenteEncadeada<Integer> l2 = new ListaDuplamenteEncadeada<>();

    l2.adicionarFim(2);
    l2.adicionarFim(4);
    l2.adicionarFim(6);
    l2.adicionarFim(8);

    l2.adicionar(3, 17);
    NoDuplamente<Integer> proximo2 = l2.getCabeca().getProximo();
    for(int i=0; i<l2.getTamanho(); i++){
      System.out.println(proximo2.getElemento());
      proximo2 = proximo2.getProximo();
    }

    System.out.println(l2.buscar(4));
    
  }
}