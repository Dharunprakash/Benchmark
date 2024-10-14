package com.demobench.Test;

import com.demobench.Data;
import com.demobench.benchmark.JacksonStrategy;
import com.demobench.benchmark.JsonBenchmarkContext;
import com.demobench.benchmark.JsonIterStrategy;
import com.demobench.benchmark.JsonLibraryStrategy;
import com.demobench.benchmark.JsonOrgStrategy;
import com.demobench.benchmark.JsonBStrategy;
import  com.demobench.benchmark.FastJsonStrategy;
import com.demobench.benchmark.GsonStrategy;
import com.demobench.benchmark.MoshiStrategy;


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
public class JsonArrayDeserialize  {

    private  String jsonArray = Data.ORDERS_JSON;

    private JsonBenchmarkContext jacksonContext;
    private JsonBenchmarkContext gsonContext;
    private JsonBenchmarkContext jsonOrgContext;
    private JsonBenchmarkContext moshiContext;
    private JsonBenchmarkContext jsonBContext;
    private JsonBenchmarkContext fastJsonContext;
    private JsonBenchmarkContext jsonIterContext;

    @Setup
    public void setUp() {
        jacksonContext = new JsonBenchmarkContext(new JacksonStrategy());
        gsonContext = new JsonBenchmarkContext(new GsonStrategy());
        jsonOrgContext = new JsonBenchmarkContext(new JsonOrgStrategy());
        moshiContext = new JsonBenchmarkContext(new MoshiStrategy());
        jsonBContext = new JsonBenchmarkContext(new JsonBStrategy());
        fastJsonContext = new JsonBenchmarkContext(new FastJsonStrategy());
        jsonIterContext = new JsonBenchmarkContext(new JsonIterStrategy());
    }

    @Benchmark
    public void jacksonBenchmark() throws IOException {
        jacksonContext.deserialize(jsonArray, Order[].class);
    }

    @Benchmark
    public void gsonBenchmark() throws IOException {
        gsonContext.deserialize(jsonArray, Order[].class);
    }

    @Benchmark
    public void moshiBenchmark() throws IOException {
        moshiContext.deserialize(jsonArray, Order[].class);
    }

    @Benchmark
    public void jsonOrgBenchmark() throws IOException {
        jsonOrgContext.deserialize(jsonArray, Order[].class);
    }

    @Benchmark
    public void jsonBBenchmark() throws IOException {
        jsonBContext.deserialize(jsonArray, Order[].class);
    }

    @Benchmark
    public void fastJsonBenchmark() throws IOException {
        fastJsonContext.deserialize(jsonArray, Order[].class);
    }

    @Benchmark
    public void jsonIterBenchmark() throws IOException {
        jsonIterContext.deserialize(jsonArray, Order[].class);
    }



    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(JsonArrayDeserialize.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }
}
