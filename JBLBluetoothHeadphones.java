class JBLBluetoothHeadphones{
	
	//static variable
	static String brand = "JBL";
	static String modelName = "Tune 770NC";
	static String colour = "Black";
	static String connectivity = "Bluetooth";
	static String noiseCancellation = "Active Noise Cancelling";
	static int batteryLife = 70;
	static String chargingType = "USB Type-C";
	static String driverSize = "40 mm";
	static String controlType = "Buttons and Touch";
	static double itemWeight = 232;
	
public static void main(String[] args){

    //local variable
	/*String brand = "JBL";
	String modelName = "Tune 770NC";
	String colour = "Black";
	String connectivity = "Bluetooth";
	String noiseCancellation = "Active Noise Cancelling";
	int batteryLife = 70;
	String chargingType = "USB Type-C";
	String driverSize = "40 mm";
	String controlType = "Buttons and Touch";
	double itemWeight = 232;*/

	System.out.println("Which brand has manufactured these headphones? " + brand);
	System.out.println("What is the model name given to these headphones? " + modelName);
	System.out.println("Which colour variant is available for this product? " + colour);
	System.out.println("What type of wireless connectivity do these headphones support? " + connectivity);
	System.out.println("Which noise cancellation technology is provided in these headphones? " + noiseCancellation);
	System.out.println("How long can the headphones run on a single full charge? " + batteryLife + " hours");
	System.out.println("Which type of charging interface is used for these headphones? " + chargingType);
	System.out.println("What is the size of the audio drivers used in the headphones? " + driverSize);
	System.out.println("How can the user control the functions of these headphones? " + controlType);
	System.out.println("What is the overall weight of the headphones? " + itemWeight + " g");

}
}
