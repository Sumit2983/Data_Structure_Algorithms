package Data_Structure_Algorithms.Day_01_Prefix;

public class prefix {

    public static void prefixArr(int[] arr) {

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.print("Prefix array is: [");

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i]);
            if (i != prefix.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 1, 6};
        prefixArr(arr);
    }
}