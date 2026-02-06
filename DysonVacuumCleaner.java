class DysonVacuumCleaner{
	
	//static variable
	static String brand = "Dyson";
	static String specialFeature = "Compact, Lightweight";
	static String filterType = "Cartridge";
	static String powerSource = "Battery Powered";
	static String formFactor = "Stick";
	static double capacity = 0.54;
	static int wattage = 115;
	static String colour = "Grey";
	static int batteryLife = 40;
	static double itemWeight = 2.6;
	
public static void main(String[] args){
    //local variable
	/*String brand = "Dyson";
	String specialFeature = "Compact, Lightweight";
	String filterType = "Cartridge";
	String powerSource = "Battery Powered";
	String formFactor = "Stick";
	double capacity = 0.54;
	int wattage = 115;
	String colour = "Grey";
	int batteryLife = 40;
	double itemWeight = 2.6;*/

	System.out.println("Brand name? " + brand);
	System.out.println("Key features? " + specialFeature);
	System.out.println("Filter type used? " + filterType);
	System.out.println("Power source type? " + powerSource);
	System.out.println("Form factor? " + formFactor);
	System.out.println("Dust capacity? " + capacity + " litres");
	System.out.println("Power rating? " + wattage + " Watts");
	System.out.println("Colour variant? " + colour);
	System.out.println("Battery backup time? " + batteryLife + " minutes");
	System.out.println("Total weight? " + itemWeight + " kg");

}
}
