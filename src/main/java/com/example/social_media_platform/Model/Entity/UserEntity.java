package com.example.social_media_platform.Model.Entity;

import lombok.Data;
import jakarta.persistence.*;

import java.util.Set;

@Data
@Entity
@Table(name = "user_entity")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;


    @OneToOne(mappedBy = "userEntity", cascade = CascadeType.ALL)
    private Profile profile;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
    private Set<Post> posts;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Comment> comments;

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
    private Set<FriendRequest> sentRequests;

    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL)
    private Set<FriendRequest> receivedRequests;


}