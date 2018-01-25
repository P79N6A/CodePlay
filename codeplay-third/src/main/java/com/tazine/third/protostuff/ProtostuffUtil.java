package com.tazine.third.protostuff;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

/**
 * Protostuff
 *
 * @author frank
 * @since 1.0.0
 */
public class ProtostuffUtil {

    public static <T> byte[] serliazer(T obj) {
        Schema schema = RuntimeSchema.getSchema(obj.getClass());
        return ProtobufIOUtil.toByteArray(obj, schema, LinkedBuffer.allocate(1024));
    }

    public static <T> T deserilizer(byte[] bytes, Class<T> cls) {
        T obj = null;
        try {
            obj = cls.newInstance();
            Schema schema = RuntimeSchema.getSchema(cls);
            ProtobufIOUtil.mergeFrom(bytes, obj, schema);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}