package com.demobench.test.serializer;

import com.demobench.data.NameData;
import com.demobench.model.Name;
import com.demobench.test.Serialize;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.io.IOException;
import java.util.List;

public class NameArraySerializer extends Serialize<List<Name>> {

    @Override
    public void setUp() throws IOException {
        super.setUp();
        setObject(NameData.createTestNames());
    }
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(NameArraySerializer.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }

}
