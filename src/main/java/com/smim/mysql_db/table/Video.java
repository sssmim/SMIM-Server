package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Video {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long video_num;

    @Column(nullable = false)
    private String video_name;

    @Column(nullable = false)
    private String video_image;

    @Column(nullable = true)
    private String video_url;

    public Video(VideoDto videoDto) {
        this.video_name = videoDto.getVideo_name();
        this.video_image = videoDto.getVideo_image();
        this.video_url = videoDto.getVideo_url();
    }
}