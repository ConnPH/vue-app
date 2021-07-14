package vip.ph.mongo.service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;

public class InitVideo {

    /**
     * 创建客户端连接
     * @param accessKey 阿里云key
     * @param accessKeySecret 阿里云密钥
     * @return
     */
    public static DefaultAcsClient initObject(String accessKey,String accessKeySecret){
        // 客户端
        DefaultAcsClient client = null;
        try {
            // 地区Id
            String regionId = "cn-shanghai";
            DefaultProfile profile = DefaultProfile.getProfile(regionId,accessKey,accessKeySecret);
            client = new DefaultAcsClient(profile);

        }catch (Exception e){
           e.printStackTrace();
        }

        return client;
    }
}
