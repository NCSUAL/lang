package com.jvmspace.controller;

import com.jvmspace.view.ui.MenuView;
import com.jvmspace.view.ui.menu.MenuOption;

import java.util.function.Supplier;

public class PoolController {
    private final MenuView menuView;

    public PoolController(MenuView menuView) {
        this.menuView = menuView;
    }

    public MenuOption requestMenuOption() {
        return retryUntilValid(() -> {
            menuView.showMenu();
            return menuView.readMenuOption();
        });
    }

    private <T> T retryUntilValid(Supplier<T> action){
        while (true) {
            try{
                return action.get();
            }
            catch (IllegalArgumentException e) {
                menuView.showError(e.getMessage());
            }
        }
    }
}