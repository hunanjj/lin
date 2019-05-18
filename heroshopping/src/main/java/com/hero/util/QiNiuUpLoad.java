package com.hero.util;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

import java.io.IOException;

public class QiNiuUpLoad {

	public static String ACCESS_KEY = "g_yIoHvhjvcQ5t0O_xuSuxtLSWSpmzokhBbwgDXh";
	public static String SECRET_KEY = "Jg983nnF7bxyfBDJztlj03kKmb-ubtV0o6m5EU5m";
 
	//要上传的空间
	private static String bucketname = "image";
 
	//密钥配置
	private static Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
	//创建上传对象
	private static Configuration cfg = new Configuration(Zone.zone0());
	private static UploadManager uploadManager = new UploadManager(cfg);
 
	//简单上传，使用默认策略，只需要设置上传的空间名就可以了
	public  static String getUpToken(){
		return auth.uploadToken(bucketname);
	}
 
	public static boolean upload(byte[] file,String key) throws IOException {
		try {
			//调用put方法上传
			Response res = uploadManager.put(file, key, getUpToken());
			//打印返回的信息
			if (res.statusCode == 200){
				return true;
			}else{
				return false;
			}
		} catch (QiniuException e) {
			Response r = e.response;
			return false;
		}


	}
}
