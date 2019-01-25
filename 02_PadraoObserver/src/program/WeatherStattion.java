package program;

import entities.CurrentConditionsDisplay;
import entities.WeatherData;

public class WeatherStattion {

	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		
		CurrentConditionsDisplay currentConditions= new CurrentConditionsDisplay(weatherData);

		System.out.println(currentConditions);
		weatherData.setMeasuremente(80, 65, 30);
		weatherData.setMeasuremente(82, 61, 29);
		weatherData.setMeasuremente(78, 64, 28);
		
		System.out.println("-----");
		currentConditions.display();

		weatherData.teste();
		
		}

}
