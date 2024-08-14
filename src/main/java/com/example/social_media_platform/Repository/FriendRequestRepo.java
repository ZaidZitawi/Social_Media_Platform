package com.example.social_media_platform.Repository;

import com.example.social_media_platform.Model.Entity.FriendRequest;
import com.example.social_media_platform.Model.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRequestRepo extends JpaRepository<FriendRequest, Long> {
}
