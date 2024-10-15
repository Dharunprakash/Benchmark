package com.demobench.test.deserializer;

import com.demobench.jsondata.CustomerData;
import com.demobench.model.Customer;
import com.demobench.test.JsonDeserialize;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class CustomerArrayDeserializer extends JsonDeserialize<Customer[]> {

    @Override
    public void setUp() {
        setJson(CustomerData.createTestCustomers());
        setClazz(Customer[].class);
        super.setUp();
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(CustomerArrayDeserializer.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }
}