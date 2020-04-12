package org.example.springcloudfunctiondemo.function;

import java.util.function.Function;

public class Greeting implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hello : " + s + ", This is from Spring Cloud Function for Lambda";
    }
}
