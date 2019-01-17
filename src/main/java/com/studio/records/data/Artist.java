package com.studio.records.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Artist")
public class Artist {

        @Id
        @Column(unique=true)
        private String id;
        private String RealName;
        private String realSurname;
        private String genre;
        private String Country;
        private LocalDate dateOfBirth;
        private byte[] photo;
    }

