class KgfMovie{
	
		//static variable
		static String movieName = "KGF";
        static String directorName = "Prashanth Neel";
        static int releaseYear = 2022;
        static float rating = 4.8f;
        static double budgetInCrores = 100.50;
        static long movieId = 7788990011L;
        static String heroName = "Yash";
        static String language = "Kannada";
        static float durationInHours = 2.45f;
		
    public static void main(String[] args) {

		//local variable
        /*String movieName = "KGF";
        String directorName = "Prashanth Neel";
        int releaseYear = 2022;
        float rating = 4.8f;
        double budgetInCrores = 100.50;
        long movieId = 7788990011L;
        String heroName = "Yash";
        String language = "Kannada";
        float durationInHours = 2.45f;*/

        System.out.println("The name of the movie is " + movieName + ".");
        System.out.println("The director of the movie is " + directorName + ".");
        System.out.println("The movie was released in the year " + releaseYear + ".");
        System.out.println("The movie has received a rating of " + rating + " stars.");
        System.out.println("The budget of the movie is " + budgetInCrores + " crores.");
        System.out.println("The unique movie identification number is " + movieId + ".");
        System.out.println("The hero of the movie is " + heroName + ".");
        System.out.println("The language of the movie is " + language + ".");
        System.out.println("The total duration of the movie is " + durationInHours + " hours.");
    }
}
