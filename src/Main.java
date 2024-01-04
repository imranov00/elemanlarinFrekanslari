import java.util.Arrays;

public class Main {

    static int[] sortArray(int[] numbers) {
        int[] tempArr = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < tempArr.length - 1; i++) {
            for (int j = i + 1; j < tempArr.length; j++) {
                if (tempArr[j] < tempArr[i]) {
                    int tempNumber = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = tempNumber;
                }
            }
        }
        return tempArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        arr = sortArray(arr);

        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                counter++;
            } else {
                System.out.println(arr[i] + " sayısı " + counter + " kadar tekrar etmektedir.");
                counter = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " sayısı " + counter + " kadar tekrar etmektedir.");
    }
}
