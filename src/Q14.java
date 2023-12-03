
public class Q14 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 42;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Don't try buffer overflow attacks in Java!");
        }
    }
}


