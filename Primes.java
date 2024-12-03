import java.net.Socket;

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];
        int counter = 0;

        System.out.println("Prime numbers up to " + n + ":");
        
        for (int i = 2; i < n + 1; i++) {
            if (i != 2 && i % 2 == 0) {
                arr[i] = false;
            }
            else if (i != 3 && i % 3 == 0) {
                arr[i] = false;
            }
            else if (i != 5 && i % 5 == 0) {
                arr[i] = false;
            }
            else {
                arr[i] = true;
            }
            if (arr[i] == true) {
                System.out.println(i);
                counter++;
            }
        }

        int percentage = (int) ((double) counter / n * 100);
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + percentage + "% are primes)" );
    } 
}