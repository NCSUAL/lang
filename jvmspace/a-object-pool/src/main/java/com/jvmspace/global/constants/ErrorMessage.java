package com.jvmspace.global.constants;

public enum ErrorMessage {
    INPUT_BLANK_ERROR("빈 문자열이 입력되었습니다"),
    INPUT_NOT_NUMBER("숫자를 입력해주세요"),

    MENU_NOT_FOUND("존재하지 않는 메뉴입니다"),

    POOL_MAX_SIZE_INVALID("Pool의 최대 크기는 1 이상이어야 합니다"),
    POOL_MAX_WAIT_REQUIRED("최대 대기 시간은 필수입니다"),
    POOL_MAX_WAIT_INVALID("최대 대기 시간은 0 이상이어야 합니다"),
    POOL_IDLE_TIMEOUT_REQUIRED("유휴 객체의 제한 시간은 필수입니다"),
    POOL_IDLE_TIMEOUT_INVALID("유휴 객체의 제한 시간은 0 이상이어야 합니다"),

    OBJECT_ID_INVALID("식별자는 음수일 수 없습니다");

    public String getMessage() {
        return message;
    }

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }
}