package com.hero.controller;

import com.hero.pojo.Users;
import com.hero.util.QiNiuUpLoad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * 商品添加控制层123
 */
@Controller
public class AddProductController {

    @RequestMapping("/add")
    public String add(){
        return "/addproduct";
    }

    @RequestMapping("/addProduct")
    public String upload( MultipartFile[] files, Model model) throws IllegalStateException, IOException {

        
        //允许的类型
        List<String> types= Arrays.asList("image/jpeg","image/png","image/gif");

        List<Map<String,String>> imgList=new ArrayList<>() ;
        for (MultipartFile f : files) {
            if(!f.isEmpty()) {
                String type=f.getContentType();
                String filename= UUID.randomUUID().toString()+f.getOriginalFilename();
                System.out.println(type+"\t"+filename);
                //判断是否是允许的类型
                if(types.contains(type)) {
                    /*File df=new File(path+ File.separator+filename);
                    f.transferTo(df);*/
                   boolean flag= QiNiuUpLoad.upload(f.getBytes(),filename);
                    System.out.println("flag = " + flag);
                    Map<String,String> maps=new HashMap<String,String>();
                   /* maps.put("img1","http://startym.cn.qiniudns.com/"+filename);*/
                    maps.put("img1","http://prn2nr1qf.bkt.clouddn.com/"+filename);
                    imgList.add(maps);
                    //model.addAttribute("imgpath",filename);
                }
            }
            model.addAttribute("imgList",imgList);
        }

        return "/addInfo";
    }


}
