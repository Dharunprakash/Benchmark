package com.demobench.Test;

import com.demobench.benchmark.*;
import com.demobench.model.*;
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
public class Serialize {

    private JsonBenchmarkContext jacksonContext;
    private JsonBenchmarkContext gsonContext;
    private JsonBenchmarkContext jsonOrgContext;
    private JsonBenchmarkContext moshiContext;
    private JsonBenchmarkContext jsonBContext;
    private JsonBenchmarkContext fastJsonContext;
    private JsonBenchmarkContext jsonIterContext;
    private  Order order;

    @Setup
    public void setUp() throws IOException {
        Name name = new Name("John", "Doe");
        Address address = new Address("123 Main St", "Springfield", "IL", "62701", "USA");
        Contact contact = new Contact("john@gmail.com", "217-555-1234");
        Customer customer = new Customer(1, name, contact, address);

        Specifications specs = new Specifications();
        specs.setProcessor("Intel Core i7");
        specs.setRam("16GB");
        specs.setStorage("512GB SSD");

        Item item1 = new Item();
        item1.setProductId(1);
        item1.setName("Laptop");
        item1.setQuantity(1);
        item1.setPrice(1500);
        item1.setDetails(new Details("TechBrand", specs));

        order = new Order(1, "2024-10-12", customer);
        order.addItem(item1);
        order.calculateTotalAmount();
        order.setStatus("Processing");

        // Initialize benchmark contexts for different strategies
        jacksonContext = new JsonBenchmarkContext(new JacksonStrategy());
        gsonContext = new JsonBenchmarkContext(new GsonStrategy());
        jsonOrgContext = new JsonBenchmarkContext(new JsonOrgStrategy());
        moshiContext = new JsonBenchmarkContext(new MoshiStrategy());
        jsonBContext = new JsonBenchmarkContext(new JsonBStrategy());
        fastJsonContext = new JsonBenchmarkContext(new FastJsonStrategy());
        jsonIterContext = new JsonBenchmarkContext(new JsonIterStrategy());
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

    public  static  void main(String[] args) throws IOException, RunnerException {

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
