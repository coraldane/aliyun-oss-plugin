package com.fit2cloud.jenkins.testcase;

import com.aliyun.oss.OSSClient;
import org.junit.*;

public class OssClientTest {

    private static final String ACCESS_KEY = "LTAI4FcuaSQnzvWfiZ56ZjEj";
    private static final String SECRET_KEY = "************************";

    @Test
    public void testCheckBucket() {
        String bucketName = "app-deploy-file";
        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
        OSSClient client = new OSSClient(endpoint, ACCESS_KEY, SECRET_KEY);
        String result = client.getBucketLocation(bucketName);
        System.out.println("bucket location:" + result);
    }
}
