package com.hero.pojo;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private Integer comid;

    private Integer compid;

    private String comname;

    private String comcontent;

    private Date comcreatetime;
 }