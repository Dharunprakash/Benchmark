package com.demobench.test.serializer;

import com.demobench.data.OrderData;
import com.demobench.model.Order;
import com.demobench.test.Serialize;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.TimeValue;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.Runner;


import java.io.IOException;

public class OrderArraySerializer extends Serialize<Order[]> {

    @Override
    public void setUp() throws IOException {
        super.setUp();
        setObject(OrderData.createTestOrders());
    }
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(OrderArraySerializer.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }
}
