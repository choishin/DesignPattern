package a.WeatherORama.Spec;

public class WeatherData {

	float getTemperature() { 
		float temp = 0;
		return temp;
	}// ������ �µ�
	float getHumidity() {
		float humidity = 0;
		return humidity;
	}// ������ ����
	float getPressure() {
		float pressure=0;
		return pressure;
	}// ������ ���

	public void measurementsChanged() {
		// �츮�� �����ؾ� �� �κ�. ��� �������� ���ŵ� ������ ȭ�鿡�� �����͸� �������־�� �Ѵ�.
		
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		
//		currentConditionsDisplay.update(temp, humidity, pressure);
//		statisticsDisplay.update(temp, humidity, pressure);
//		forecastDisplay.update(temp, humidity, pressure);
	}

}
