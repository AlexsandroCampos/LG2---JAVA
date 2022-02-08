class Main {
  public static void main(String[] args) {
    Ator a1 = new Ator("Robert Downey Jr");
    Ator a2 = new Ator("Marisa Tomei");
    Ator a3 = new Ator("Chris Hamsworth");
    Ator a4 = new Ator("Tom Holland");
    Ator a5 = new Ator("Scarlet Johanson");
   
    Filme f1 = new Filme("Capitão America: Guerra Cívil", 2016);
    Filme f2 = new Filme("Vingadores: Era de Ultron", 2015);

    for (Papel papel : a1.getPapel()) {
      System.out.println(papel.getFilme().getTitulo());
    }
    
    System.out.println("--------");

    for (Papel papel : a1.getPapel()) {
      System.out.println(papel.getFilme().getTitulo());
    }

  }
}