package controller

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@RequestMapping(Array("/hi"))
class HelloController {
  def show(): String ={
    return "hello world!"
  }
}
