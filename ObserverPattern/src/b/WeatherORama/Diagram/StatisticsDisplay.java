package b.WeatherORama.Diagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	private static List<Float> temperatures = new ArrayList<Float>();
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	float[] calTemperature (float temperature) {
		float[] values = new float[3];
		temperatures.add(temperature);

		for (int i=0; i<temperatures.size(); i++) {
			values[i]=0;
		}		
		float sum=0;
		for (int i=0; i<temperatures.size(); i++) {
			sum = sum+temperatures.get(i);
		}
		float avg=0;
		avg = sum/(float) (temperatures.size());	
		values[0] = avg;
		
		Collections.sort(temperatures);
		values[1] = temperatures.get(temperatures.size()-1);
		values[2] = temperatures.get(0);
			
		return values;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		float[] values = calTemperature(temperature); 
		System.out.println("Avg/Max/Min tempertature ="+values[0]+"/"+values[1]+"/"+values[2]+"");
	}

	@Override
	public void update(float temp, float humidity, float perssure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
	}

}
