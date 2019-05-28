package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.JSONResult;
import cn.unicom.fj.uav.model.helper.TaskDevHelper;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import cn.unicom.fj.uav.service.TaskDevService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "taskdev")
public class TaskDevController {
    @Autowired
    private TaskDevService taskDevService;

//    @RequestMapping(value = "insert")
//    public int insert(@RequestBody Task data) {
//        return taskDevService.insert(data);
//    }
@RequestMapping(value = "list")
public JSONResult search(@RequestBody TaskDevHelper data) {
    List res = taskDevService.search(data);
    return new JSONResult().ok(res);
}
    @RequestMapping(value = "search")
    public JSONResult search(@RequestBody TaskDevHelper data,
                             @RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "limit", defaultValue = "20") Integer limit) {
        System.out.println(data);
        PageHelper.startPage(page, limit);

        List res = taskDevService.search(data);
        List list = res;
        PageInfo pageInfo = new PageInfo<>(list);

        return new JSONResult().ok(pageInfo);
    }

    @RequestMapping(value = "deviceall")
    public JSONResult deviceall(){
        return new JSONResult().ok(taskDevService.devicesAll());
    }

    @RequestMapping(value = "delete")
    public void delete(@RequestParam(value = "id") Integer id){
        taskDevService.taskDelete(id);
    }

    @RequestMapping(value = "create")
    public void create(@RequestBody TaskDevHelper data){
        System.out.println("========>"+data);
        taskDevService.createTask(data);
    }
    @RequestMapping(value = "change")
    public void create(@RequestBody Task data){
        taskDevService.changeStatus(data);
    }
}
