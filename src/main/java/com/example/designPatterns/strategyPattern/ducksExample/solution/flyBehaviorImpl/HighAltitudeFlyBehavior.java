package com.example.designPatterns.strategyPattern.ducksExample.solution.flyBehaviorImpl;

import com.example.designPatterns.strategyPattern.ducksExample.solution.FlyBehavior;

/**
 * Created by Paavan Shah on 22-07-2023.
 */
public class HighAltitudeFlyBehavior implements FlyBehavior {
    @Override
    public String fly() {
        return "High-altitude flying";
    }
}
