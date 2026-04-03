import java.util.ArrayList;
import java.util.Collections;

class Main {
    static ArrayList<String> generateBinary(int n) {
        ArrayList<String> result = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {
            int temp = num;
            String binary = "";

            // Convert decimal number to binary
            while (temp > 0) {
                int rem = temp % 2;

                if (rem == 0)
                    binary += "0";
                else
                    binary += "1";

                temp = temp / 2;
            }

            // reverse to get correct order
            StringBuilder sb = new StringBuilder(binary);
            binary = sb.reverse().toString();

            result.add(binary);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<String> binaries = generateBinary(n);

        for (String bin : binaries)
            System.out.print(bin + " ");
        System.out.println();
    }
}
