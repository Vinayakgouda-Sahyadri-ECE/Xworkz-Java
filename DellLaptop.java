class DellLaptop{
	
	//static variable
	static String brand = "Dell";
	static String model = "Inspiron 15";
	static String processor = "Intel Core i5";
	static int ram = 16;
	static int storage = 512;
	static String storageType = "SSD";
	static String operatingSystem = "Windows 11";
	static String displaySize = "15.6 inch";
	static String graphics = "Integrated Intel UHD";
	static double itemWeight = 1.8;
	
public static void main(String[] args){

	//local variable
	/*String brand = "Dell";
	String model = "Inspiron 15";
	String processor = "Intel Core i5";
	int ram = 16;
	int storage = 512;
	String storageType = "SSD";
	String operatingSystem = "Windows 11";
	String displaySize = "15.6 inch";
	String graphics = "Integrated Intel UHD";
	double itemWeight = 1.8;*/

	System.out.println("Which brand has manufactured this laptop? " + brand);
	System.out.println("What is the model name assigned to this laptop? " + model);
	System.out.println("Which processor is used to power this laptop? " + processor);
	System.out.println("How much RAM is provided for multitasking performance? " + ram + " GB");
	System.out.println("What is the total internal storage capacity available? " + storage + " GB");
	System.out.println("Which type of storage technology is used in this laptop? " + storageType);
	System.out.println("Which operating system comes pre-installed on this laptop? " + operatingSystem);
	System.out.println("What is the screen size offered for display and viewing? " + displaySize);
	System.out.println("Which graphics solution is integrated into this laptop? " + graphics);
	System.out.println("How much does the laptop weigh for portability purposes? " + itemWeight + " kg");

}
}
