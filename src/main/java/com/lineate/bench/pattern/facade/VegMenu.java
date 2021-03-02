package com.lineate.bench.pattern.facade;

class VegMenu implements Menus {

    VegMenu() {
        System.out.println("Creating a veg menu");
    }

    public void showMenu() {
        System.out.println("Menu items in veg menu");
    }
}
