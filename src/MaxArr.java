import java.util.Scanner;

public class MaxArr {
    public static void main(String[] args) {
        int arr[];
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("input size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("size should not exceed 20!");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i=0; i<arr.length; i++) {
            System.out.println("enter element " + (i+1)+" :");
            arr[i] = input.nextInt();
        }
        System.out.println("danh sach mang la: ");
        for (int j=0; j<arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j=1; j<arr.length; j++) {
            if (arr[j]>max) {
                max = arr[j];
                index = j+1;
            }
        }
        System.out.println("max arr la: "+max +" o vi tri "+ index);
    }
}
