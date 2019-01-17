package com.studio.records.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudioRepository extends JpaRepository<Studio, Long> {
    Studio findByName(String name);
}
