package controller

//import org.activiti.engine.{RepositoryService, RuntimeService, TaskService}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}


@RestController
//@RequestMapping("/demo")
 class DemoController {
 /* @Autowired
  private RepositoryService repositoryService;
  @Autowired
  private RuntimeService runtimeService;
  @Autowired
  private TaskService taskService;

  @RequestMapping("/firstDemo")
  public void firstDemo() {

    //根据bpmn文件部署流程
    Deployment deployment = repositoryService.createDeployment().addClasspathResource("templates/demo2.bpmn").deploy();
    //获取流程定义
    ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().deploymentId(deployment.getId()).singleResult();
    //启动流程定义，返回流程实例
    ProcessInstance pi = runtimeService.startProcessInstanceById(processDefinition.getId());
    String processId = pi.getId();
    System.out.println("流程创建成功，当前流程实例ID：" + processId);

    Task task = taskService.createTaskQuery().processInstanceId(processId).singleResult();
    System.out.println("第一次执行前，任务名称：" + task.getName());
    taskService.complete(task.getId());

    task = taskService.createTaskQuery().processInstanceId(processId).singleResult();
    System.out.println("第二次执行前，任务名称：" + task.getName());
    taskService.complete(task.getId());

    task = taskService.createTaskQuery().processInstanceId(processId).singleResult();
    System.out.println("task为null，任务执行完毕：" + task);
  }*/

}