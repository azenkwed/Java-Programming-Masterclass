/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.udemy.section.seven.exercises.polymorphism;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 11 ; i++) {
            Movie movie = randomMovie();
            assert movie != null;
            System.out.println("Movie #" + i +
                            ": " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n"
                    );
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated: " + randomNumber);
        switch (randomNumber) {
            case 1: return new Jaws();
            case 2: return new IndependenceDay();
            case 3: return new MazeRunner();
            case 4: return new StartWars();
            case 5: return new Forgettable();
        }
        return null;
    }
}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Aliens attemps to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Plot: Maze Runner";
    }
}

class StartWars extends Movie {
    public StartWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Plot: Star Wars";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}
