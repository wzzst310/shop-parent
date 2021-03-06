package cn.wolfcode.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by WangZhe on 2018年08月15日.
 */
@SpringBootApplication
@MapperScan("cn.wolfcode.shop.mapper")
@PropertySource({"classpath:redis.properties", "classpath:zookeeper.properties"})
public class GoodsServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsServerApplication.class, args);
    }
}
