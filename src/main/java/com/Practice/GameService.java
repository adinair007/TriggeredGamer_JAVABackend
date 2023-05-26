package com.Practice;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<Game> allGames() {
        return repository.findAll();
    }
    public Optional<Game> findGameBySteamId(String steamId) {
        return repository.findGameBySteamId(steamId);
    }
}
