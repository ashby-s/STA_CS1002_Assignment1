import java.util.Scanner;

public class UserInterfaceMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

	    //Allows the user to be able to choose what option they would like to select
        System.out.println("What would you like to do?");
        System.out.println("1. Pretty print a baking measure.");
        System.out.println("2. Convert metric volume to baking measure.");

        int optionSelected = userInput.nextInt();

        if(optionSelected == 1){
	        //Carries out this section of code if user selects option 1

            System.out.println("Enter the number of cups");
            int userCups = userInput.nextInt();

            System.out.println("Enter the number of tablespoons");
            int userTablespoons = userInput.nextInt();

            System.out.println("Enter the number of teaspoons");
            int userTeaspoons = userInput.nextInt();

	        //Error Checking to ensure that any of the values are not negative, if so halt the program
            if(userCups < 0 || userTablespoons < 0 || userTeaspoons < 0){
                System.out.println("Invalid baking measure. Cannot have negative units.");
                return;
            }//Error Checking to ensure that at least one of the values are not 0, if so, halt the program
            else if(userCups == 0 && userTablespoons == 0 && userTeaspoons == 0){
                System.out.println("Invalid baking measure. At least one unit must be greater than 0.");
                return;
            }

	        //Creates a new object with user defined values and calls the prettyPrint() method on the object
            BakingMeasure userMeasure = new BakingMeasure(userCups, userTablespoons, userTeaspoons);
            userMeasure.prettyPrint();
        }
        else if(optionSelected == 2){
	        //Carries out this section of code if user selects option 2

	        //Allows user to input the amount of millimlitres they want.
            System.out.println("Enter the number of millilitres");
            int userSelectedMills = userInput.nextInt();

	        //Error Checking to check that the user input is not too small, if so halt the program
            if (userSelectedMills <= 2){
                System.out.println("Invalid millilitres. Must be greater than 2.");
                return;
            }

	        //Creates new MetricVolume method and calls the prettyprint() method on the output of the convert method()
            MetricVolume userMillsToConvert = new MetricVolume(userSelectedMills);
            userMillsToConvert.convert().prettyPrint();
        }
        else{
	        //Error checks if the output was invalid, if output error message and halt the program
            System.out.println("Invalid choice. Goodbye.");
            return;
        }
    }
}
