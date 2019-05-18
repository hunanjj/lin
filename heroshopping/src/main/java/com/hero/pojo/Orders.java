package com.hero.pojo;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    private Integer oid;

    private Integer ouid;

    private Integer oaid;

    private Date ocreatetime;

    private Integer totalprice;

    private Integer ostate;

    private String serianumber;

}