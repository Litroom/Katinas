package com.studio.records.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;


import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "Studio")
public class Studio {


    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    @Column(unique = true)
    private String name;
    private byte[] logo;
    private String category;
    private String size;
    @ManyToOne(cascade=CascadeType.PERSIST)
    private SecurityProperties.User user;

   @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
   private Set<Artist> events;
}