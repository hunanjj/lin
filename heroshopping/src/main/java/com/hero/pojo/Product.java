package com.hero.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer pid;

    private String pname;

    private String description;

    private Integer price;

    private Integer classify1;

    private Integer classify2;

    private Integer flag;

    private Integer phid;

}