package com.selcuk.utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;
import java.util.Objects;

public class RestUtils {
    public static Response applyPostWithStringPayload(String endPoint, String requestPayload, Map<String,String> headers){
        return RestAssured.given().log().all()
                .baseUri(endPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();
    }
    public static Response applyPostWithMapPayload(String endPoint, Map<String, Object> requestPayload, Map<String,String> headers){
        return RestAssured.given().log().all()
                .baseUri(endPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();
    }
}
