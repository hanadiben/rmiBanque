package rmiBanqueServeur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CompteInterface extends Remote { 
	public void Cr�ditCompte(String username ,int solde)throws RemoteException;
    public void D�bitcompte (String username ,int solde)throws RemoteException;
    public void R�cup�rerSolde (String username ,int solde)throws RemoteException;

}
