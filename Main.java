package converter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean mainMenuFlag = true;
		Scanner sc = new Scanner(System.in);
		while(mainMenuFlag){
			System.out.println("Choose one of the following converter.");
			System.out.println("1. Temperature Converter.");
			System.out.println("2. Currency Converter.");
			System.out.println("3. Volume Converter.");
			System.out.println("4. Mass Converter.");
			System.out.println("5. Date Converter.");
			System.out.println("0. Exit");
			int choice;
			choice = sc.nextInt();
			switch(choice){
			case 0 : mainMenuFlag = false;
					break;
			
			case 1 : System.out.println("Choose one - ");
					 System.out.println("1. Celsius to Fahrenheit.");
					 System.out.println("2. Celsius to Kelvin.");
					 System.out.println("3. Fahrenheit to Celsius.");
					 System.out.println("4. Fahrenheit to Kelvin. ");
					 System.out.println("5. Kelvin to Celsius. ");
					 System.out.println("6. Kelvin to Fahrenheit.");
					 System.out.println("0. Exit to Main Menu. ");
					 
					 //boolean tempBool = true;
					 int tempInt;
					 tempInt = sc.nextInt();
				 
					 switch(tempInt){
					 
					 case 0 : break;
					 
					 case 1 : float temperature;  //celsius to fahrenheit
					 		float answer;
					 		System.out.print("Enter the temperature in Celsius : ");
					 		temperature = sc.nextFloat();
					 		TempConverter FinalTemperature = new TempConverter();
					 		answer = FinalTemperature.celToFah(temperature);
					 		System.out.println(temperature + "  celsius is " + answer + "  Fahrenheit.");
						 	break;
						 	
					 case 2 :float temperature1; //celsius to kelvin
					 		float answer1;
				 			System.out.print("Enter the temperature in Celsius : ");
				 			temperature1 = sc.nextFloat();
				 			TempConverter FinalTemperature1 = new TempConverter();
				 			answer1 = FinalTemperature1.celToKel(temperature1);
				 			System.out.println(temperature1 + "  celsius is " + answer1 + "  kelvin");
				 			break;
				
					 case 3 : // fahrenheit to celsius
						 	float temperature2;
						 	float answer2;
						 	System.out.print("Enter the temperature in Fahrenheit : ");
						 	temperature2 = sc.nextFloat();
						 	TempConverter FinalTemperature2 = new TempConverter();
						 	answer2 = FinalTemperature2.fahToCel(temperature2);
						 	System.out.println(temperature2 + "  Fahrenheit is " + answer2 + "  Celsius");
						 	break;
						 	
					 case 4 : //fahrenheit to kelvin
						 	float temperature3;
						 	float answer3;
						 	System.out.print("Enter the temperature in Fahrenheit : ");
						 	temperature3 = sc.nextFloat();
						 	TempConverter FinalTemperature3 = new TempConverter();
						 	answer3 = FinalTemperature3.fahToKel(temperature3);
						 	System.out.println(temperature3 + "  Fahrenheit is " + answer3 + "  Kelvin");
						 	break;
						 	
					 case 5 : //kelvin to celsius
						 	float temperature4;
						 	float answer4;
						 	System.out.print("Enter the temperature in Kelvin : ");
						 	temperature4 = sc.nextFloat();
						 	TempConverter FinalTemperature4 = new TempConverter();
						 	answer4 = FinalTemperature4.kelToCel(temperature4);
						 	System.out.println(temperature4 + "  kelvin is " + answer4 + "  Celsius");
						 	break;
						 	
					 case 6 : //kelvin to fahrenheit
						 	float temperature5;
						 	float answer5;
						 	System.out.print("Enter the temperature in Kelvin : ");
						 	temperature5 = sc.nextFloat();
						 	TempConverter FinalTemperature5 = new TempConverter();
						 	answer5 = FinalTemperature5.kelToFah(temperature5);
						 	System.out.println(temperature5 + "  Kelvin is " + answer5 + "  Fahrenheit");
						 	break;
					 }
					 break;
			case 2 :System.out.println("Choose one - ");
					System.out.println("1. US Dollar to Rupees.");
					System.out.println("2. US Dollar to Euro.");
					System.out.println("3. US Dollar to Pound Sterling.");
					System.out.println("4. Rupees to US Dollar. ");
					System.out.println("5. Euro To US Dollar. ");
					System.out.println("6. Pound Sterling to US DOllar.");						
					System.out.println("0. Exit to Main Menu. ");
					
					int curInt;
					curInt = sc.nextInt();
					
					switch(curInt){
					
					case 0 : break;
					case 1 : // US Dollar to Rupees
							float currency;
							float answer;
							System.out.print("Enter the US Dollars : ");
							currency = sc.nextFloat();
							CurConverter FinalCurrency = new CurConverter();
							answer = FinalCurrency.dolToRupees(currency);
							System.out.println("$"+currency +" is " + answer + " Rupees.");
							System.out.println("   ");
							break;
							
					case 2 : //US Dollar to Euro
							float currency1;
							float answer1;
							System.out.print("Enter the US Dollars : ");
							currency1 = sc.nextFloat();
							CurConverter FinalCurrency1 = new CurConverter();
							answer1 = FinalCurrency1.dolToEuro(currency1);
							System.out.println("$" + currency1 + " is " + answer1 + "  Euros.");
							System.out.println();
							break;
							
					case 3 : //US Dollar to Pound Sterling
							float currency2;
							float answer2;
							System.out.print("Enter the US Dollars : ");
							currency2 = sc.nextFloat();
							CurConverter FinalCurrency2 = new CurConverter();
							answer2 = FinalCurrency2.dolToEuro(currency2);
							System.out.println("$" + currency2 + " is " + answer2 + "  Pounds.");
							System.out.println();
							break;
						
					case 4 : //Rupees to US Dollar
							float currency3;
							float answer3;
							System.out.print("Enter the Nepalese Rupees : ");
							currency3 = sc.nextFloat();
							CurConverter FinalCurrency3 = new CurConverter();
							answer3 = FinalCurrency3.rupToDollars(currency3);
							System.out.println("Rs." + currency3 + " is " + answer3 + "  Dollars.");
							System.out.println();
							break;
							
					case 5 : //Euro to US Dollar
							float currency4;
							float answer4;
							System.out.print("Enter the Euro : ");
							currency4 = sc.nextFloat();
							CurConverter FinalCurrency4 = new CurConverter();
							answer4 = FinalCurrency4.euroToDollars(currency4);
							System.out.println(currency4 + "  Euro is " + answer4 + "  Dollars.");
							System.out.println();
							break;
							
					case 6 : //Pound Sterling to US Dollar
							float currency5;
							float answer5;
							System.out.print("Enter the US British Pounds : ");
							currency5 = sc.nextFloat();
							CurConverter FinalCurrency5 = new CurConverter();
							answer5 = FinalCurrency5.poundToDollars(currency5);
							System.out.println( currency5 +"  pounds is " + answer5 + "  Dollars.");
							System.out.println();
							break;
					}		
					break;
			case 3 :System.out.println("Choose one - ");
					System.out.println("1. Ounce to ml");
					System.out.println("2. ml to Ounce.");
					System.out.println("3. Liter to Gallon.");
					System.out.println("4. Gallon to liter. ");				
					System.out.println("0. Exit to Main Menu. ");
					
					int volInt;
					volInt = sc.nextInt();
					
					switch(volInt){
					
					case 0 : break;
					
					case 1 ://ounce to ml
							float volume;  
							float answer;
							System.out.println("Enter the ounces : ");
							volume = sc.nextFloat();
							VolConverter FinalVolume = new VolConverter();
							answer = FinalVolume.ounceTOml(volume);
							System.out.println( volume + " ounces is " + answer + "ml.");
							break;
							
					case 2 : // ml to ounce
							float volume1;  
							float answer1;
							System.out.println("Enter the ml : ");
							volume1 = sc.nextFloat();
							VolConverter FinalVolume1 = new VolConverter();
							answer1 = FinalVolume1.mlToOunce(volume1);
							System.out.println( volume1 + " ml is " + answer1 + "oz.");
							break;
							
					case 3 : //liter to gallon
							float volume2;  
							float answer2;
							System.out.println("Enter the liters : ");
							volume2 = sc.nextFloat();
							VolConverter FinalVolume2 = new VolConverter();
							answer2 = FinalVolume2.litToGal(volume2);
							System.out.println( volume2 + " liter is " + answer2 + "gallons.");
							break;
							
					case 4 : // gallon to liter
							float volume3;  
							float answer3;
							System.out.println("Enter the gallons : ");
							volume3 = sc.nextFloat();
							VolConverter FinalVolume3 = new VolConverter();
							answer3 = FinalVolume3.galToLiter(volume3);
							System.out.println( volume3 + " gallons is " + answer3 + "liters.");
							break;
					}
					break;
					
			case 4 :System.out.println("Choose one - ");
					System.out.println("1. kg to pounds. ");
					System.out.println("2. pounds to kg.");
					System.out.println("3. kg to tons.");
					System.out.println("4. tons to kg. ");				
					System.out.println("0. Exit to Main Menu. ");
					
					int massInt;
					massInt = sc.nextInt();
					
					switch(massInt){
							case 0 : break;
							
							case 1 : //kg to pounds
									float mass;
									float answer;
									System.out.print("Enter the kilograms : ");
									mass = sc.nextFloat();
									MassConverter FinalMass = new MassConverter();
									answer = FinalMass.kgToPounds(mass);
									System.out.println( mass + "kg is " + answer + "  pounds.");
									break;
									
							case 2 : //pounds to kg
									float mass1;
									float answer1;
									System.out.print("Enter the pounds : ");
									mass1 = sc.nextFloat();
									MassConverter FinalMass1 = new MassConverter();
									answer1 = FinalMass1.poundsToKg(mass1);
									System.out.println( mass1 + "pounds is " + answer1 + "  kg.");
									break;
									
							case 3 : //kg to tons
									float mass2;
									float answer2;
									System.out.print("Enter the kilograms : ");
									mass2 = sc.nextFloat();
									MassConverter FinalMass2 = new MassConverter();
									answer2 = FinalMass2.kgToTons(mass2);
									System.out.println( mass2 + "kg is " + answer2 + "  tons.");
									break;
									
							case 4 : //tons to kg
									float mass3;
									float answer3;
									System.out.print("Enter the tons : ");
									mass3 = sc.nextFloat();
									MassConverter FinalMass3 = new MassConverter();
									answer3 = FinalMass3.tonsToKg(mass3);
									System.out.println( mass3 + "tons is " + answer3 + "  kg.");
									break;
					}
					break;
					
			case 5 : System.out.println("Choose one _ ");
					System.out.println("1. Convert AD to BS. ");
					System.out.println("2. Convert BS to AD ");
					System.out.println("0. Exit. ");
					
					int dateInt;
					dateInt = sc.nextInt();
					
					switch(dateInt){
						
						case 0 : break;
						case 1 : //change AD to BS
								String answer;
								System.out.print("Please enter the date in format yyyy/mm/dd : ");
								String date = sc.next();
								DateConverter finalDate = new DateConverter();
								answer = finalDate.adTobs(date);
								System.out.println( date + "  AD is " + answer + "  BS.");
								
								break;
						case 2 : //change BS to AD
								String answer1;
								System.out.print("Please enter the date in format yyyy/mm/dd : ");
								String date1 = sc.next();
								DateConverter finalDate1 = new DateConverter();
								answer1 = finalDate1.bsToAd(date1);
								System.out.println( date1 + "  BS is " + answer1 + "  AD.");
								break;
					}
					
				
					break;
			}
			
		}
		sc.close();
	}

}
