public class SuporteRequest {
  private String descricao;
  private int nivelComplexidade;
  private String estado;

  public SuporteRequest(String descricao, int nivelComplexidade) {
      this.descricao = descricao;
      this.nivelComplexidade = nivelComplexidade;
      this.estado = "PENDENTE";
  }

  public int getNivelComplexidade() {
      return nivelComplexidade;
  }

  public String getDescricao() {
      return descricao;
  }

  public void setEstado(String estado) {
      this.estado = estado;
  }

  public String getEstado() {
      return estado;
  }
}