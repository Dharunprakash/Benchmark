package com.demobench;


import com.demobench.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import javax.swing.text.html.Option;
import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Main {

    public  String json ="""
        {
            "orderId": 12345,
            "orderDate": "2024-10-12",
            "customer": {
                "customerId": 67890,
                "name": {
                    "firstName": "John",
                    "lastName": "Doe"
                },
                "contact": {
                    "email": "john.doe@example.com",
                    "phone": "+1234567890"
                },
                "address": {
                    "street": "123 Elm Street",
                    "city": "Metropolis",
                    "state": "NY",
                    "zip": "10001",
                    "country": "USA"
                }
            },
            "items": [
                {
                    "productId": 987,
                    "name": "Laptop",
                    "quantity": 1,
                    "price": 1500,
                    "details": {
                        "brand": "TechBrand",
                        "specifications": {
                            "processor": "Intel Core i7",
                            "ram": "16GB",
                            "storage": "512GB SSD"
                        }
                    }
                },
                {
                    "productId": 654,
                    "name": "Wireless Mouse",
                    "quantity": 2,
                    "price": 30,
                    "details": {
                        "brand": "MouseBrand",
                        "specifications": {
                            "type": "Bluetooth",
                            "batteryLife": "12 months"
                        }
                    }
                }
            ],
            "totalAmount": 1560,
            "status": "Processing"
        }
        """;

    private ObjectMapper objectMapper;

    @Setup(Level.Trial)
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Benchmark
    public Order benchmarkJacksonDeserialization() throws Exception {
        return objectMapper.readValue(json, Order.class);
    }

    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(Main.class.getSimpleName())
                .warmupIterations(1).warmupTime(TimeValue.seconds(1))
                .measurementIterations(1).warmupTime(TimeValue.seconds(1))
                .forks(1)
                .build();

        new Runner(opt).run();
    }

}