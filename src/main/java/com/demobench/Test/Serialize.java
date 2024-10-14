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
import java.util.Objects;
import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Serialize extends Base {

    Object object;

    @Setup
    public void setUp(Object object) throws IOException {
        this.object = object;
    }

    @Benchmark
    public void benchmarkJacksonSerialization() throws IOException {
        getJacksonContext().serialize(object);
    }

    @Benchmark
    public void benchmarkGsonSerialization() throws IOException {
      getGsonContext().serialize(object);
    }

    @Benchmark
    public void benchmarkJsonOrgSerialization() throws IOException {
        getJsonOrgContext().serialize(object);
    }

    @Benchmark
    public void benchmarkMoshiSerialization() throws IOException {
     getMoshiContext().serialize(object);
    }

    @Benchmark
    public void benchmarkJsonBSerialization() throws IOException {
        getJsonBContext().serialize(object);
    }

    @Benchmark
    public void benchmarkFastJsonSerialization() throws IOException {
        getFastJsonContext().serialize(object);
    }

    @Benchmark
    public void benchmarkJsonIterSerialization() throws IOException {
     getJsonIterContext().serialize(object);
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
