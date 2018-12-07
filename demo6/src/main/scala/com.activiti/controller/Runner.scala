package controller

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

//springboot的引导类，入口
@SpringBootApplication
object Runner {
  def main(args: Array[String]): Unit = {
 //   print("入口，即启动tomcat")
    SpringApplication.run(classOf[AppConf])
  }
}


@RestController
@SpringBootApplication(scanBasePackages = Array("main.scala"))
@RequestMapping(Array("/hh"))
class AppConf extends WebMvcConfigurerAdapter {
  @RequestMapping(Array("","/"))
  def show(): String ={
    return "hello world!789"
  }
}