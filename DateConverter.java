package converter;

public class DateConverter {
	String date;
	String finalString;
	
	public String adTobs(String date){ //yyyy/mm/dd
		String [] result = date.split("/");
		int year = Integer.parseInt(result[0]);
		int month = Integer.parseInt(result[1]);
		int day = Integer.parseInt(result[2]);
		year = year + 56;
		month = (month + 8)%12;
		day = (day+16)%30;
		finalString = Integer.toString(year)+"/"+Integer.toString(month)+"/"+Integer.toString(day);
		return finalString;	
	}
	public String bsToAd(String date){
		String [] result = date.split("/");
		int year = Integer.parseInt(result[0]);
		int month = Integer.parseInt(result[1]);
		int day = Integer.parseInt(result[2]);
		year = year - 56;
		month = (month - 8 )%12;
		if(month < 0) {
			month = month * -1;
		}
		day = (day - 16)%30;
		if (day < 0){
			day = day * -1;
		}
		finalString = Integer.toString(year)+"/"+Integer.toString(month)+"/"+Integer.toString(day);
		return finalString;	
	}
}
