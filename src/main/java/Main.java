import java.util.Scanner;


public class Main {public static void main(String[] args){

    Scanner scan = new Scanner (System.in);

// intro
    System.out.println("hello welcome to the paint calc ");


// area of wall
    System.out.println("what is the length of your wall in meters?");
    int length = scan.nextInt();

    System.out.println("what is the width of your wall in meters? ");
    int width = scan.nextInt();

    int wallarea = length * width;
    System.out.println("Area is:" + wallarea + "Meters");

    //how many doors + area of doors
    System.out.println("How many doors do you have?");
    int doors = scan.nextInt();

    System.out.println("what is the total area of these xdoors");
    double xdoors = scan.nextDouble();

    // how many sockets + area of sockets
    System.out.println("how many sockets do you have?");
    int sockets = scan.nextInt();

    System.out.println("what is the total area of xsockets?");
    double xsockets = scan.nextInt();

    //how many windows + area of windows
    System.out.println("How many windows?");
    int windows = scan.nextInt();

    System.out.println("total area of xwindows?");
    double xwindows = scan.nextDouble();

    // available area of wall to paint
    double remarea = (wallarea - xdoors - xsockets - xwindows);
    System.out.println("area to paint on =" + remarea + "Meters squared)");

    //
















}
}
