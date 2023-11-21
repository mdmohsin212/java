public class array {
    public static void main(String[] args) {
        int[] ar = {23,45,54,28,78};
        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        System.out.println(sum);
    }
}