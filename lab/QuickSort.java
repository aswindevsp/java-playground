import java.util.Scanner;

public class QuickSort {

    static void swap(String arr[], int a, int b) {
        String temp =  arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int parition(String arr[], int l, int  r) {
        String pivot = arr[r];
        int i = l - 1;
        for(int j=l; j<=r; j++) {

            if(arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;

    }

    static void sort(String arr[], int l, int r) {
        if(l < r) {
            int pi = parition(arr, l, r);          
            sort(arr, l, pi-1);
            sort(arr, pi+1, r);
        }
    }   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name limit: ");
        int n = input.nextInt();
        String arr[] = new String[n];

        System.out.println("Enter names: ");
        for(int i=0; i<n; i++) {
            arr[i] = input.next();
        }

        sort(arr, 0, n-1);
        
        System.out.println("\nSorted list: ");
        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }

        input.close();
    }
}
