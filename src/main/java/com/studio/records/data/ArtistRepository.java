package com.studio.records.data;

import org.springframework.data.jpa.repository.JpaRepository;

    public interface ArtistRepository extends JpaRepository<Artist, Long> {
        Studio findById(String id);
}
