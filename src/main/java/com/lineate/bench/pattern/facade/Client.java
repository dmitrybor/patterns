package com.lineate.bench.pattern.facade;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Hotel vegRest = new VegRestaurant();
        Hotel nonVegRest = new NonVegRestaurant();
        Hotel bothRest = new VegNonBothRestaurant();

        HotelKeeper hotelKeeper = new HotelKeeper(vegRest, nonVegRest, bothRest);
        Arrays.stream(MenuType.values())
                .sequential()
                .forEach(menuType -> hotelKeeper.getMenu(menuType).showMenu());
    }
}
