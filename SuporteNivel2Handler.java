public class SuporteNivel2Handler extends SuporteHandler {
  @Override
  public void tratar(SuporteRequest request) {
      if (request.getNivelComplexidade() == 2) {
          System.out.println("Nível 2 resolvendo: " + request.getDescricao());
          request.setEstado("RESOLVIDO");
      } else if (proximo != null) {
          proximo.tratar(request);
      }
  }
}