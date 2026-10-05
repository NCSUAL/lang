package com.jvmspace.global.constants;

public enum OutputMessage {
    MENU_PROMPT("번호를 선택해주세요."),
    MENU_OPTIONS("1. 객체 대여, 2. 객체 반환, 3. 객체 폐기, 4. Pool 상태 조회, 5. Pool 종료");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}