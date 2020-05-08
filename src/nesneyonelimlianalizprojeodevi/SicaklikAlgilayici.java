package nesneyonelimlianalizprojeodevi;
import java.util.Random;

public class SicaklikAlgilayici extends SicaklikAlgilayiciAbstract {
	int sicaklik = 0;
	Subjectclass s1 = new Subjectclass();
	Observerclass o2 = new Observerclass();
	
	public SicaklikAlgilayici() {
		s1.register(o2);
	}
	
	@Override
	public int SicaklikOku() {
		Random rnd = new Random();
		sicaklik = rnd.nextInt(30)+20;
		return sicaklik;
	}
	
	public int SicaklikGonder() {
		if(sicaklik <= 0)
			sicaklik = SicaklikOku();
		String m = "Ortam Sicakligi: "+sicaklik;
		s1.notify(m);
		return sicaklik;
		
	}
	public void Update(int temp) {
		sicaklik = temp;
	}
	
}
