class TataBloodPressureMonitor{
	
	//static variable
	static String brand = "TATA 1MG";
	static String displayType = "LCD";
	static String powerSource = "Battery Powered";
	static String ageRange = "Adult";
	static String accuracyType = "Clinically Validated";
	static String cuffSize = "22 cm to 42 cm";
	static String heartbeatIndicator = "Irregular Heartbeat Indicator";
	static String powerOptions = "USB Type-C and AA Battery";
	static String displaySize = "6.2 x 8 cm";
	static int memoryStorage = 180;
	
public static void main(String[] args){
	
	//loacal variable
	/*String brand = "TATA 1MG";
	String displayType = "LCD";
	String powerSource = "Battery Powered";
	String ageRange = "Adult";
	String accuracyType = "Clinically Validated";
	String cuffSize = "22 cm to 42 cm";
	String heartbeatIndicator = "Irregular Heartbeat Indicator";
	String powerOptions = "USB Type-C and AA Battery";
	String displaySize = "6.2 x 8 cm";
	int memoryStorage = 180;*/

	System.out.println("Brand name? " + brand);
	System.out.println("Display type? " + displayType);
	System.out.println("Power source? " + powerSource);
	System.out.println("Intended age group? " + ageRange);
	System.out.println("Accuracy standard? " + accuracyType);
	System.out.println("Cuff size range? " + cuffSize);
	System.out.println("Heartbeat alert available? " + heartbeatIndicator);
	System.out.println("Power options supported? " + powerOptions);
	System.out.println("Display size? " + displaySize);
	System.out.println("Memory capacity? " + memoryStorage + " readings");

}
}
