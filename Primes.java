
public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];
        int counter = 0;
        arr[0] = false;
        arr[1] = false;
        System.out.println("Prime numbers up to " + n + ":");
        
        for (int i = 2; i < n + 1; i++) {
                arr[i] = true;
            }
        for (int i = 2; i < n + 1; i++) {
            if (arr[i]) {
                int j = i * i;
                while (j < n + 1) {
                    arr[j] = false;
                    j += i;
                }            
            }
        }
        for (int i = 2; i < n + 1; i++) {
            if (arr[i]) {
                System.out.println(i);
                counter++;
            }
        }
        int percentage = (int) ((double) counter / n * 100);
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + percentage + "% are primes)" );
    } 
}