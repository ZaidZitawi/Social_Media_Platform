package com.example.social_media_platform.Services;

import com.example.social_media_platform.Model.Dto.CommentDto;
import com.example.social_media_platform.Model.Entity.Comment;
import com.example.social_media_platform.Model.Mapper.CommentMapper;
import com.example.social_media_platform.Repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServices {
    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private CommentMapper commentMapper;

    public CommentDto addComment(CommentDto commentDto) {
        Comment comment = commentMapper.toEntity(commentDto);
        Comment savedComment = commentRepo.save(comment);
        return commentMapper.toDto(savedComment);
    }



}
