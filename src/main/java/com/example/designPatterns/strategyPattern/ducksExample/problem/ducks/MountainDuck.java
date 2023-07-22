package com.example.designPatterns.strategyPattern.ducksExample.problem.ducks;

import com.example.designPatterns.strategyPattern.ducksExample.problem.Duck;

/**
 * Created by Paavan Shah on 22-07-2023.
 */
public class MountainDuck implements Duck {
    @Override
    public String fly() {
        return "High-altitude flying";
    }

    @Override
    public String walk() {
        return "Files or stands still";
    }
}
