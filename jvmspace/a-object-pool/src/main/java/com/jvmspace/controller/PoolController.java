package com.jvmspace.controller;

import com.jvmspace.global.constants.OutputMessage;
import com.jvmspace.view.ui.OutputView;

public class PoolController {
    private final OutputView outputView;

    public PoolController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void showMenu(){
        outputView.printlnMessage(OutputMessage.MENU_PROMPT.getMessage());
        outputView.printlnMessage(OutputMessage.MENU_OPTIONS.getMessage());
    }
}