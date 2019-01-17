package com.studio.records.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    Studio findByTitle(String title);
}