class MarshallWoburnIII{
	
	//static variable
	static String colour = "Black";
	static int maxOutputPower = 25;
	static int frequencyResponse =45;
	static String connectivity = "Auxiliary, Bluetooth, HDMI, Wireless";
	static String audioOutputMode = "Surround";
	static String powerSource = "AC";
	static String productDimensions = "40 x 20.3 x 31.7 cm";
	static double itemWeight = 7.4;
	static String speakerType = "Subwoofer";
	static String waterResistance = "Waterproof";
	static String controlMethod = "App";
	
public static void main(String[] args){
	
	//local variable	
	/*String colour = "Black";
	int maxOutputPower = 25;
	int frequencyResponse =45;
	String connectivity = "Auxiliary, Bluetooth, HDMI, Wireless";
	String audioOutputMode = "Surround";
	String powerSource = "AC";
	String productDimensions = "40 x 20.3 x 31.7 cm";
	double itemWeight = 7.4;
	String speakerType = "Subwoofer";
	String waterResistance = "Waterproof";
	String controlMethod = "App";*/
	

	System.out.println("In which colour is the speaker available? " + colour);
	System.out.println("How much maximum output power does the speaker provide? " + maxOutputPower + " Watts");
	System.out.println("What is the frequency response value of the speaker? " + frequencyResponse + " Hz");
	System.out.println("Which connectivity options does the speaker support? " + connectivity);
	System.out.println("In which audio output mode does the speaker operate? " + audioOutputMode);
	System.out.println("How is the speaker powered for use? " + powerSource);
	System.out.println("State the physical dimensions of the speaker. " + productDimensions);
	System.out.println("How heavy is the speaker unit? " + itemWeight + " kg");
	System.out.println("What category of speaker does this device fall under? " + speakerType);
	System.out.println("Is the speaker designed to be water resistant? " + waterResistance);
	System.out.println("How can the speaker be controlled by the user? " + controlMethod);
	

}
}
