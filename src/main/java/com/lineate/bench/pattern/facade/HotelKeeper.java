package com.lineate.bench.pattern.facade;

import java.util.Map;

public class HotelKeeper {
    private Map<MenuType, Hotel> restaurants;

    public HotelKeeper(Hotel vegRestaurant, Hotel nonVegRestaurant, Hotel bothRestaurant) {
        restaurants = Map.of(MenuType.VEGITARIAN, vegRestaurant,
                MenuType.NON_VEGITARIAN, nonVegRestaurant,
                MenuType.BOTH, bothRestaurant);
    }

    public Menus getMenu(MenuType menuType) {
        return restaurants.get(menuType).getMenus();
    }
}
