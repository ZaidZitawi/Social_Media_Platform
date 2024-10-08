package com.example.social_media_platform.Service;



import com.example.social_media_platform.Repo.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileSecurityService {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private ProfileRepository profileRepository;

    public boolean isProfileOwner(Long userId) {
        Long currentUserId = customUserDetailsService.getCurrentUserId();
        return currentUserId.equals(userId);
    }
}
