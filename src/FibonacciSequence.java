
public class FindMinValue {
    public static void main(String[] args) {
        int[] list = {5, 10, 36, 2, 1};
        int min = findMin(list);
        System.out.println("The minimum value is: " + min);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }
}
