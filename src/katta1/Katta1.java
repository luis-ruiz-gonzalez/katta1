package katta1;

import java.util.Date;

public class Katta1 {

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(49, 8, 25));
        System.out.println(person.getName() + " tine " + person.getAge());
    }
    
}
