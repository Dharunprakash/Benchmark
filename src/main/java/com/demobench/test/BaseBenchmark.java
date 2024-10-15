package com.demobench.test;


import com.demobench.benchmark.*;

public abstract class BaseBenchmark {

    protected JsonBenchmarkContext jacksonContext;
    protected JsonBenchmarkContext gsonContext;
    protected JsonBenchmarkContext jsonOrgContext;
    protected JsonBenchmarkContext moshiContext;
    protected JsonBenchmarkContext jsonBContext;
    protected JsonBenchmarkContext fastJsonContext;
    protected JsonBenchmarkContext jsonIterContext;

    // Setup benchmark contexts for different serialization strategies
    public void setUpContexts() {
        jacksonContext = new JsonBenchmarkContext(new JacksonStrategy());
        gsonContext = new JsonBenchmarkContext(new GsonStrategy());
        jsonOrgContext = new JsonBenchmarkContext(new JsonOrgStrategy());
        moshiContext = new JsonBenchmarkContext(new MoshiStrategy());
        jsonBContext = new JsonBenchmarkContext(new JsonBStrategy());
        fastJsonContext = new JsonBenchmarkContext(new FastJsonStrategy());
        jsonIterContext = new JsonBenchmarkContext(new JsonIterStrategy());
    }
}
