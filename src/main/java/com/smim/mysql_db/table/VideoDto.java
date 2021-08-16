package com.smim.mysql_db.table;

import lombok.Getter;

@Getter
public class VideoDto {
    private Long video_num;
    private String video_name;
    private String video_image;
    private String video_url;
}