package com.studio.records.Dao;

import com.studio.records.data.Studio;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudioDaoImpl implements StudioDao{

    private final List<Studio> studios = new CopyOnWriteArrayList<>();
    @Override
    public List<Studio> getStudio() {
        return Collections.unmodifiableList(studios);
    }

    @Override
    public void createStudio(Studio studio) {
        studios.add(studio);
    }

    @Override
    public void deleteStudio(String name) {
        for (Studio stud: studios) {
            if (stud.getName().equals(stud.getName())) {
                studios.remove(stud);
                break;
            }
        }
    }
}
