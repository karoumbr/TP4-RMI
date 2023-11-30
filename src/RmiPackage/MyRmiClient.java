package RmiPackage;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRmiClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		//look up the remote object in the RMI Registry
		MyRemoteInterface obj = (MyRemoteInterface) Naming.lookup("rmi://localhost:1099/MyRemoteObject");
		
		//invoke a method on the remote object
		String message = obj.sayHello();
		System.out.println("Message from server: "+ message);
		System.out.println("Convert 100usd to tunisian dinars: "+ obj.convertusd2tnd(100));
		System.out.println("Server date: "+ obj.getServerDate());
	}

}
