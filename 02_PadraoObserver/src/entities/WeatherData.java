package entities;

import java.util.ArrayList;

import implementacao.Observer;
import implementacao.Subject;

public class WeatherData implements Subject{
	
	private ArrayList observers;	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers=new ArrayList();
	}
	
	
	
	public void teste() {
		System.out.println(observers.get(0));
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i =observers.indexOf(o);
		if (i>=0) {
			observers.remove(o);
		}
		
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i <observers.size();i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	public void measurementeChanged() {
		notifyObservers();
	}
	
	public void setMeasuremente(float t, float h, float p) {
		this.temperature=t;
		this.humidity=h;
		this.pressure=p;
		measurementeChanged();
	}

}
