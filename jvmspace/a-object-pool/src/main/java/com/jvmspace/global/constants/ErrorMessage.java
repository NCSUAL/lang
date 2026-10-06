package com.jvmspace.global.constants;

public enum ErrorMessage {
    INPUT_BLANK_ERROR("빈 문자열이 입력되었습니다"),
    INPUT_NOT_NUMBER("숫자를 입력해주세요"),

    MENU_NOT_FOUND("존재하지 않는 메뉴입니다");

    public String getMessage() {
        return message;
    }

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }
}