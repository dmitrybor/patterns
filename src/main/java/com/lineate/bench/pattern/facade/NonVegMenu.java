package com.lineate.bench.pattern.facade;

class NonVegMenu implements Menus {

    NonVegMenu() {
        System.out.println("Creating a non veg menu");
    }

    public void showMenu() {
        System.out.println("Menu items in non veg menu");
    }
}
