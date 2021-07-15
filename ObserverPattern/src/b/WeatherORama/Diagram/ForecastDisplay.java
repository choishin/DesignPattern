package b.WeatherORama.Diagram;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	private static List<Float> pressures = new ArrayList<Float>();
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	String judgeForecast(float pressure) {
		String result ="";
		if (pressures.size() == 0) {
			float firstValue =0;
			pressures.add(firstValue);
			pressures.add(firstValue);
		}
		pressures.add(pressure);
						
		if (pressures.get(pressures.size()-1) > pressures.get(pressures.size()-2)) {
			result = "Improving weather on the way!";
		}
		else if (pressures.get(pressures.size()-1)-pressures.get(pressures.size()-2)==0) {
			result = "More of the same";
		}
		
		else if (pressures.get(pressures.size()-1) < pressures.get(pressures.size()-2)) {
			result ="Watch out for coller, rainy weather";
		}
		
		return result;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		String result = judgeForecast(pressure);
		System.out.println("Forecast :"+result);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
	}

}
