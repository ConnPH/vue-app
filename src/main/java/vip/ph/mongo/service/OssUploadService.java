package vip.ph.mongo.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssUploadService {
    String uploadFile(MultipartFile file);
}
