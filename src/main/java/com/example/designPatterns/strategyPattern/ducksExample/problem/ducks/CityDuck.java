package com.example.designPatterns.strategyPattern.ducksExample.problem.ducks;

import com.example.designPatterns.strategyPattern.ducksExample.problem.Duck;

/**
 * Created by Paavan Shah on 22-07-2023.
 */
public class CityDuck implements Duck {
    @Override
    public String fly() {
        return "High-intensity flying";
    }

    @Override
    public String walk() {
        return "Walking casually";
    }
}
