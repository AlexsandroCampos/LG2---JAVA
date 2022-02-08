class Main {
  public static void main(String[] args) {
   
   Vetor v1 = new Vetor(3);

   v1.adicionar("Alex");
   v1.adicionar("Lucas");
   v1.adicionar("Caio");
   v1.adicionar("Luana");

   System.out.println(v1.buscar("Caio"));
   System.out.println(v1.buscar(2));
   v1.remover(3);
   System.out.println(v1.tamanho());
   v1.adicionar(2, "joão");
   System.out.println(v1.toString());
   
   System.out.println("--------------------");

   VetorInt v2 = new VetorInt(3);

   v2.adicionar(3);
   v2.adicionar(4);
   v2.adicionar(5);
   v2.adicionar(0);
   
   System.out.println(v2.buscarPosicaoElemento(5));
   System.out.println(v2.buscar(2));
   v2.remover(2);
   System.out.println(v2.tamanho());
   v2.adicionar(2, 7);
   System.out.println(v2.toString());
  }
}