package cn.unicom.fj.uav;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("cn.unicom.fj.uav.dao")
public class UavApplication {

	public static void main(String[] args) {
		SpringApplication.run(UavApplication.class, args);
	}

}
