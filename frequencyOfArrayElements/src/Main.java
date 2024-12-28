import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // show the array created by user
    public static void showArray(ArrayList<Integer> list) {
        System.out.println(list);
    }

    // find the numbers in array
    public static void getFrequency(ArrayList<Integer> list, ArrayList<Integer> listRepeated) {
        int temp;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (temp == list.get(j)) {
                    listRepeated.add(temp);
                } else {
                    continue;
                }
            }
        }
        System.out.println(listRepeated);
    }

    public static void main(String[] args) {

        // variables / objects
        int number;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listRepeated = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // prompt till exit
        System.out.print("Enter numbers to add the array: \n");
        System.out.println("Press -1 to stop");
        number = input.nextInt();

        // creating the array
        while (number != -1) {
            list.add(number);
            number = input.nextInt();
        }

        // show the result
        System.out.print("Your list is: ");
        showArray(list);

        System.out.print("Repeated numbers of your array is: ");
        getFrequency(list, listRepeated);
    }
}