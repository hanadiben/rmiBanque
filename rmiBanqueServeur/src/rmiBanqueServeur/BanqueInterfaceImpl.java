package rmiBanqueServeur;

import java.rmi.RemoteException;
import java.util.Arrays;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BanqueInterfaceImpl extends UnicastRemoteObject implements BanqueInterface ,CompteInterface{
	static ArrayList liste =new ArrayList();
	static ArrayList liste1 =new ArrayList();
	protected BanqueInterfaceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
    @Override
	public void CréditCompte(String username, int solde) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
    @Override
	public void Débitcompte(String username, int solde) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
    @Override
	public void RécupérerSolde(String username, int solde) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("votre solde est "+solde);
	}
    @Override
	public void CreeationCompte(String username, int solde) throws RemoteException {
		// TODO Auto-generated method stub
		liste.add(username);
		liste1.add(solde);
		System.out.println(" votre compte est crée merci ");
	}
	@Override
	public void RecuperUtilisateure(String usr) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(ArrayUtils.contains(liste, usr));
		//if (Arrays.asList(liste).contains(usr)){
		//	int UsrIndex = Arrays.asList(liste).indexOf(usr);
			//System.out.println("USER INDEX IS : " + UsrIndex);
		//}
		
	}
	public void RecuperSolde(int num ,int somme) {
		for(int j=0;j<liste1.size();j++) {
				System.out.println(" solde :   "+liste1.get(1)+somme);
			}
	}
    @Override
	public void SupritionCompte(int num) throws RemoteException {
		// TODO Auto-generated method stub
		liste.remove(liste.get(num));
		System.out.print("le compte est suprimer");	
		}
	@Override
	public void AfficherListe() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(" la listes des compte :  ");
		System.out.println(liste);
		
	}
	@Override
	public void Somme(int num, int somme) throws RemoteException {
		// TODO Auto-generated method stub
		for(int i=0;i<liste.size();i++) {
			if (num==i) {
			//int	newSomme=liste1.get(num)+somme;
				int OldSold = (int) liste1.get(num);
				System.out.println(" solde :   " + (OldSold + somme));
			}
			   
			}
		}
		
	}
	