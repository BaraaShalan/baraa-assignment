//In Java, one approach to avoid overflow in arithmetic progressions is to use BigInteger class, which can handle arbitrarily large numbers. Here is a modified version of the ArithmeticProgression class:
//
//
import java.math.BigInteger;

    public class ArithmeticProgression {
        private BigInteger first;
        private BigInteger commonDifference;

        public ArithmeticProgression(BigInteger first, BigInteger commonDifference) {
            this.first = first;
            this.commonDifference = commonDifference;
        }

        public BigInteger get(int n) {
            return first.add(commonDifference.multiply(BigInteger.valueOf(n)));
        }
    }


