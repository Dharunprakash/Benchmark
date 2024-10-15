package com.demobench.test.deserializer;

import com.demobench.jsondata.NameData;
import com.demobench.model.Name;
import com.demobench.test.JsonDeserialize;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class NameArrayDeserializer extends JsonDeserialize<Name[]> {

    @Override
    public void setUp(){
        super.setUp();
        setJson(NameData.createTestNames());
        setClazz(Name[].class);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(NameArrayDeserializer.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }
}
