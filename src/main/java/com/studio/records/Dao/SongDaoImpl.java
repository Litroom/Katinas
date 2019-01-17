package com.studio.records.Dao;

import com.studio.records.data.Song;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SongDaoImpl implements SongDao{

    private final List<Song> songs = new CopyOnWriteArrayList<>();
    @Override
    public List<Song> getSong() {
        return Collections.unmodifiableList(songs);
    }

    @Override
    public void createSong(Song song) {
        songs.add(song);
    }

    @Override
    public void deleteSong(String title) {
        for (Song sng: songs) {
            if (sng.getTitle().equals(sng.getTitle())) {
                songs.remove(sng);
                break;
            }
        }
    }
}