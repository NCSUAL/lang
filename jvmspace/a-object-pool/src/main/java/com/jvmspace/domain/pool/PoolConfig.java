package com.jvmspace.domain.pool;

import com.jvmspace.global.constants.ErrorMessage;

import java.time.Duration;
import java.util.Objects;

public record PoolConfig(
        int maxSize,
        Duration maxWait,
        Duration idleTimeout
) {
    public PoolConfig{
        Objects.requireNonNull(maxWait, ErrorMessage.POOL_MAX_WAIT_REQUIRED.getMessage());
        Objects.requireNonNull(idleTimeout, ErrorMessage.POOL_MAX_WAIT_REQUIRED.getMessage());

        if(maxSize <= 0){
            throw new IllegalArgumentException(ErrorMessage.POOL_MAX_SIZE_INVALID.getMessage());
        }

        if(maxWait.isNegative()){
            throw new IllegalArgumentException(ErrorMessage.POOL_IDLE_TIMEOUT_INVALID.getMessage());
        }

        if(idleTimeout.isNegative()){
            throw new IllegalArgumentException(ErrorMessage.POOL_IDLE_TIMEOUT_INVALID.getMessage());
        }
    }
}