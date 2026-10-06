package com.jvmspace.view.ui;

import com.jvmspace.global.constants.ErrorMessage;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readMessage() {
        String message = scanner.nextLine();
        validateNotBlank(message);
        return message;
    }

    private void validateNotBlank(String message) {
        if(message.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_BLANK_ERROR.getMessage());
        }
    }
}