package a.WeatherORama.Spec;

public class WeatherData {

	float getTemperature() { 
		float temp = 0;
		return temp;
	}// 측정된 온도
	float getHumidity() {
		float humidity = 0;
		return humidity;
	}// 측정된 습도
	float getPressure() {
		float pressure=0;
		return pressure;
	}// 측정된 기압

	public void measurementsChanged() {
		// 우리가 구현해야 할 부분. 기상 관측값이 갱신될 때마다 화면에게 데이터를 전달해주어야 한다.
		
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		
//		currentConditionsDisplay.update(temp, humidity, pressure);
//		statisticsDisplay.update(temp, humidity, pressure);
//		forecastDisplay.update(temp, humidity, pressure);
	}

}
