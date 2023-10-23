package com.heydancer.swapi.base;

import com.heydancer.swapi.service.ApiService;
import org.junit.jupiter.api.BeforeEach;

public class BaseTests {
    protected ApiService service;

    @BeforeEach
    public void initApiService() {
        service = new ApiService();
    }
}
