public class SuporteNivel1Handler extends SuporteHandler {
  @Override
  public void tratar(SuporteRequest request) {
      if (request.getNivelComplexidade() == 1) {
          System.out.println("Nível 1 resolvendo: " + request.getDescricao());
          request.setEstado("RESOLVIDO");
      } else if (proximo != null) {
          proximo.tratar(request);
      }
  }
}