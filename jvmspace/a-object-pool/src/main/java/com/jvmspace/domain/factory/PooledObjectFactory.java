package com.jvmspace.domain.factory;

import com.jvmspace.domain.object.ObjectId;
import com.jvmspace.domain.object.PooledObject;

import java.util.concurrent.atomic.AtomicLong;

public class PooledObjectFactory implements ObjectFactory {
    private final AtomicLong sequence = new AtomicLong();

    @Override
    public PooledObject create() {
        return PooledObject.from(new ObjectId(sequence.getAndIncrement()));
    }
}