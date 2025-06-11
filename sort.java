import java.util.*;

class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Array sorted from smallest to largest:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

			
		