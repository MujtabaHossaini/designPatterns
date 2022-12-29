package com.patterns.creational.prototype.serialization;

import com.patterns.creational.prototype.serialization.model.Foo;
import org.apache.commons.lang3.SerializationUtils;

public class Demo {

    public static void main(String[] args) {

        Foo foo = new Foo(123, "life");

        /**
         * roundtrip() -> serialize and deserialize an object
         *                which creates a brand new object
         */
        Foo foo2 = SerializationUtils.roundtrip(foo);
        foo2.setWhatever("test");

        System.out.println(foo);
        System.out.println(foo2);

    }

}
