package cn.stylefeng.guns.modular.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.stylefeng.guns.core.common.page.LayuiPageFactory;
import cn.stylefeng.guns.modular.entity.WorkPlan;
import cn.stylefeng.guns.modular.service.WorkPlanService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import cn.stylefeng.roses.core.util.ToolUtil;
import cn.stylefeng.roses.kernel.model.exception.RequestEmptyException;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (WorkPlan)表控制层
 *
 * 工作方案
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@Controller
@RequestMapping("workPlan")
public class WorkPlanController extends BaseController {

    private String PREFIX = "/modular/czh/";

    /**
     * 服务对象
     */
    @Resource
    private WorkPlanService workPlanService;


    /**
     * 主页
     * @return
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "work_plan.html";
    }

    @RequestMapping("/add")
    public String add() {
        return PREFIX + "work_plan_edit.html";
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseData add(WorkPlan workPlan) {
        if(ToolUtil.isEmpty(workPlan.getId())){
            this.workPlanService.insert(workPlan);
        }else{
            this.workPlanService.update(workPlan);
        }
        return SUCCESS_TIP;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(@RequestParam Long id) {
        this.workPlanService.deleteById(id);
        return SUCCESS_TIP;
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object list(String condition,int page, int limit) {
        List<WorkPlan> list = this.workPlanService.queryAllByLimit((page-1)*limit,limit,condition);
        Page<WorkPlan> rsult = new Page<>((page-1)*limit,limit);
        rsult.setRecords(list);
        rsult.setTotal(this.workPlanService.queryTotal());
        return LayuiPageFactory.createPageInfo(rsult);
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Object getUserInfo(@RequestParam Long id) {
        if (ToolUtil.isEmpty(id)) {
            throw new RequestEmptyException();
        }
        WorkPlan workPeople = this.workPlanService.queryById(id);
        Map<String, Object> hashMap = BeanUtil.beanToMap(workPeople);
        return ResponseData.success(hashMap);
    }



}