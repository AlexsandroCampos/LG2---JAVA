class Main {
  public static void main(String[] args) {
   
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