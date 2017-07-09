package amazon.primes;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.primes.Primes;

import java.util.stream.*;

public class PrimeService {

  public List<Integer> getPrimeNumbers(int start, int end) {
      return IntStream.range(start, end)
                      .filter(Primes::isPrime)
                      .boxed()
                      .collect(Collectors.toList());
  }
}
