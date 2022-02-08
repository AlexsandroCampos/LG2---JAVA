class Main {
  public static void main(String[] args) {

    Carga c1 = new Carga(2.5, 1);
    Carga c2 = new Carga(5.0, 2);
    Carga c3 = new Carga(2.0, 3);
    Aviao a1 = new Aviao(10.0, 1);
    a1.adicionarCarga(c1);
    a1.adicionarCarga(c2);
    a1.adicionarCarga(c3);

    for (int i=0; i<a1.getCargas().size(); i++){
      System.out.println(
        a1.getCargas().get(i).getNumero()+
        ", "+
        a1.getCargas().get(i).getPeso()

      );
    }
    System.out.println(a1.getTotalPeso());
    System.out.println(a1.getTotalDisponível());
  }
}