import java.util.*;

class HashSetExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt(); 

        int a[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]); 
        }

        System.out.println("Array after removing duplicates:");
        for (int item : set) {
            System.out.print(item + " ");
        }
    }
}
