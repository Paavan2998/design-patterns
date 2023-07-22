package com.example.designPatterns.strategyPattern.ducksExample.solution.main;

import com.example.designPatterns.strategyPattern.ducksExample.solution.FlyBehavior;
import com.example.designPatterns.strategyPattern.ducksExample.solution.WalkBehavior;

/**
 * Created by Paavan Shah on 22-07-2023.
 */
public class Duck implements com.example.designPatterns.strategyPattern.ducksExample.solution.Duck {

    private String name;

    private FlyBehavior flyBehavior;

    private WalkBehavior walkBehavior;

    public Duck(String name, FlyBehavior flyBehavior, WalkBehavior walkBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.walkBehavior = walkBehavior;
    }

    @Override
    public String fly() {
        return this.flyBehavior.fly();
    }

    @Override
    public String walk() {
        return this.walkBehavior.walk();
    }

    @Override
    public String toString() {
        return name + " flyBehavior=" + flyBehavior.fly() +
                ", walkBehavior=" + walkBehavior.walk();
    }
}
