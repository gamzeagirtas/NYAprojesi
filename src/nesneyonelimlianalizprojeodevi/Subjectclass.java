package nesneyonelimlianalizprojeodevi;
import java.util.ArrayList;

public class Subjectclass implements ISubject {
	
	private ArrayList observers = new ArrayList();
	
	public void register(IObserver o) {
		observers.add(o);
	}
	
	public void remove(IObserver o) {
		int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
	}
	public void notify(String m) {
		for (int i = 0; i < observers.size(); i++) {
            IObserver observer = (IObserver)observers.get(i);
            observer.inform(m);
        }
	}
}
