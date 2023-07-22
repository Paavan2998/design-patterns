package com.example.designPatterns.strategyPattern.ducksExample.solution.walkBehaviorImpl;

import com.example.designPatterns.strategyPattern.ducksExample.solution.WalkBehavior;

/**
 * Created by Paavan Shah on 22-07-2023.
 */
public class CasualWalkBehavior implements WalkBehavior {
    @Override
    public String walk() {
        return "Casual walking";
    }
}
