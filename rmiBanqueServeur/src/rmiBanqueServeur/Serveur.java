package rmiBanqueServeur;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class Serveur {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("serveur runing....");
		LocateRegistry.createRegistry(1234);
		BanqueInterfaceImpl rmImpl =new BanqueInterfaceImpl();
		Naming.rebind("rmi://localhost:1234/RMI", rmImpl);
		//System.out.println(rmImpl.toString());
	}

}
