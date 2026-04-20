// 7. Write a Java program for sorting a given list of names in ascending order. 

import java.util.Scanner;

class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String names[] = new String[n];

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sorting (Ascending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Display sorted names
        System.out.println("Sorted names in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}