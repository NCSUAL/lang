package com.jvmspace.domain.object;

public class PooledObject {
    private final ObjectId id;
    private ObjectState state;

    private PooledObject(ObjectId id) {
        this.id = id;
        this.state = ObjectState.IDLE;
    }

    public static PooledObject from(ObjectId id) {
        return new PooledObject(id);
    }

    public void borrow() {
        state = ObjectState.ACTIVE;
    }

    public void release() {
        state = ObjectState.IDLE;
    }

    public void destroy() {
        state = ObjectState.DESTROYED;
    }

    public ObjectState getState() {
        return state;
    }

    public ObjectId getId() {
        return id;
    }
}