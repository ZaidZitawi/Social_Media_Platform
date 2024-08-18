package com.example.social_media_platform.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class MediaDto {
private Long mediaId;
private Long post;
private String mediaType;
private String mediaUrl;
}