import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Client2{
	public static void main (String [] args){
		try{
			Registry registry = LocateRegistry.getRegistry();
			Notification stub = (Notification)registry.lookup("notif");
			Scanner scan = new Scanner(System.in);

				System.out.println("Send a notification to your tenants!");
				String message = scan.nextLine();

				stub.sendNotification(message);

		}catch(Exception ex){
			System.out.print(ex);
		}
	}
}