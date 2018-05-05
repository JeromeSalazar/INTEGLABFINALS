package apartmentsystem;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;

public class ApaServer implements ApartmentSys{
	public static void main(String[] args) {
        try {
        	ApaServer server = new ApaServer();
        	ApartmentSys stub = (ApartmentSys)UnicastRemoteObject.exportObject(server, 0);

        	Registry registry = LocateRegistry.getRegistry();
        	registry.bind("apartment", stub);

        } catch(Exception e) {
        	e.printStackTrace();
        	System.exit(1);
        }
    }
}