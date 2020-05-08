package nesneyonelimlianalizprojeodevi;
import java.sql.*;
import java.util.Scanner;
public class Arayüz {
	
	static Connection dbConn = DatabaseAndUserControl.getConnection();
	static DatabaseAndUserControl dbinstance = DatabaseAndUserControl.getInstance();
	static Scanner sc = new Scanner(System.in);
	
	public static boolean KullaniciGiris() {
		int count = 0;
		while(count < 3) {
			System.out.println("İsminiz: ");
			String _isim = sc.nextLine();
			System.out.println("Parola: ");
			String _parola = sc.nextLine();
			System.out.println("Kontrol saglaniyor...");
			if (dbinstance.Control(_isim, _parola)) {
				return true;
			}
			count++;
		}
		System.out.println("Cok fazla giris yapildi. Sistem kapatiliyor.");
		return false;
	}
	
	public static void Islem() {
		Merkezi merkezi = new Merkezi();
		int secim=0;
		
		while(secim != 4) {
		System.out.println("1-Sicaklik Oku \n2-Sogutucu Ac \n3-SogutucuKapa \n4-Cikis");
		System.out.println("İslem seciniz: ");
		secim = sc.nextInt();
		
		switch(secim) {
		case 1:
			merkezi.SicaklikOku();
			break;
		case 2:
			merkezi.SogutucuAc();
			break;
		case 3:
			merkezi.SogutucuKapa();
			break;
		}
	 
		}
	}
	
	public static void main(String[] args) {
		
		if(KullaniciGiris())
			Islem();
		
	}

}
