package com.sandeep.springbootbatchdemo.beans;

import com.sandeep.springbootbatchdemo.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor  implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person item) throws Exception {
        String fname = item.firstName().toUpperCase();
        String lname = item.lastName().toUpperCase();

        System.out.println("Converting " +  item  +" to " + fname);


        return new Person(fname, lname);
    }
}
