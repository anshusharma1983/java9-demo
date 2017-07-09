package amazon.client;

import amazon.primes.PrimeService;
import java.util.List;

public class Client {

  public static void main(String args[]) {
      PrimeService service = new PrimeService();
      List<Integer> primeNumbers = service.getPrimeNumbers(250,300);
      System.out.println(primeNumbers);
  }

}
