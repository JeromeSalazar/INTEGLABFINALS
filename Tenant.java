import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;

public class Tenant implements ApartmentSys{

	private static void menu() {
        System.out.println("---------------------------------");
        System.out.printf("%20s \n", "MAIN MENU");
        System.out.println("---------------------------------");
        System.out.println("1 - Display name of boarding house");
        System.out.println("2 - Show occupied slots");
        System.out.println("3 - Show vacant slots");
        System.out.println("4 - Check-in");
        System.out.println("5 - Check-out");
        System.out.println("6 - Exit");
        System.out.print("Enter your Choice: ");
    }

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

        try {
        	Registry registry = LocateRegistry.getRegistry();
        	ApartmentSys stub = (ApartmentSys)registry.lookup("apartment");
			stub.register();

        } catch(Exception e) {
        	e.printStackTrace();
        	System.exit(1);
        }
        out : while (true) {
            menu1();
            try {
                int choice = Integer.parseInt(kbd.nextLine());
                if (choice < 1 || choice > 6) {
                    System.out.println("Invalid input!");
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                } else {
                    switch (choice) {
                        case 1 : (); break; /*Insert method name*/
                        case 2 : (); break; /*Insert method name*/
                        case 3 : (); break; /*Insert method name*/
                        case 4 : (); break; /*Insert method name*/
                        case 5 : (); break; /*Insert method name*/
                        case 6 : break out;
                        default : break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Press enter to continue...");
                kbd.nextLine();
            }
        }
    }
}