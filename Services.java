import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Services extends Remote {
	public void setName(String name) throws RemoteException;
	public void setCapacity(int capacity) throws RemoteException;
	public String sendNotification(String message) throws RemoteException;
	public String getName() throws RemoteException;
	public String showVacantSlots() throws RemoteException;
	public String showOccupiedSlots() throws RemoteException;
	public void checkIn(String roomno) throws RemoteException;
	public void checkOut(String roomno) throws RemoteException;
}