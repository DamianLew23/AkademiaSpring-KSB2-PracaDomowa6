package pl.akademiaspring.ksb2pracadomowa6.service;

import org.springframework.stereotype.Service;
import pl.akademiaspring.ksb2pracadomowa6.model.Video;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {

    private List<Video> videoList = new ArrayList<>();


    @PostConstruct
    private void prepareVideList() {
        videoList.add(new Video("Skazani na Shawshank", 1994, "Frank Darabont"));
        videoList.add(new Video("Nietykalni", 2011, "Olivier Nakache / Éric Toledano"));
        videoList.add(new Video("Ojciec Chrzestny", 1972, "Francis Ford Coppola"));
        videoList.add(new Video("Joker", 2019, "Todd Phillips"));
        videoList.add(new Video("Pulp Fiction", 1994, "Quentin Tarantino"));
    }


    public List<Video> getAllVideoList() {
        return videoList;
    }


    public Boolean addVideoToList(Video video) {
        return videoList.add(video);
    }
}
