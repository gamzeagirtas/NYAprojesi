package nesneyonelimlianalizprojeodevi;

public class Eyleyici extends EyleyiciAbstract{
	
	Subjectclass s1 = new Subjectclass();
	Observerclass o1 = new Observerclass();
	
	public Eyleyici() {
		s1.register(o1);
	}
	
	@Override
	public int SogutucuAc(int temp) {
		String m = "Sogutucu aciliyor ";
		s1.notify(m);
		temp -= 3;
		return temp;
	}
	
	@Override
	public int SogutucuKapa(int temp) {
		String m = "Sogutucu kapatiliyor ";
		s1.notify(m);
		return temp;
	}
}
