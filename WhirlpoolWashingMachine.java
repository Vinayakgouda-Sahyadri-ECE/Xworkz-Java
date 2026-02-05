class WhirlpoolWashingMachine{
	
	//static variable
	static String brand = "Whirlpool";
	static int capacity = 7;
	static String colour = "Grey";
	static String accessType = "Top Load";
	static int voltage = 230;
	static int wattage = 360;
	static int washingCycles = 12;
	static String finishType = "Matte";
	static String drumMaterial = "Stainless Steel";
	static String operationMode = "Automatic";
	
public static void main(String[] args){
	
	//local variable
	/*String brand = "Whirlpool";
	int capacity = 7;
	String colour = "Grey";
	String accessType = "Top Load";
	int voltage = 230;
	int wattage = 360;
	int washingCycles = 12;
	String finishType = "Matte";
	String drumMaterial = "Stainless Steel";
	String operationMode = "Automatic";*/

	System.out.println("Brand name? " + brand);
	System.out.println("Load capacity? " + capacity + "kg");
	System.out.println("Machine colour? " + colour);
	System.out.println("Access type? " + accessType);
	System.out.println("Operating voltage? " + voltage + " Volts");
	System.out.println("Power consumption? " + wattage + " Watts");
	System.out.println("Number of wash cycles? " + washingCycles);
	System.out.println("Surface finish? " + finishType);
	System.out.println("Drum material? " + drumMaterial);
	System.out.println("Operation mode? " + operationMode);

}
}
