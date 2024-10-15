package com.demobench.test;

import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class JsonDeserialize<T>  extends BaseBenchmark {

    private String json ;
    private Class<T> clazz;

    @Setup
    public void setUp() {
        super.setUpContexts();
    }

    public  void setJson(String json) {
        this.json = json;
    }

    public  void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }
    @Benchmark
    public void jacksonBenchmark() throws IOException {
        jacksonContext.deserialize(json, clazz);
    }

    @Benchmark
    public void gsonBenchmark() throws IOException {
        gsonContext.deserialize(json, clazz);
    }

    @Benchmark
    public void moshiBenchmark() throws IOException {
        moshiContext.deserialize(json, clazz);
    }

    @Benchmark
    public void jsonOrgBenchmark() throws IOException {
        jsonOrgContext.deserialize(json, clazz);
    }

    @Benchmark
    public void jsonBBenchmark() throws IOException {
        jsonBContext.deserialize(json, clazz);
    }

    @Benchmark
    public void fastJsonBenchmark() throws IOException {
        fastJsonContext.deserialize(json, clazz);
    }

    @Benchmark
    public void jsonIterBenchmark() throws IOException {
        jsonIterContext.deserialize(json, clazz);
    }

}