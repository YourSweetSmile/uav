package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.FlyTask;
import cn.unicom.fj.uav.service.FlyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "flyTask")
public class FlyController {
  @Autowired
  private FlyService flyService;
  @RequestMapping(value = "flyArea")
  //查询飞行区域统计表字段
  public List<FlyTask> getAllNews(){

   List<FlyTask> list=flyService.getAllTask();
    return list;
  }
  //删除
  @RequestMapping("delete/{id}")
  public void  delect(@PathVariable("id") Short id){
    flyService.delect(id);
  }
////新增
//    @PostMapping(value = "newFly")
//    public int insertFly(@RequestBody Task task){
//     return  flyService.insertFly(task);
//  }
  //新增
  @RequestMapping(value = "newFly")
  public int insertFly(@RequestParam("taskTypeId") Byte taskTypeId,
                       @RequestParam("deviceId") Short deviceId,
                       @RequestParam("taskStartTime") String taskStartTime,
                       @RequestParam("rodeId") Short rodeId) throws ParseException {

//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    Date date = sdf.parse(taskStartTime);
    return  flyService.insertFly(taskTypeId,deviceId,taskStartTime,rodeId);
  }
  //更新
  @RequestMapping(value="edtFly")
    public int updateFlyTask(@RequestParam("id") Short id,
                             @RequestParam("taskTypeId") Byte taskTypeId,
                             @RequestParam("deviceId") Short deviceId,
                             @RequestParam("taskStartTime") String taskStartTime,
                             @RequestParam("rodeId") Short rodeId) throws ParseException {
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    Date date = sdf.parse(taskStartTime);
    return flyService.updateFlyTask(id,taskTypeId,deviceId,taskStartTime,rodeId);
    }

  //检索
  @GetMapping(value = "selectFly")
  public PageInfo<FlyTask> select(
    @RequestParam(value = "page",defaultValue = "1") int page,
    @RequestParam(value = "limit",defaultValue = "10") int limit,
    @RequestParam(name="taskType",defaultValue = "") String taskType,
    @RequestParam(name="deviceId",defaultValue = "") String deviceId,
    @RequestParam(name="rodeId",defaultValue = "") String rodeId,
    @RequestParam(name="order",defaultValue = "+id") String order)
  {
    //开启查询器
    PageHelper.startPage(page,limit);
    //查询符合条件的结果集
    List<FlyTask> list=flyService.getNewsByCon(taskType,deviceId,rodeId,order);
    //根据前端要求扔回数据
    PageInfo<FlyTask> pageInfo=new PageInfo<>(list);
    return pageInfo;
  }

}
