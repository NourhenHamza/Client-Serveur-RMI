import java.rmi.Naming;

public class RmiClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost:1099/RemoteService"; // L'URL du service RMI
            RemoteService remoteService = (RemoteService) Naming.lookup(url);

            String input = "Hello, World!";
            String result = remoteService.convertString(input);
            
            System.out.println("Résultat du serveur RMI : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
