package Problem1;

import java.util.Scanner;

public class Main {

    public int findArea(int length, int breadth, int height) {
        int choice = 0;
        choice = height == 0 ? 1 : 2;
        switch (choice) {
            case 1:
                Box3D objArea = new Box3D(length,breadth);
                int area = objArea.area();
                return area;
            case 2:
                Box3D objVolume = new Box3D(length,breadth,height);
                int volume = objVolume.volume();
                return volume;
            default:
                System.out.println("Invalid options");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main ob = new Main();
        ob.findArea(1,4,0);
        ob.findArea(1,4,5);

    }
}
