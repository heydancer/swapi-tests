package com.heydancer.swapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.heydancer.swapi.config.PropertiesManager;
import com.heydancer.swapi.model.Film;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class ApiService {
    private final PropertiesManager properties = PropertiesManager.getProperties();
    private final ObjectMapper mapper = new ObjectMapper();

    String url = properties.getValue("base.url");

    public Film getById(final int id) {
        return given()
                .header("Content-Type", ContentType.JSON)
                .baseUri(url)
                .when()
                .get(String.format("films/%d", id))
                .getBody().as(Film.class);
    }
}