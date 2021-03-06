/******************************************************************************
*  Author : cal17b Carter Leslie
*  Class  : Spring 2020 CS374.01 Dr. Reeves
*  Date   : 5/6/2020
*  Task   : Version Control Branching
******************************************************************************/

public class GradeControl 
{
    public static void main( String[] args )
    {
        //New major feature released!
        System.out.println( "This file is a file to show changes in the Version Control Branching assignment" );

        int grade = 59;

        if(grade > 90)
        	System.out.println("Success!");
        else if(grade < 60)
        {
        	System.out.println("You are failing!");
        	grade += 5;
        }
        else if (grade < 80)
        {
        	System.out.println("Your grade is a C");
        	grade += 7;
        }
        else if (grade < 90)
        {
        	System.out.println("Your grade is a B");
          grade += 10;
        }

        System.out.println("Your grade now is "+grade);
        System.out.println("More extra credit available!");
        grade += 3;
      
        if(grade > 90)
        	System.out.println("Success!");
        else if(grade < 60)
        {
        	System.out.println("You are failing!");
        	grade += 5;
        }
        else if (grade < 80)
        {
        	System.out.println("Your grade is a C");
        	grade += 7;
        }
        else if (grade < 90)
        {
        	System.out.println("Your grade is a B");
          grade += 5;
        }

        System.out.println("Your grade now is "+grade);
        System.out.println("More extra credit available before the final!");
        grade += 4;

        if(grade < 90)
            System.out.println("You did it! You made an A!")
        else
            System.out.println("You didn't make an A, your life is over!")
    }
}
