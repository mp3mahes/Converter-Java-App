package converter;

public class MassConverter {
	float mass;
	float finalMass;
	
	public float kgToPounds(float mass){
		finalMass = (float) (mass * 2.205);
		return finalMass;		
	}
	
	public float poundsToKg(float mass){
		finalMass = (float) (0.4536 * mass);
		return finalMass;
	}
	
	public float kgToTons(float mass){
		finalMass = (float) (0.0011 * mass);
		return finalMass;	
	}
	
	public float tonsToKg(float mass){
		finalMass = (float) (907.185 * mass);
		return finalMass;
	}

}
