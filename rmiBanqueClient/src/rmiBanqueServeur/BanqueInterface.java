package rmiBanqueServeur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

public interface BanqueInterface extends Remote{
	public void CreeationCompte(String username ,int solde)throws RemoteException;
	public void RecuperUtilisateure(String usr)throws RemoteException;
	public void SupritionCompte(int num)throws RemoteException;
	public void AfficherListe()throws RemoteException;
	public void Somme (int num,int somme)throws RemoteException;
}
