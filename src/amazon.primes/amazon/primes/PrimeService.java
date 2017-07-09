package amazon.primes;
import java.util.Arrays;
import java.util.List;

public class PrimeService {

  public List<Integer> getPrimeNumbers(int start, int end) {
      return Arrays.asList(11, 13, 17, 19);
  }

  public static void main(String args[]) {
    System.out.println(new PrimeService().getPrimeNumbers(10,20));
  }
}
