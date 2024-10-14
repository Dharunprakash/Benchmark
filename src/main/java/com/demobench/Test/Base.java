package com.demobench.Test;

import com.demobench.benchmark.*;
import com.demobench.model.Order;
import lombok.Data;

@Data
public class Base {

    private JsonBenchmarkContext jacksonContext;
    private JsonBenchmarkContext gsonContext;
    private JsonBenchmarkContext jsonOrgContext;
    private JsonBenchmarkContext moshiContext;
    private JsonBenchmarkContext jsonBContext;
    private JsonBenchmarkContext fastJsonContext;
    private JsonBenchmarkContext jsonIterContext;

    public void initializeContexts() {        // Initialize benchmark contexts for different strategies
        jacksonContext = new JsonBenchmarkContext(new JacksonStrategy());
        gsonContext = new JsonBenchmarkContext(new GsonStrategy());
        jsonOrgContext = new JsonBenchmarkContext(new JsonOrgStrategy());
        moshiContext = new JsonBenchmarkContext(new MoshiStrategy());
        jsonBContext = new JsonBenchmarkContext(new JsonBStrategy());
        fastJsonContext = new JsonBenchmarkContext(new FastJsonStrategy());
        jsonIterContext = new JsonBenchmarkContext(new JsonIterStrategy());}
    }


}
