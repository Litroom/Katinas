package com.studio.records.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Song")
public class Song {

        @Id
        @GeneratedValue
        private Long id;
        private String title;
        private String album;
        private int duration;
        private byte[] mp3;

        @ManyToMany
        private Set<Artist> artists;
}
