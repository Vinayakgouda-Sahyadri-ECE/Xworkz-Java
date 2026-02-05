class PanasonicMicrowave{
	
	//static variable
	static String brand = "Panasonic";
	static int capacity = 25;
	static String colour = "Black";
	static String cookingMode = "Solo";
	static int wattage = 900;
	static int voltage = 230;
	static String installationType = "Countertop";
	static String fuelType = "Electric";
	static String defrostSystem = "Auto Defrost";
	static String material = "Stainless Steel";
	
public static void main(String[] args){

	//local  variable
	/*String brand = "Panasonic";
	int capacity = 25;
	String colour = "Black";
	String cookingMode = "Solo";
	int wattage = 900;
	int voltage = 230;
	String installationType = "Countertop";
	String fuelType = "Electric";
	String defrostSystem = "Auto Defrost";
	String material = "Stainless Steel";*/

	System.out.println("Brand name? " + brand);
	System.out.println("Oven capacity? " + capacity + "L");
	System.out.println("Available colour? " + colour);
	System.out.println("Cooking mode type? " + cookingMode);
	System.out.println("Power rating? " + wattage + "Watts");
	System.out.println("Operating voltage? " + voltage + "Volts");
	System.out.println("Installation type? " + installationType);
	System.out.println("Fuel used? " + fuelType);
	System.out.println("Defrost system? " + defrostSystem);
	System.out.println("Body material? " + material);

}
}
