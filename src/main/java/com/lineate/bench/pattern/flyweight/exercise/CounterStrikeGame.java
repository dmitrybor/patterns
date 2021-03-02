package com.lineate.bench.pattern.flyweight.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class CounterStrikeGame {
    private static final List<String> weapons = List.of("Gut Knife", "Desert Eagle", "AK-47");

    public static void main(String[] args) {
        PlayerFactory playerFactory = new PlayerFactory();
        Random random = new Random();
        List<Player> players = new ArrayList<>();
        IntStream.rangeClosed(1, 5).forEach(i -> {
            try {
                Player player = playerFactory.getPlayer(PlayerType.TERRORIST);
                player.assignWeapon(weapons.get(random.nextInt(weapons.size())));
                players.add(player);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        IntStream.rangeClosed(1, 5).forEach(i -> {
            try {
                Player player = playerFactory.getPlayer(PlayerType.COUNTER_TERRORIST);
                player.assignWeapon(weapons.get(random.nextInt(weapons.size())));
                players.add(player);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        players.stream().map(Player::getMission).forEach(System.out::println);
    }
}
