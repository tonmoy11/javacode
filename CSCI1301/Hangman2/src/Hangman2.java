import java.util.Scanner;


public class
{
    
    //_______________________________________________________
    //Main Program___________________________________________
    //_______________________________________________________
    public static void main(String[] args) {
        
        //Create console from the Scanner class
        Scanner input= new Scanner(System.in);
        
        //Ask user to choose which operation to select for practice
        
        //initialize loop  flag
        boolean loopContinuation = true;
        
        //create a do -loop for the quiz until the user
        //decides to quit
        do{
            System.out.print("Select which type of quizzes you want to practice \n (enter 1 for additions or 2 for subtractions or 3 for multiplication or 4 for division):");
            
            //read user choice of operation
            //using switch method
            
            int userChoice = input.nextInt();
            
            switch(userChoice){
                    
                case 1://selection for addition quiz
                    Addition(input);
                    break;
                    
                case 2://selection for subtraction quiz
                    start_Subtraction_Quiz(input);
                    break;
                    
                case 3://selection for division quiz
                    start_Division_Quiz(input);
                    break;
                    
                case 4://selection for multiplication quiz
                    start_Multiplication_Quiz(input);
                    break;
                    
                default;
                    System.out.print("******Error: Invalid quiz type.");
                    
                    //Ask the user if he/she wants to continue the quiz
                    System.out.print("Want to practice a different type of quiz");
                    
                    if(loopContinuation=input.nextInt()==1){
                        true;
                    else
                        false;
                    } while(toContinue);
        
                    //Display  congratualte message and farewell meesage
                    System.out.print(" You have made a great effor. Thank You. Have a nice day");
                    
                        input.close;
            
            }// end main();

//_______________________________________________________
//ADDITION QUIZ PRACTICE METHOD__________________________
//_______________________________________________________

public static void Addition(Scanner input) {



        
                