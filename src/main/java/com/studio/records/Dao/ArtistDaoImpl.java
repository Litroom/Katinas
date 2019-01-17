package com.studio.records.Dao;

import com.studio.records.data.Artist;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArtistDaoImpl implements ArtistDao{

    private final List<Artist> artists = new CopyOnWriteArrayList<>();
    @Override
    public List<Artist> getArtist() {
        return Collections.unmodifiableList(artists);
    }

    @Override
    public void createArtist(Artist artist) {
        artists.add(artist);
    }

    @Override
    public void deleteArtist(String name) {
        for (Artist art: artists) {
            if (art.getId().equals(art.getId())) {
                artists.remove(art);
                break;
            }
        }
    }
}
