/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9.pkg19practice;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Class919practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Please enter your Full Name: ");
        String fullName = userInput.nextLine();
        
        System.out.print("Please enter your Year in College between 1 - 4: ");
        int yearInCollege = userInput.nextInt();
        userInput.nextLine();
        while(yearInCollege < 1 || yearInCollege > 4)
        {
           System.out.print("Please enter a year between 1 and 4: ");
           yearInCollege = userInput.nextInt();
           userInput.nextLine();
        }
                
        System.out.print(
                "Please enter whether your professor is Tyler, Michelle, or "
                        + "Rick: ");
        String professorName = userInput.nextLine();
        String professorOne = "Tyler";
        String professorTwo = "Michelle";
        String professorThree = "Rick";
        while(!professorName.equals(professorOne) || 
                !professorName.equals(professorTwo) || 
                !professorName.equals(professorThree))
        {
           System.out.print("Please enter \"Tyler\", \"Michelle\", or "
                   + "\"Rick\" for your Professor's Name: ");
           professorName = userInput.nextLine();
        }
        
        System.out.print("Please enter your Lab Section between 1 - 6: ");
        int labSection = userInput.nextInt();
        userInput.nextLine();
        while(labSection < 1 || labSection > 6)
        {
           System.out.print("Please enter a Lab Section between 1 and 6: ");
           labSection = userInput.nextInt();
           userInput.nextLine();
        }
        
        System.out.print("Please enter your Lecture Section between 1 - 5: ");
        int lectureSection = userInput.nextInt();
        while(lectureSection < 1 || lectureSection > 5)
        {
           System.out.print("Please enter a Lecture Section between 1 and 5: ");
           lectureSection = userInput.nextInt();
           userInput.nextLine();
        }
        System.out.println("_________________________________________________");
        
        System.out.println(fullName);
        System.out.println(yearInCollege);
        System.out.println(professorName);
        System.out.println(labSection);
        System.out.println(lectureSection);
        
        
    }
    
}
