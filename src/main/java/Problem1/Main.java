package Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the option: \n 1.2D  \n 2.3D");
        int choice = sc.nextInt();
        int length, breadth;
        switch (choice) {
            case 1:
                System.out.println("Enter the length");
                length = sc.nextInt();
                System.out.println("Enter the Breadth");
                breadth = sc.nextInt();
                Box3D objArea = new Box3D(length,breadth);
                int area = objArea.area();
                System.out.println("Area: " + area);
                break;
            case 2:
                System.out.println("Enter the length");
                length = sc.nextInt();
                System.out.println("Enter the Breadth");
                breadth = sc.nextInt();
                System.out.println("Enter the height");
                int height = sc.nextInt();
                Box3D objVolume = new Box3D(length,breadth,height);
                int volume = objVolume.volume();
                System.out.println("Volume: "+ volume);
                break;
            default:
                System.out.println("Invalid options");
        }
    }
}
