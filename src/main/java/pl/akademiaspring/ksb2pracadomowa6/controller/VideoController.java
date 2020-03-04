package pl.akademiaspring.ksb2pracadomowa6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.akademiaspring.ksb2pracadomowa6.model.Email;
import pl.akademiaspring.ksb2pracadomowa6.model.Video;
import pl.akademiaspring.ksb2pracadomowa6.service.VideoService;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    private VideoService videoService;

    @Autowired
    VideoController(
            VideoService videoService
    ) {
        this.videoService = videoService;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Video>> getAllVideos() {
        List<Video> videoList = videoService.getAllVideoList();
        return new ResponseEntity<>(videoList, HttpStatus.OK);
    }


    @PostMapping
    @Email
    public ResponseEntity createVideo(@RequestBody Video video) {
        Boolean isCreated = videoService.addVideoToList(video);
        if (isCreated)
            return new ResponseEntity<>(HttpStatus.CREATED);
        else
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
    }
}
