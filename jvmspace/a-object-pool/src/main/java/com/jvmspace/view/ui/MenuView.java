package com.jvmspace.view.ui;

import com.jvmspace.global.Parser;
import com.jvmspace.global.constants.OutputMessage;
import com.jvmspace.view.ui.menu.MenuOption;

public class MenuView {
    private final InputView inputView;
    private final OutputView outputView;

    public MenuView(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void showMenu() {
        outputView.printlnMessage(OutputMessage.MENU_PROMPT.getMessage());
        outputView.printlnMessage(OutputMessage.MENU_OPTIONS.getMessage());
    }

    public void showError(String message) {
        outputView.printlnMessage(message);
    }

    public MenuOption readMenuOption() {
        String inputMenu = inputView.readMessage();
        return Parser.parseMenuOption(inputMenu);
    }
}