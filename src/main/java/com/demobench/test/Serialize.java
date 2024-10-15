package com.demobench.test;

import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Serialize<T> extends BaseBenchmark {

    private T object;

    @Setup
    public void setUp() throws IOException {
        super.setUpContexts();
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Benchmark
    public void benchmarkJacksonSerialization() throws IOException {
       gsonContext.serialize(object);
    }

    @Benchmark
    public void benchmarkGsonSerialization() throws IOException {
        gsonContext.serialize(object);
    }

    @Benchmark
    public void benchmarkJsonOrgSerialization() throws IOException {
        jsonOrgContext.serialize(object);
    }

    @Benchmark
    public void benchmarkMoshiSerialization() throws IOException {
        moshiContext.serialize(object);
    }

    @Benchmark
    public void benchmarkJsonBSerialization() throws IOException {
        jsonBContext.serialize(object);
    }
    @Benchmark
    public void benchmarkFastJsonSerialization() throws IOException {
        fastJsonContext.serialize(object);
    }

    @Benchmark
    public void benchmarkJsonIterSerialization() throws IOException {
        jsonIterContext.serialize(object);
    }

}
