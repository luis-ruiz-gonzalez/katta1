package katta1;

import java.time.LocalDate;
import java.time.Month;

public class Katta1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1950, Month.JANUARY, 18);
        
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
