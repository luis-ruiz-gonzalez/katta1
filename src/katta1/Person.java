package katta1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate fn;
    private final LocalDate fa;

    public Person(String name, LocalDate fn) {
        this.name = name;
        this.fn = fn;
        this.fa = LocalDate.now();
    }

    
    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return fn;
    }
    
    public int getAge(){
         return Period.between(fn, fa).getYears();
    }    
    
}
