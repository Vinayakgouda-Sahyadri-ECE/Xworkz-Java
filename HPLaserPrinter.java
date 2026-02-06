class HPLaserPrinter{
	
	//static variable
	static String brand = "HP";
	static String printerType = "Laser Printer";
	static String printTechnology = "Laser";
	static int printSpeed = 20;
	static String connectivity = "USB, Wi-Fi";
	static String colourOutput = "Monochrome";
	static int dutyCycle = 8000;
	static String paperSize = "A4";
	static String controlPanel = "LED Display";
	static double itemWeight = 7.6;
	
public static void main(String[] args){

	//local variable
	/*String brand = "HP";
	String printerType = "Laser Printer";
	String printTechnology = "Laser";
	int printSpeed = 20;
	String connectivity = "USB, Wi-Fi";
	String colourOutput = "Monochrome";
	int dutyCycle = 8000;
	String paperSize = "A4";
	String controlPanel = "LED Display";
	double itemWeight = 7.6;*/

	System.out.println("Which brand is responsible for manufacturing this printer? " + brand);
	System.out.println("What type of printer is this device categorized as? " + printerType);
	System.out.println("Which printing technology is used in this printer? " + printTechnology);
	System.out.println("How many pages per minute can this printer produce? " + printSpeed + " ppm");
	System.out.println("What connectivity options are available for printing tasks? " + connectivity);
	System.out.println("Does this printer support colour printing or monochrome output? " + colourOutput);
	System.out.println("What is the maximum monthly duty cycle supported by this printer? " + dutyCycle + " pages");
	System.out.println("Which paper size is supported for regular printing jobs? " + paperSize);
	System.out.println("What type of control interface is provided on the printer? " + controlPanel);
	System.out.println("How much does the printer weigh for installation and placement? " + itemWeight + " kg");

}
}
