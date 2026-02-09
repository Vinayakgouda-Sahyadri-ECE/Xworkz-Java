class VTUinternyet{

static void saveUserAccount(
String fullName ,
String emailAddress ,
long mobileNumber ,
String password ,
String confirmPassword ,
boolean agreeToTermsandCondition){ 

System.out.println("User Full name is "+ fullName);
System.out.println("User Email Address is "+emailAddress);
System.out.println("User Mobile Number is "+mobileNumber);
System.out.println("User Password is "+password);
System.out.println("User confirms the Password is "+confirmPassword);
System.out.println("User Agrees to terms and conditions"+ agreeToTermsandCondition);


}



public static void main(String [] args){
	
	saveUserAccount("Vinayakgouda S A","vinayakayy04@gmail.com",8217279387l,"vinayak@2504", "vinayak@2504",true);






}
}