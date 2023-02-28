package Java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Day004{

    public static void main(String[] args){
        
        List<Person> beatles = new ArrayList<>();
    }



    static class Person{

        private final String id;

        private final String firstName;

        private final String dateOfBirth;


        Person(String id, String firstName, LocalDate dateOfBirth) {
            this.id = id;
            this.firstName = firstName;
            this.dateOfBirth = dateOfBirth;
        }
    }
}
