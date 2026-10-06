package com.jvmspace.domain.object;

public enum ObjectState {
    ACTIVE("active"),
    IDLE("idle"),
    DESTROYED("destroyed");

    private final String state;

    ObjectState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}