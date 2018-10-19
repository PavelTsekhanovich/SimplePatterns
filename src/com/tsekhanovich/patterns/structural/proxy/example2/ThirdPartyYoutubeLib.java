package com.tsekhanovich.patterns.structural.proxy.example2;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}