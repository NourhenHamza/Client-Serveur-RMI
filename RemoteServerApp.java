import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public interface RemoteService extends Remote {
    String convertString(String input) throws RemoteException;
}

public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {
    public RemoteServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String convertString(String input) throws RemoteException {
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099); // Créez un registre RMI sur le port 1099 par défaut
            RemoteService service = new RemoteServiceImpl();
            java.rmi.Naming.rebind("RemoteService", service); // Enregistrez le service avec le nom "RemoteService"
            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
