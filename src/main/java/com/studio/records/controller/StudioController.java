package com.studio.records.controller;
import com.studio.records.Dao.StudioDao;
import com.studio.records.data.Studio;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/studio")
public class StudioController {
    private final StudioDao studioDao;

    @Autowired
    public StudioController(StudioDao studioDao) {
        this.studioDao = studioDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Studio> getStudio() {
        return studioDao.getStudio();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create studio", notes = "Creates studio")
    public void createStudio(@ApiParam(value = "Studio Data", required = true)
                             @RequestBody StudioDao studioDao) {

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public List<Studio> toDeleteStudio() {
        for (Studio stud : toDeleteStudio()) {
            if (stud.getName().equals(stud.getName())) {
                toDeleteStudio().remove(stud);
                break;
            }

        }return toDeleteStudio();
    }

    @RequestMapping(method= RequestMethod.PUT)
    public List<Studio> putStudio(@PathVariable(value="/api/studio") String studio, @RequestBody Studio state, Model model) {
       return studioDao.getStudio();
    }
}


