package com.studio.records.Dao;

import com.studio.records.data.Song;

import java.util.List;

public interface SongDao {

    List<Song> getSong();
    void createSong(Song song);
    void deleteSong(String title);
}