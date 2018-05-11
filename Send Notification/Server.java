import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Server implements Notification{
	public void sendNotification(String message) throws RemoteException, IOException{
		PrintWriter print = new PrintWriter(new FileWriter("notification.txt", true));
		print.printf("%s" + "%n", message);
		print.close();
	}

	public ArrayList<String> getNotification() throws RemoteException, IOException{
		BufferedReader read = new BufferedReader(new FileReader("notification.txt"));
		ArrayList<String> list = new ArrayList<String>();
		String notif;

		while((notif = read.readLine()) != null){
			list.add(notif);
		}

		read.close();
		return list;
	}

	public static void main(String [] args){
		try{
			Server obj = new Server();
			Notification stub = (Notification)UnicastRemoteObject.exportObject(obj, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("notif", stub);

		}catch(RemoteException ex){
			System.out.print(ex);
		}


	}
}