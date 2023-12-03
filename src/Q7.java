//The nextValue method from the ArithmeticProgression class increments the current value by the increment value. The maximum value a long can hold in Java is 9,223,372,036,854,775,807. If we start with a value of 1 and increment by 128 each time, the 90th call to the nextValue method will result in a long-integer overflow.
//
//        To illustrate this, here is a code snippet that calculates the maximum number of calls to the nextValue method before causing a long-integer overflow:
public class Q7 {

        public static void main(String[] args) {
            long currentValue = 1;
            int increment = 128;
            int numCalls = 0;

            while (true) {
                try {
                    currentValue += increment;
                    numCalls++;
                } catch (ArithmeticException e) {
                    break;
                }
            }

            System.out.println("The maximum number of calls to the nextValue method before causing a long-integer overflow is: " + numCalls);
        }
    }

