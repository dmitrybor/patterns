package com.lineate.bench.pattern.facade;

class VegRestaurant implements Hotel {
    public Menus getMenus() {
        VegMenu v = new VegMenu();
        return v;
    }
}
