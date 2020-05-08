package nesneyonelimlianalizprojeodevi;

public interface ISubject 
{
	 public void register(IObserver o);
	 public void remove(IObserver o);
	 public void notify(String m);
}
