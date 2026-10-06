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
        return retryUntilValidInput(() -> {
            menuView.showMenu();
            return menuView.readMenuOption();
        });
    }

    private <T> T retryUntilValidInput(Supplier<T> action){
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