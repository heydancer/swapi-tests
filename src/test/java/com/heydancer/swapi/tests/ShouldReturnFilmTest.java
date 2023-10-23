package com.heydancer.swapi.tests;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.heydancer.swapi.base.BaseTests;
import com.heydancer.swapi.model.Film;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ShouldReturnFilmTest extends BaseTests {

    @Tag(value = "checkFilmWithId1")
    @Test
    @Description("check that film not null")
    public void shouldReturnFilmById() {
        Film film = service.getById(1);
        Assertions.assertNotNull(film);
    }

    @Tag(value = "checkFilmWithIncorrectId")
    @Test
    @Description("check that film not null")
    public void shouldCheckFilmByIncorrectId() {
        final UnrecognizedPropertyException exception = Assertions.assertThrows(
                UnrecognizedPropertyException.class, () -> service.getById(-9999));
    }


}
