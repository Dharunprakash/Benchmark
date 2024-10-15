package com.demobench.test.serializer;

import com.demobench.data.CustomerData;
import com.demobench.model.Customer;
import com.demobench.test.Serialize;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import javax.imageio.IIOException;
import java.io.IOException;

public class CustomerArraySerializer extends Serialize<Customer[]> {

    @Override
    public void setUp() throws IOException {
       super.setUp();
         setObject(CustomerData.createTestCustomers());
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(CustomerArraySerializer.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }
}