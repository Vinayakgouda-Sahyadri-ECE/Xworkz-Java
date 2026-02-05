class GabitSmartRing{
	
	//static variable
	static String brand = "Gabit";
	static String operatingSystem = "iOS, Android";
	static int storageCapacity = 1;
	static String specialFeatures = "Accelerometer, Activity Tracker, Multisport, Sleep Monitor";
	static int batteryCapacity = 14;
	static String connectivity = "Bluetooth";
	static int batteryLife = 7;
	static int chargingTime = 30;
	static double itemWeight = 3.5;
	static String material = "Titanium";
	
public static void main(String[] args){

	//local variable
	/*String brand = "Gabit";
	String operatingSystem = "iOS, Android";
	int storageCapacity = 1;
	String specialFeatures = "Accelerometer, Activity Tracker, Multisport, Sleep Monitor";
	int batteryCapacity = 14;
	String connectivity = "Bluetooth";
	int batteryLife = 7;
	int chargingTime = 30;
	double itemWeight = 3.5;
	String material = "Titanium";*/

	System.out.println("Which brand is responsible for this smart ring? " + brand);
	System.out.println("Which operating systems are supported by this device? " + operatingSystem);
	System.out.println("How much internal memory storage does the smart ring have? " + storageCapacity + " MB");
	System.out.println("What special tracking features are built into this smart ring? " + specialFeatures);
	System.out.println("What is the battery capacity provided in this device? " + batteryCapacity + " mAh");
	System.out.println("Which connectivity technology is used to pair the smart ring? " + connectivity);
	System.out.println("For how many days can the battery last on a single charge? " + batteryLife + " days");
	System.out.println("How much time is required to fully charge the smart ring? " + chargingTime + " minutes");
	System.out.println("What is the overall weight of the smart ring? " + itemWeight + " g");
	System.out.println("Which material is used to build the smart ring? " + material);

}
}
