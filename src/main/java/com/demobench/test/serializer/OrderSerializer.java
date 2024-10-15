package com.demobench.test.serializer;
import com.demobench.data.OrderData;
import com.demobench.model.Order;
import com.demobench.test.Serialize;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.io.IOException;

public class OrderSerializer extends Serialize<Order> {

    @Override
    public void setUp() throws IOException {
        super.setUp();
        Order order = OrderData.createTestOrder1();
        setObject(order);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(OrderSerializer.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }
}
