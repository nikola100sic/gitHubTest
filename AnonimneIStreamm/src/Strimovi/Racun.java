package Strimovi;

import java.util.ArrayList;
import java.util.List;

public class Racun {

	
	String naziv;
	double cena;
	

	public String getNaziv() {
		return naziv;
	}




	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}




	public double getCena() {
		return cena;
	}




	public void setCena(double cena) {
		this.cena = cena;
	}




	public Racun(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}
	
	
	
	
		public static void main(String[] args) {

		
		List<Racun> racuni = new ArrayList<Racun>();
		Racun r1= new Racun("Melko", 150);
		Racun r2 = new Racun("Hleb", 80);
		Racun r3 = new Racun("Jagode", 260);
		Racun r4 = new Racun("Jogurt", 163);
		racuni.add(r1);
		racuni.add(r2);
		racuni.add(r3);
		racuni.add(r4);
	

		

		
			
		double  rezultat = racuni.stream().mapToDouble(Racun::getCena).average().orElse(0.0);
		System.out.println(rezultat);
		
		

		}
	}

	

