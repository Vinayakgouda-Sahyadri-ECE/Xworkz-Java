class MiltonWaterBottle{
	
		//static variable
		static String brandName = "Milton";
        static String material = "Steel";
        static int capacityInMl = 1000;
        static float weightInKg = 0.45f;
        static double price = 799.99;
        static long productId = 6677889900L;
        static String color = "Blue";
        static int warrantyInMonths = 12;
        static float heightInCm = 28.5f;

    public static void main(String[] args) {

		//local variable
        /*String brandName = "Milton";
        String material = "Steel";
        int capacityInMl = 1000;
        float weightInKg = 0.45f;
        double price = 799.99;
        long productId = 6677889900L;
        String color = "Blue";
        int warrantyInMonths = 12;
        float heightInCm = 28.5f;*/

        System.out.println("The brand name of the water bottle is " + brandName + ".");
        System.out.println("The material used to make the water bottle is " + material + ".");
        System.out.println("The capacity of the water bottle is " + capacityInMl + " milliliters.");
        System.out.println("The weight of the water bottle is " + weightInKg + " kilograms.");
        System.out.println("The price of the water bottle is " + price + " rupees.");
        System.out.println("The product identification number of the water bottle is " + productId + ".");
        System.out.println("The color of the water bottle is " + color + ".");
        System.out.println("The warranty period of the water bottle is " + warrantyInMonths + " months.");
        System.out.println("The height of the water bottle is " + heightInCm + " centimeters.");
    }
}