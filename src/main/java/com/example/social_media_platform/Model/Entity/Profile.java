package com.example.social_media_platform.Model.Entity;


import lombok.Data;
import jakarta.persistence.*;
import java.sql.Timestamp;


@Data
@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;


    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userEntity;

    //FOREIGN KEY//

    @Column(name = "bio", length = 255)
    private String bio;


    @Column(name = "profile_picture_url", length = 255)
    private String profilePictureUrl;

    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(name = "misc", columnDefinition = "json")
    private String misc;


    @Column(name = "last_updated")
    private Timestamp lastUpdated;


}