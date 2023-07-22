package com.example.designPatterns.strategyPattern.ducksExample.solution.walkBehaviorImpl;

import com.example.designPatterns.strategyPattern.ducksExample.solution.WalkBehavior;

/**
 * Created by Paavan Shah on 22-07-2023.
 */
public class NoWalkBehavior implements WalkBehavior {
    @Override
    public String walk() {
        return "No walking";
    }
}
