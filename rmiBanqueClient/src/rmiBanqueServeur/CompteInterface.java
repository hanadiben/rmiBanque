package rmiBanqueServeur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CompteInterface extends Remote { 
	public void CréditCompte(String username ,int solde)throws RemoteException;
    public void Débitcompte (String username ,int solde)throws RemoteException;
    public void RécupérerSolde (String username ,int solde)throws RemoteException;

}
