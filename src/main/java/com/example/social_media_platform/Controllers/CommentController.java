package com.example.social_media_platform.Controllers;


import com.example.social_media_platform.Model.Dto.CommentDto;
import com.example.social_media_platform.Services.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentServices commentServices;

    @PostMapping("/AddComm")
    public ResponseEntity<CommentDto> addComment(@RequestBody CommentDto commentDto) {
        CommentDto createdComment = commentServices.addComment(commentDto);
        return new ResponseEntity<>(createdComment, HttpStatus.CREATED);
    }



}
