package com.heydancer.swapi;

import com.heydancer.swapi.model.Film;
import com.heydancer.swapi.service.ApiService;

public class Swapi {
    public static void main(String[] args) {
        ApiService service = new ApiService();

        Film film = service.getById(1);
        System.out.println(film);
    }
}
