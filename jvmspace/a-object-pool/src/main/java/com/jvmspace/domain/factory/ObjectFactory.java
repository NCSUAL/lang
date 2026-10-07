package com.jvmspace.domain.factory;

import com.jvmspace.domain.object.PooledObject;

public interface ObjectFactory {
    PooledObject create();
}