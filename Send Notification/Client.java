import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;
import java.util.ArrayList;

public class Client{
	public static void main (String [] args){
		try{
			Registry registry = LocateRegistry.getRegistry();
			Notification stub = (Notification)registry.lookup("notif");

			ArrayList<String> list = stub.getNotification();

			for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
			}
		}catch(Exception ex){
			System.out.print(ex);
		}
	}
}