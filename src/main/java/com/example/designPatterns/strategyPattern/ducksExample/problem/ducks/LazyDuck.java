package com.example.designPatterns.strategyPattern.ducksExample.problem.ducks;

import com.example.designPatterns.strategyPattern.ducksExample.problem.Duck;

/**
 * Created by Paavan Shah on 22-07-2023.
 */
public class LazyDuck implements Duck {
    @Override
    public String fly() {
        return "Flies at slow speed";
    }

    @Override
    public String walk() {
        return "Flies or stands still";
    }
}
