package converter;

public class TempConverter {
	float temperature;
	float finalTemp;
	
	public float celToFah(float temperature){
		//int finalTemp;
		finalTemp = (float) (temperature * 1.8 + 32);
		return finalTemp;
	}
	
	public float celToKel(float temperature){
		//int finalTemp;
		finalTemp = (float) (temperature + 273.15);
		return finalTemp;				
	}
	
	public float fahToCel(float temperature){
		finalTemp = (temperature - 32) * 5/9;
		return finalTemp;	
	}
	
	public float fahToKel(float temperature){
		finalTemp = (float) ((temperature + 459.67) * 5/9);
		return finalTemp;		
	}
	
	public float kelToCel(float temperature){
		finalTemp = (float) (temperature - 273.15);
		return finalTemp;
	}
	
	public float kelToFah(float temperature){
		finalTemp = (float) (temperature * 9/5 - 459.67);
		return finalTemp;
	}
	
}
