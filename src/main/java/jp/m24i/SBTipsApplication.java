package jp.m24i;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SBTipsApplication {

  public static void main(String[] args) {
    SpringApplication.run(SBTipsApplication.class, args);
    
    log.info("start");
  }

}
