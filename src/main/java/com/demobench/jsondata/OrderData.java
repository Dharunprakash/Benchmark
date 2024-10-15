package com.demobench.jsondata;

public class OrderData {
    public static final String jsonArray = """
        [
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
            },
            {
                "orderId": 12346,
                "orderDate": "2024-10-11",
                "customer": {
                    "customerId": 67891,
                    "name": {
                        "firstName": "Jane",
                        "lastName": "Smith"
                    },
                    "contact": {
                        "email": "jane.smith@example.com",
                        "phone": "+1234567891"
                    },
                    "address": {
                        "street": "456 Maple Avenue",
                        "city": "Gotham",
                        "state": "NJ",
                        "zip": "07001",
                        "country": "USA"
                    }
                },
                "items": [
                    {
                        "productId": 123,
                        "name": "Smartphone",
                        "quantity": 1,
                        "price": 800,
                        "details": {
                            "brand": "PhoneBrand",
                            "specifications": {
                                "screenSize": "6.1 inches",
                                "storage": "128GB"
                            }
                        }
                    },
                    {
                        "productId": 789,
                        "name": "Phone Case",
                        "quantity": 1,
                        "price": 25,
                        "details": {
                            "brand": "CaseBrand"
                        }
                    }
                ],
                "totalAmount": 825,
                "status": "Shipped"
            },
            {
                "orderId": 12347,
                "orderDate": "2024-10-10",
                "customer": {
                    "customerId": 67892,
                    "name": {
                        "firstName": "Alice",
                        "lastName": "Johnson"
                    },
                    "contact": {
                        "email": "alice.johnson@example.com",
                        "phone": "+1234567892"
                    },
                    "address": {
                        "street": "789 Pine Street",
                        "city": "Star City",
                        "state": "CA",
                        "zip": "90210",
                        "country": "USA"
                    }
                },
                "items": [
                    {
                        "productId": 321,
                        "name": "Tablet",
                        "quantity": 1,
                        "price": 600,
                        "details": {
                            "brand": "TabBrand",
                            "specifications": {
                                "screenSize": "10 inches",
                                "storage": "256GB"
                            }
                        }
                    },
                    {
                        "productId": 111,
                        "name": "Tablet Cover",
                        "quantity": 1,
                        "price": 40,
                        "details": {
                            "brand": "CoverBrand"
                        }
                    }
                ],
                "totalAmount": 640,
                "status": "Delivered"
            },
            {
                "orderId": 12348,
                "orderDate": "2024-10-09",
                "customer": {
                    "customerId": 67893,
                    "name": {
                        "firstName": "Bob",
                        "lastName": "Miller"
                    },
                    "contact": {
                        "email": "bob.miller@example.com",
                        "phone": "+1234567893"
                    },
                    "address": {
                        "street": "321 Oak Road",
                        "city": "Central City",
                        "state": "TX",
                        "zip": "73301",
                        "country": "USA"
                    }
                },
                "items": [
                    {
                        "productId": 555,
                        "name": "Smartwatch",
                        "quantity": 1,
                        "price": 250,
                        "details": {
                            "brand": "WatchBrand",
                            "specifications": {
                                "batteryLife": "2 days"
                            }
                        }
                    },
                    {
                        "productId": 666,
                        "name": "Wireless Charger",
                        "quantity": 1,
                        "price": 50,
                        "details": {
                            "brand": "ChargerBrand"
                        }
                    }
                ],
                "totalAmount": 300,
                "status": "Processing"
            },
            {
                "orderId": 12349,
                "orderDate": "2024-10-08",
                "customer": {
                    "customerId": 67894,
                    "name": {
                        "firstName": "Charlie",
                        "lastName": "Davis"
                    },
                    "contact": {
                        "email": "charlie.davis@example.com",
                        "phone": "+1234567894"
                    },
                    "address": {
                        "street": "987 Birch Lane",
                        "city": "Coast City",
                        "state": "FL",
                        "zip": "33001",
                        "country": "USA"
                    }
                },
                "items": [
                    {
                        "productId": 888,
                        "name": "Gaming Console",
                        "quantity": 1,
                        "price": 400,
                        "details": {
                            "brand": "GameBrand",
                            "specifications": {
                                "storage": "1TB"
                            }
                        }
                    },
                    {
                        "productId": 777,
                        "name": "Extra Controller",
                        "quantity": 1,
                        "price": 60,
                        "details": {
                            "brand": "GameBrand"
                        }
                    }
                ],
                "totalAmount": 460,
                "status": "Delivered"
            }
        ]
        """;

    public static final String json= """
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

}
