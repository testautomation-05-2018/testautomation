package com.jsystems.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.Serializable;

public class Specyficator {

    public static RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setBaseUri("http://www.mocky.io")
            .setBasePath("/v2")
            .build();


    public static RequestSpecification requestSpecificationFaker = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setBaseUri("http://fakerestapi.azurewebsites.net")
            .build();
}