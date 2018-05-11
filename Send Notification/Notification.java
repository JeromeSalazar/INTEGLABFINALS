import java.rmi.Remote;
import java.rmi.RemoteException;
import java.io.IOException;
import java.util.ArrayList;

public interface Notification extends Remote{
	public void sendNotification(String message) throws RemoteException, IOException;
	public ArrayList<String> getNotification() throws RemoteException, IOException;
}