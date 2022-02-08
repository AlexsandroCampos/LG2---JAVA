class Aluno{
  private String prontuario;
  private String nome;

  public Aluno(){

  }
  public Aluno(String prontuario,String nome){
    this.setProntuario(prontuario);
    this.setNome(nome);
  }
  public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
    if(prontuario.toUpperCase().startsWith("SP") && prontuario.length() == 8){
      this.prontuario = prontuario;
    }
    else {
      throw new IllegalArgumentException("");
    }
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
    if(nome.length() <=100 && nome.length() >=5){
      if(nome.replaceAll(" ","").equals("")){
        throw new IllegalArgumentException("");
      }
      else {
        this.nome = nome;
      }
    }
    else {
      throw new IllegalArgumentException("");
    }
	}

}