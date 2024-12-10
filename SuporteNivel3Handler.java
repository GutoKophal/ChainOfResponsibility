public class SuporteNivel3Handler extends SuporteHandler {
  @Override
  public void tratar(SuporteRequest request) {
      if (request.getNivelComplexidade() == 3) {
          System.out.println("Nível 3 resolvendo: " + request.getDescricao());
          request.setEstado("RESOLVIDO");
      } else if (proximo != null) {
          proximo.tratar(request);
      } else {
          System.out.println("Solicitação não pôde ser resolvida: " + request.getDescricao());
          request.setEstado("NÃO RESOLVIDO");
      }
  }
}