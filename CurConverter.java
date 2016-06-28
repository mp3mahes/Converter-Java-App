package converter;

public class CurConverter {
	float currency;
	float finalCurrency;
	
	public float dolToRupees(float currency){
		finalCurrency = (float) (currency * 108.76);
		return finalCurrency;		
	}
	
	public float dolToEuro(float currency){
		finalCurrency = (float) (currency * 0.92);
		return finalCurrency;
	}
	
	public float dolToPound(float currency){
		finalCurrency = (float) (currency * 0.69);
		return finalCurrency;
	}
	
	public float rupToDollars(float currency){
		finalCurrency = (float) (currency * 0.0092);
		return finalCurrency;
	}
	
	public float euroToDollars(float currency){
		finalCurrency = (float) (currency * 1.09);
		return finalCurrency;	
	}
	
	public float poundToDollars(float currency){
		finalCurrency = (float) (currency * 1.44);
		return finalCurrency;
	}

}
