import java.util.Scanner;

public class ChainOfResponsibilityStateMain {
    public static void main(String[] args) {
        SuporteHandler nivel1 = new SuporteNivel1Handler();
        SuporteHandler nivel2 = new SuporteNivel2Handler();
        SuporteHandler nivel3 = new SuporteNivel3Handler();

        nivel1.setProximo(nivel2);
        nivel2.setProximo(nivel3);

        try (Scanner scanner = new Scanner(System.in)) {
        
          int maxRequests = 5;
        for (int i = 0; i < maxRequests; i++) {
            System.out.print("Descrição do problema: ");
            String descricao = scanner.nextLine();
            System.out.print("Nível de complexidade (1: Básico, 2: Intermediário, 3: Avançado): ");
            int nivel = scanner.nextInt();
            scanner.nextLine();

            SuporteRequest request = new SuporteRequest(descricao, nivel);

            nivel1.tratar(request);

            System.out.println("Estado final da solicitação: " + request.getEstado());
            System.out.println("----------------------------");
        }
        }    
    }
}