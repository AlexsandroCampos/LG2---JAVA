public class VetorUtil{
  public static int[] uniaoVetores(int[] vetor1, int[] vetor2){
    int[] novoVetor = new int[vetor1.length+vetor2.length];

    for (int i = 0; i < vetor1.length; i++) {
        novoVetor[i]=vetor1[i];
    }

    for (int i = 0; i < vetor2.length; i++) {
        novoVetor[i + vetor1.length]=vetor2[i];
    }

    return novoVetor;
  }

  public static int[] parOuImpar(int[] vetor){
    int[] novoVetor = new int[vetor.length];

    for (int i = 0; i < novoVetor.length; i++) {
      novoVetor[i] = vetor[i];
    }
    for (int i = 0; i < novoVetor.length; i++) {
      if(novoVetor[i]%2==0){
        novoVetor[i]=1;
      }
      else{
        novoVetor[i]=-1;
      }
    }

    return novoVetor;
  }

}