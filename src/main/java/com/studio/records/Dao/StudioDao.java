package com.studio.records.Dao;

import com.studio.records.data.Studio;

import java.util.List;

public interface StudioDao {

        List<Studio> getStudio();
        void createStudio(Studio studio);
        void deleteStudio(String name);
    }

