package com.Practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "Games")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    private ObjectId id;
    private String steamId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> developers;
    private List<String> publishers;
    private String poster;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviews;

    public Game(String steamId, String title, String releaseDate, String trailerLink, List<String> developers, List<String> publishers, String poster, List<String> backdrops) {
        this.steamId = steamId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.developers = developers;
        this.publishers = publishers;
        this.poster = poster;
        this.backdrops = backdrops;
    }
}


