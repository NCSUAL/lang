package com.jvmspace.view.ui.menu;

import com.jvmspace.global.constants.ErrorMessage;

public enum MenuOption {
    BORROW(1),
    RETURN(2),
    DISPOSE(3),
    STATUS(4),
    EXIT(5);

    private final int number;

    MenuOption(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static MenuOption from(int number) {
        for(MenuOption option: MenuOption.values()) {
            if(option.number == number) {
                return option;
            }
        }

        throw new IllegalArgumentException(ErrorMessage.MENU_NOT_FOUND.getMessage());
    }
}