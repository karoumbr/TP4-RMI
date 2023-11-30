package RmiPackage;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRmiServer {

	public static void main(String[] args) throws Exception {
	
		//create the remote object
		MyRemoteInterface obj = new MyRemoteObject();
		//create the rmi registry
		Registry regstry = LocateRegistry.createRegistry(1099);
		//bind the remote object to the registry
		Naming.bind("MyRemoteObject", obj);
		System.out.println("Server ready");

	}

}
