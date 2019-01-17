package com.studio.records.Dao;

import com.studio.records.data.Artist;

import java.util.List;

public interface ArtistDao {

    List<Artist> getArtist();
    void createArtist(Artist artist);
    void deleteArtist(String id);
}