package com.jvmspace.domain.object;

import com.jvmspace.global.constants.ErrorMessage;

public record ObjectId(long id) {
    public ObjectId {
        if (id < 0) {
            throw new IllegalArgumentException(ErrorMessage.OBJECT_ID_INVALID.getMessage());
        }
    }
}