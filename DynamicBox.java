import java.util.*;
import java.util.Scanner;


//Create Java skeleton 
public class DynamicBox
{

    //Create box and heigt values 

    public static void main(String[] args) {
        int boxheight = 0;
        int boxwidth = 0;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Please enter Height: ");
        boxheight = scanner.nextInt();
        System.out.println("Please enter Width: ");
        boxwidth= scanner.nextInt();
        
        //Error handling if statements to ensure user enters right format/number.
        if(boxheight < 0){
            System.out.println("You have entered a negative number.");
        }
    
        else if(boxwidth < 0)
        {
            System.out.println("You have entered a negative number.");
        }

        else if(boxheight == 0 || boxwidth ==0)
        {
            System.out.println("Please enter an integer greater than 0.");
        }
        else{
            createDynamicBox(boxheight, boxwidth);
        }
        System.out.println("Enter 0 to exit");
        int exit = scanner.nextInt();
        if(exit == 0){
            System.exit(0);
        }

    }

    public static void createDynamicBox(int h, int w){

        //This section of code creates the top section of the box

        //Char array created storing width
        char[] flexibox = new char[w];

        //This will initialise the first element of the box with the given symbol.
        flexibox[0] = '┌';

        //In the last position of the array, allocate it the given symbol.
        flexibox[flexibox.length-1] = '┐';

        //Loop through the length of the char array and print the symbol between the top right and top left elements.
        for(int i = 1; i<flexibox.length -1; i++){
            flexibox[i] = '─';
        }

        //Convert the char array into a String and print this
        System.out.println(new String(flexibox));



        //This section of code creates the middle section of the box
        
        //Rebuild the initial char array whereby the length is the width inputted
        flexibox = new char[w];

        //The reason why the height is decreased by 2 is because we only want to loop through the middle of the box and not the top and bottom
        for(int i = 0; i< h-2; i++){
            
            
            flexibox[0] = '│';

           
            for(int j = 1; j<flexibox.length -1; j++){
                flexibox[j] = ' ';
            }

           
            flexibox[flexibox.length-1] ='│';

            //Convert the char array into a String and print out new output
            System.out.println(new String(flexibox));
        }


        //Section 2: Rebuilds length

        //Rebuild the initial char array whereby the length is the width inputted
        flexibox = new char[w];

        //Initialise the first element of the box with the given symbol.
        flexibox[0] = '└';

        //Last position of the array, allocate it the given symbol.
        flexibox[flexibox.length-1] = '┘';

        //Lopps used to iterate count of flexibox length between the bottom right and bottom left elements.
        for(int i = 1; i<flexibox.length -1; i++){
            flexibox[i] = '─';
        }

        //Converts  the char array into a String and then prints out new output.
        System.out.println(new String(flexibox));
        
      


    }
}