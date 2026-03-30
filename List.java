import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        
        for (int i = 0; i < 50; i++) {
            numbers.add(obj.nextInt());
        }
    }
}
