package com.example.designPatterns.strategyPattern.ducksExample.solution.main;

import com.example.designPatterns.strategyPattern.ducksExample.solution.flyBehaviorImpl.HighAltitudeFlyBehavior;
import com.example.designPatterns.strategyPattern.ducksExample.solution.flyBehaviorImpl.HighIntensityFlyBehavior;
import com.example.designPatterns.strategyPattern.ducksExample.solution.flyBehaviorImpl.SlowSpeedFlyBehavior;
import com.example.designPatterns.strategyPattern.ducksExample.solution.walkBehaviorImpl.CasualWalkBehavior;
import com.example.designPatterns.strategyPattern.ducksExample.solution.walkBehaviorImpl.NoWalkBehavior;
import com.example.designPatterns.strategyPattern.ducksExample.solution.walkBehaviorImpl.StandStillBehavior;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paavan Shah on 22-07-2023.
 */

/**
 * Strategy pattern is the simplest pattern, in simple words it's about using composition rather inheritance.
 * It is about understanding inheritance is not intended for code reuse.
 *
 * The strategy pattern is a behavioural software design pattern that enables selecting an algorithm at runtime.
 * Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of
 * algorithms to use.
 *
 * The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently of clients that use it.
 */
public class StrategyPatternProgram {
    public static void main(String[] args) {

        List<Duck> ducks = new ArrayList<>(){};
        ducks.add(new Duck("City duck", new HighIntensityFlyBehavior(), new CasualWalkBehavior()));
        ducks.add(new Duck("Cloud duck", new HighAltitudeFlyBehavior(), new NoWalkBehavior()));
        ducks.add(new Duck("Lazy duck", new SlowSpeedFlyBehavior(), new StandStillBehavior()));
        ducks.add(new Duck("Mountain duck", new HighAltitudeFlyBehavior(), new StandStillBehavior()));

        ducks.forEach(d -> System.out.println(d.toString()));
    }
}
