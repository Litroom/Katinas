package com.studio.records.controller;
import com.studio.records.Dao.ArtistDao;
import com.studio.records.data.Artist;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/artist")
public class ArtistController {
    private final ArtistDao artistDao;

    @Autowired
    public ArtistController(ArtistDao artistDao) {
        this.artistDao = artistDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Artist> getArtist() {
        return artistDao.getArtist();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create artist", notes = "Creates artist")
    public void createArtist(@ApiParam(value = "Artist Data", required = true)
                             @RequestBody ArtistDao artistDao) {

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public List<Artist> toDeleteArtist() {
        for (Artist art : toDeleteArtist()) {
            if (art.getId().equals(art.getId())) {
                toDeleteArtist().remove(art);
                break;
            }

        }return toDeleteArtist();
    }

    @RequestMapping(method= RequestMethod.PUT)
    public List<Artist> putArtist(@PathVariable(value="/api/artist") String artist, @RequestBody Artist state, Model model) {
        return artistDao.getArtist();
    }
}