package com.lineate.bench.pattern.facade;

class Both implements Menus {

    Both() {
        System.out.println("Creating both a veg and non veg menu");
    }

    public void showMenu() {
        System.out.println("Menu items in both a veg and non veg menu");
    }
}
