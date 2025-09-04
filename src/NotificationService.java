public class NotificationService {
    public void enviarEmail(Cliente cliente, String mensagem) {
        System.out.println("-----------------------------------------");
        System.out.println("Simulação de envio de E-mail:");
        System.out.println("Para: " + cliente.getEmail());
        System.out.println("Mensagem: " + mensagem);
        System.out.println("-----------------------------------------");
    }
}