package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


 @SpringBootApplication
public class SampleController {

    @RequestMapping("/index")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }


     /**
      * 测试一下哈
      * @param args
      * @throws Exception
      */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}
