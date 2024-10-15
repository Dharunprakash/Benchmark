package com.demobench.test.deserializer;
import com.demobench.Data;
import com.demobench.jsondata.OrderData;
import com.demobench.test.JsonDeserialize;
import com.demobench.model.Order;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class OrderDeserializer extends JsonDeserialize<Order> {

    @Override
    public void setUp() {
        setJson(OrderData.json);
        setClazz(Order.class);
        super.setUp();
    }


    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(OrderDeserializer.class.getName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }
}
