class Main {
  public static void main(String[] args) {
    String nome = args[0];
    
    double notas[] = new double[args.length-1];
    for (int i=0; i < args.length-1; i++){
        notas[i]= Double.parseDouble(args[i+1]);
    }
    
    double media = Estatistica.calcularMedia(notas);
    double notaMaior = Estatistica.maiorNota(notas);
    double notaMenor = Estatistica.menorNota(notas);
    
    exibirNota(media, nome);
    System.out.println("A menor nota é: "+ notaMenor);
    System.out.println("A maior nota é: "+ notaMaior);

  }
  public static void exibirNota(double nota, String aluno) {
    System.out.print(aluno);
    System.out.print(" tem média ");
    System.out.print(String.format("%.2f\n", nota));
  }

}