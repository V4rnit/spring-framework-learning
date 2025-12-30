package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Record essentially is a class that has the fields name and age(in a record getter/setter,
// constuctor and a toString method is created by default (introduced in JDK 16))
record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};
record Whole(Person p, Address a){};
@Configuration
public class HelloWorldConfig{
    @Bean
    public String name(){
        return "Varnit";
    }
    @Bean
    public int age(){
        return 25;
    }
    @Bean
    @Primary
    public Person person(){
        Person p  = new Person("Victor", 22, new Address("Southern", "ORD"));
        return p;
        // return new Person("Victor", 22);
    }
    @Bean
    public Person person2(String name, int age, Address address){
        return new Person(name, age, address);
    }
    @Bean
    public Address address(){
        Address a = new Address("Hogwarts", "London");
        return a;
        //return new Address("Hogwarts", "London");
    }
    @Bean
    public Whole w (Person p, Address a)    {
        return new Whole(p, a);
    }
}
