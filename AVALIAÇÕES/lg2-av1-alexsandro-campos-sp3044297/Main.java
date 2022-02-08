class Main {
  public static void main(String[] args) {
    int[] vetor1 = {1, 2 , 3};
    int[] vetor2 = {4, 5};
    int[] vetorUniao = VetorUtil.uniaoVetores(vetor1, vetor2);

    System.out.println("Vetores iniciais:");
    exibir(vetor1);
    exibir(vetor2);
    System.out.println("Resultado:");
    exibir(vetorUniao);

    int[] vetorParImpar = VetorUtil.parOuImpar(vetor1);
    
    System.out.println("Vetor inicial:");
    exibir(vetor1);
    System.out.println("Resultado:");
    exibir(vetorParImpar);
    
  }

  public static void exibir(int[] vetor){
    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i]);
    }
  }
}