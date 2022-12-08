package rmiBanqueServeur;

import java.io.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.http.WebSocket.Listener;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JPasswordField;
import javax.swing.JSpinner.ListEditor;

public class client {
	
	public static void main(String[] args) throws IOException, RemoteException, MalformedURLException, NotBoundException{
		// TODO Auto-generated method stub
		
		BanqueInterface s =(BanqueInterface) Naming.lookup("rmi://localhost:1234/RMI");
		
		while (true) {
		System.out.println("que vous voulez faire ?");
		Scanner operation = new Scanner(System.in);
		int op = operation.nextInt();
		
		if (op == 1) {
			System.out.print("User : ");
			Scanner user1 = new Scanner(System.in);
			String user11 = user1.nextLine();
			System.out.print("solde  : ");
			Scanner solde1 = new Scanner(System.in);
			int solde11 = solde1.nextInt();
			System.out.println("***********Creation de compte***********");
			s.CreeationCompte(user11, solde11);
			System.out.println(" votre compte est crée merci ");	
		} else if (op == 2) {
			
			System.out.println("La récupération de votre compte : ");
			System.out.println("donner le num du compte que vous vouler afficher ");
			Scanner numScanner = new Scanner(System.in);
			String usr = numScanner.next();
			s.RecuperUtilisateure(usr);
		}else if (op == 3) {
			System.out.println("afficher la liste des compte  : ");
			
			
			s.AfficherListe();
		}else if (op == 4) {
			
			System.out.println(" La suppression d’un compte ");
			System.out.println("donner le num du compte que vous vouler supprimer ");
			Scanner numScanner = new Scanner(System.in);
			int num = numScanner.nextInt();
		    s.SupritionCompte(num);	
		}
		else if (op==5 ){
			System.out.println("donner le num de compte que vous vouler ajouter la somme");
			Scanner numScanner = new Scanner(System.in);
			int num = numScanner.nextInt();
			System.out.println("donner la somme que vous vouler ajouter");
			Scanner sommeScanner = new Scanner(System.in);
			int somme = sommeScanner.nextInt();
		    s.Somme(num,somme);
		}
		
		}
		
		
		
	}

}
