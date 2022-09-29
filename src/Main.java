import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area;
        double perimeter;
        double hypotenuse;
        double middle = 0;
        String trash;

        System.out.print("What is the length of the height: ");
        if(in.hasNextDouble())
        {
            height = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input.");
        }
        System.out.print("What is the length of the width: ");
        if(in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input.");
        }
        area = width * height;
        System.out.println("The area is " + area);
        perimeter = (width*2) + (height*2);
        System.out.println("The perimeter is " + perimeter);
        middle = (width * width) + (height * height);
        hypotenuse = Math.sqrt(middle);
        System.out.println("The hypotenuse is " + hypotenuse);

    }
}