import java.util.Arrays;

class RotateArray {
        static void reverse(int a[], int s, int e) {
        int start = s;
        int end = e;

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }

        public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(a));

        int k = 8;
        k = k % a.length;   
      
        reverse(a, 0, a.length - 1);     
        reverse(a, 0, k - 1);            
        reverse(a, k, a.length - 1);     

        System.out.println("Rotated array: " + Arrays.toString(a));
        
    }
}




