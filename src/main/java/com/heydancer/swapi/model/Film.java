package com.heydancer.swapi.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Film {
    @JsonProperty("episode_id")
    private int episodeId;

    private String title;

    @JsonProperty("opening_crawl")
    private String openingCrawl;

    private String director;
    private String producer;
    public String url;

    @JsonProperty("release_date")
    private LocalDate releaseDate;

    public LocalDateTime created;
    public LocalDateTime edited;
    public List<String> planets;
    public List<String> characters;
    public List<String> species;
    public List<String> starships;
    public List<String> vehicles;
}