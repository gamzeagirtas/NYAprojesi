package nesneyonelimlianalizprojeodevi;

public class Merkezi {
	
	private int temp;
	private SicaklikAlgilayici sal = new SicaklikAlgilayici();
	private Eyleyici eyleyici = new Eyleyici();
	
	public void SicaklikOku() {
		temp = sal.SicaklikGonder();
	}
	public void SogutucuAc() {
		temp = eyleyici.SogutucuAc(temp);
		sal.Update(temp);
	}
	public void SogutucuKapa() {
		temp = eyleyici.SogutucuKapa(temp);
		sal.Update(temp);
	}
	
}

