package com.example.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Body;

@Controller("/api")
public class HelloController {

    @Get("/hello")
    public String hello() {
        return "Hello, Micronaut!";
    }

    @Get("/hello/{name}")
    public String helloName(String name) {
        return "Hello, " + name + "!";
    }

    @Post("/greet")
    public String greet(@Body String message) {
        return "You said: " + message;
    }

    @Get(value = "/json", produces = MediaType.APPLICATION_JSON)
    public Person getPerson() {
        return new Person("John Doe", 30);
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}