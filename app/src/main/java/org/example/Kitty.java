package org.example;

public class Kitty implements Cutie {
    @Override
    public String description() {
        return "A fluffy kitten with tiny paws.";
    }

    @Override
    public Integer cutenessRating() {
        return 10;
    }
}
