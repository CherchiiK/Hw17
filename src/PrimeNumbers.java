import org.apache.commons.math3.primes.Primes;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    static void checkNumbers(String str)  {

        List<Integer> list = new ArrayList<>();
        for (String s : str.split(" ")) {
            if (s.matches("[0-9]+")) {
                list.add(Integer.parseInt(s));
            } else {
                System.out.println(s + " - is not a number");}}
        for (Integer integer : list) {
            if (Primes.isPrime(integer)) {
                System.out.println(integer + " - prime");}
            else {
                System.out.println(integer + " - not prime");
            }
        }}}