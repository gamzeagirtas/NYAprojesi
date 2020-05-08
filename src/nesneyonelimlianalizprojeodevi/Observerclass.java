package nesneyonelimlianalizprojeodevi;

public class Observerclass implements IObserver{

	public void inform(String message) 
        {
		System.out.println(message);
	}
}
