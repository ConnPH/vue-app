package vip.ph.mongo.controller;




import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import vip.ph.mongo.service.OssUploadService;

import javax.annotation.Resource;

@RestController
@RequestMapping("oss")
public class OssController {


    @Resource
    OssUploadService ossUploadService;

    @PostMapping(value = "/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        return ossUploadService.uploadFile(file);
    }
}
