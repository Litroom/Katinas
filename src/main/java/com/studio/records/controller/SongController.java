package com.studio.records.controller;
import com.studio.records.Dao.SongDao;
import com.studio.records.data.Song;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/song")
public class SongController {
    private final SongDao songDao;

    @Autowired
    public SongController(SongDao songDao) {
        this.songDao = songDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Song> getSong() {
        return songDao.getSong();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create song", notes = "Creates song")
    public void createSong(@ApiParam(value = "Song Data", required = true)
                             @RequestBody SongDao songDao) {

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public List<Song> toDeleteSongs() {
        for (Song sng : toDeleteSongs()) {
            if (sng.getTitle().equals(sng.getTitle())) {
                toDeleteSongs().remove(sng);
                break;
            }

        }return toDeleteSongs();
    }

    @RequestMapping(method= RequestMethod.PUT)
    public List<Song> putSong(@PathVariable(value="/api/song") String song, @RequestBody Song state, Model model) {
        return songDao.getSong();
    }
}