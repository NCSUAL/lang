package com.jvmspace.global;

import com.jvmspace.global.constants.ErrorMessage;
import com.jvmspace.view.ui.menu.MenuOption;

public class Parser {
    private Parser() {

    }

    public static MenuOption parseMenuOption(String option) {
        int number = parseInt(option);
        return MenuOption.from(number);
    }

    private static int parseInt(String input) {
        try{
            return Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_NOT_NUMBER.getMessage());
        }
    }
}