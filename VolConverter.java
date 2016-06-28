package converter;

public class VolConverter {
		float volume;
		float finalVolume;
		
		public float ounceTOml(float volume){
			finalVolume = (float) (volume * 29.57);
			return finalVolume;	
		}
		
		public float mlToOunce(float volume){
			finalVolume = (float) (volume * 0.0338);
			return finalVolume;
		}
		
		public float litToGal(float volume){
			finalVolume = (float) (volume * 0.264172);
			return finalVolume;
		}
		
		public float galToLiter(float volume){
			finalVolume = (float) (volume * 3.78541);
			return finalVolume;
			
		}
}
