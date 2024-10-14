package com.demobench.Test;

import com.demobench.benchmark.*;
import com.demobench.data.TestData;
import com.demobench.model.Order;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Serialize extends BaseBenchmark {

    private Order order;

    @Setup
    public void setUp() throws IOException {
        // Initialize the contexts from the base class
        super.setUpContexts();

        // Create test data using the TestData class
        order = TestData.createTestOrder();
    }

    @Benchmark
    public void benchmarkJacksonSerialization() throws IOException {
        jacksonContext.serialize(order);
    }

    @Benchmark
    public void benchmarkGsonSerialization() throws IOException {
        gsonContext.serialize(order);
    }

    @Benchmark
    public void benchmarkJsonOrgSerialization() throws IOException {
        jsonOrgContext.serialize(order);
    }

    @Benchmark
    public void benchmarkMoshiSerialization() throws IOException {
        moshiContext.serialize(order);
    }

    @Benchmark
    public void benchmarkJsonBSerialization() throws IOException {
        jsonBContext.serialize(order);
    }

    @Benchmark
    public void benchmarkFastJsonSerialization() throws IOException {
        fastJsonContext.serialize(order);
    }

    @Benchmark
    public void benchmarkJsonIterSerialization() throws IOException {
        jsonIterContext.serialize(order);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(Serialize.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();
        new Runner(opt).run();
    }
}
