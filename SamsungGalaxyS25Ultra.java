class SamsungGalaxyS25Ultra{
	
	//static variable
	static String os="Android 15.0";
	static String itemModelNo="SM-S938B";
	static String connectivityTech="Bluetooth, NFC, USB, Wi-Fi";
	static int itemWeight=218;
	static int batteryPowerRating=5000;
	static String productDimensions="0.82 x 7.76 x 16.28 cm";
	static String colour="Titanium Whitesilver";
	static String cpuModel="Snapdragon 8 Elite";
	static String brand="Samsung";
	static long price=129999l;
	
public static void main(String[] args){
	
	//local variable
	/*String os="Android 15.0";
	String itemModelNo="SM-S938B";
	String connectivityTech="Bluetooth, NFC, USB, Wi-Fi";
	int itemWeight=218;
	int batteryPowerRating=5000;
	String productDimensions="0.82 x 7.76 x 16.28 cm";
	String colour="Titanium Whitesilver";
	String cpuModel="Snapdragon 8 Elite";
	String brand="Samsung";
	long price=129999l;*/
	
	System.out.println("Which brand does the device belong to? " + brand);
	System.out.println("What is the price of the device? $" + price);
	System.out.println("Which operating system does the device run on? " + os);
	System.out.println("What is the item model number? " + itemModelNo);
	System.out.println("What connectivity technologies does it support? " + connectivityTech);
	System.out.println("What is the item weight (in grams)? " + itemWeight+"grams");
	System.out.println("What is the battery power rating (in mAh)? " + batteryPowerRating+"mAh");
	System.out.println("What are the product dimensions? " + productDimensions);
	System.out.println("What is the colour of the device? " + colour);
	System.out.println("Which CPU model does it use? " + cpuModel);

}
}