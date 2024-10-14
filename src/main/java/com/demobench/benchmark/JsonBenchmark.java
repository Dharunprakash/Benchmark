package com.demobench.benchmark;

import com.demobench.Data;

import com.demobench.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper; // Assuming you are using Jackson
import com.google.gson.Gson; // Assuming you are using Gson
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
public class JsonBenchmark {

    private static final String jsonNested = Data.jsonNested;
    private String jsonArray = Data.ORDERS_JSON;


    private JsonBenchmarkContext jacksonContext;
    private JsonBenchmarkContext gsonContext;
    private JsonBenchmarkContext jsonOrgContext;
    private JsonBenchmarkContext moshiContext;
    private JsonBenchmarkContext jsonBContext;
    private JsonBenchmarkContext fastJsonContext;
    private JsonBenchmarkContext jsonIterContext;

    Order[] orders;
    Order order;


    @Setup
    public void setUp() throws IOException {
        jacksonContext = new JsonBenchmarkContext(new JacksonStrategy());
        gsonContext = new JsonBenchmarkContext(new GsonStrategy());
        jsonOrgContext = new JsonBenchmarkContext(new JsonOrgStrategy());
        moshiContext = new JsonBenchmarkContext(new MoshiStrategy());
        jsonBContext = new JsonBenchmarkContext(new JsonBStrategy());
        fastJsonContext = new JsonBenchmarkContext(new FastJsonStrategy());
        jsonIterContext = new JsonBenchmarkContext(new JsonIterStrategy());


        orders = jacksonContext.deserialize(jsonArray, Order[].class);
        order = jacksonContext.deserialize(jsonNested, Order.class);
    }

    @Benchmark
    public void jacksonBenchmark() throws IOException {
        jacksonContext.serialize(orders);
    }

    @Benchmark
    public void gsonBenchmark() throws IOException {
        gsonContext.serialize(orders);
    }


    @Benchmark
    public void moshiBenchmark() throws IOException {
        moshiContext.serialize(orders);
    }

    @Benchmark
    public void jsonBBenchmark() throws IOException {
        jsonBContext.serialize(orders);
    }

    @Benchmark
    public void fastJsonBenchmark() throws IOException {
        fastJsonContext.serialize(orders);
    }

    @Benchmark
    public void jsonIterBenchmark() throws IOException {
        jsonIterContext.serialize(orders);
    }



    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(JsonBenchmark.class.getSimpleName()).
                forks(1).
                warmupIterations(1)
                .warmupTime(TimeValue.seconds(1))
                .measurementIterations(1)
                .measurementTime(TimeValue.seconds(1))
                .build();

        new Runner(opt).run();
    }
}
