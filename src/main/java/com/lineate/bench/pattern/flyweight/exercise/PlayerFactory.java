package com.lineate.bench.pattern.flyweight.exercise;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private Map<PlayerType, Player> players = new HashMap<>();
    private static final String TERRORIST_TASK = "PLANT A BOMB";
    private static final String COUNTER_TERRORIST_TASK = "DEFUSE A BOMB";

    public Player getPlayer(PlayerType type) throws IllegalAccessException {
        if (!players.containsKey(type)) {
            switch (type) {
                case TERRORIST:
                    System.out.println("Terrorist player created");
                    players.put(type, new PlayerImpl(type, TERRORIST_TASK));
                    break;
                case COUNTER_TERRORIST:
                    System.out.println("Counter Terrorist player created");
                    players.put(type, new PlayerImpl(type, COUNTER_TERRORIST_TASK));
                    break;
                default:
                    throw new IllegalAccessException("The factory can create only Terorist and Counter Terrorist players");
            }
        }
        return players.get(type);
    }
}
