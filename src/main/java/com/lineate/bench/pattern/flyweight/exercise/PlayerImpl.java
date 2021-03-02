package com.lineate.bench.pattern.flyweight.exercise;

public class PlayerImpl implements Player {
    private PlayerType type;
    private String task;
    private String weapon;

    public PlayerImpl(PlayerType type, String task) {
        this.type = type;
        this.task = task;
    }

    @Override
    public String getMission() {
        return String.join(" ", type.getName(), "with weapon", weapon, "|", "Task is", task);
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }
}
