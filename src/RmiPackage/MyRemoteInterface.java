package RmiPackage;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface MyRemoteInterface extends Remote{
	public String sayHello() throws RemoteException;
	public double convertusd2tnd(double montantusd) throws RemoteException;
	public Date getServerDate() throws RemoteException;

}
