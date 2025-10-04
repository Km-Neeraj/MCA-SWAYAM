import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { 
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }


        Collections.sort(even);
        Collections.sort(odd);

        
        System.out.print("Sorted even array : ");
        for (int num : even) System.out.print(num + " ");
        System.out.println();

        System.out.print("Sorted odd array : ");
        for (int num : odd) System.out.print(num + " ");
        System.out.println();

        
        int secondLargestEven = (even.size() >= 2) ? even.get(even.size() - 2) : even.get(even.size() - 1);
        int secondLargestOdd = (odd.size() >= 2) ? odd.get(odd.size() - 2) : odd.get(odd.size() - 1);

        int sum = secondLargestEven + secondLargestOdd;

        System.out.println(sum);

        sc.close();
    }
}
