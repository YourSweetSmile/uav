package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.FlyTask;
import cn.unicom.fj.uav.model.helper.RouteHelper;
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
  @RequestMapping(value = "flyCount/{taskId}")
 //统计飞行次数,id为任务类型
  public List<FlyTask> getAllNews(@PathVariable(name="taskId") int taskId){

   List<FlyTask> list=flyService.getFlyCount(taskId);
    return list;
  }
//  //删除
//  @RequestMapping("delete/{id}")
//  public void  delect(@PathVariable("id") Short id){
//    flyService.delect(id);
//  }
//更改删除状态
@RequestMapping(value="updateIsDelete")
public int IsDeleteByPrimaryKey(Short id) {
  return flyService.IsDeleteByPrimaryKey(id);
}

//新增
@RequestMapping(value="newFly")
public void insertFly(@RequestBody FlyTask record){
  flyService.insertFly(record);

}
  //更新
  @RequestMapping(value="edtFly")
  public void updateFlyTask(@RequestBody FlyTask record){
    flyService.updateFlyTask(record);
  }
//检索
@RequestMapping(value = "selectFly")
public PageInfo<FlyTask> select(
        @RequestParam(value = "page",defaultValue = "1") int page,
        @RequestParam(value = "limit",defaultValue = "10") int limit,
        @RequestBody FlyTask flyTask
)
{
  //开启查询器
  PageHelper.startPage(page,limit);
  //查询符合条件的结果集
  List<FlyTask> list=flyService.getNewsByCon( flyTask);
  //根据前端要求扔回数据
  PageInfo<FlyTask> pageInfo=new PageInfo<>(list);
  return pageInfo;
}
}
