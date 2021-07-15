package a.WeatherORama.Spec;

public interface Subject {
	
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();

}
