package com.tazine.third.serialization.thrift;

import com.tazine.third.serialization.ISerializer;

/**
 * ThriftSerializer
 *
 * @author frank
 * @date 2018/12/26
 */
public class ThriftSerializer implements ISerializer {

    public <T> byte[] serialize(T obj) {
        return new byte[0];
    }

    public <T> T deserialize(byte[] data, Class<T> clz) {
        return null;
    }
}
