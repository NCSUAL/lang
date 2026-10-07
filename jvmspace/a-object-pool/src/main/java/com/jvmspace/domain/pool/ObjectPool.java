package com.jvmspace.domain.pool;

import com.jvmspace.domain.factory.ObjectFactory;

public class ObjectPool {
    private final PoolConfig poolConfig;
    private final ObjectFactory objectFactory;

    private ObjectPool(PoolConfig poolConfig, ObjectFactory objectFactory) {
        this.poolConfig = poolConfig;
        this.objectFactory = objectFactory;
    }

    public static ObjectPool of(PoolConfig poolConfig, ObjectFactory objectFactory) {
        return new ObjectPool(poolConfig, objectFactory);
    }
}