package cn.stylefeng.guns.modular.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.stylefeng.guns.core.common.page.LayuiPageFactory;
import cn.stylefeng.guns.modular.entity.WorkPeople;
import cn.stylefeng.guns.modular.service.impl.WorkPeopleService;
import cn.stylefeng.guns.modular.service.wrap.WorkPeopleWrapper;
import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import cn.stylefeng.roses.core.util.ToolUtil;
import cn.stylefeng.roses.kernel.model.exception.RequestEmptyException;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Map;

/**
 * (WorkPeople)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */

@Controller
@RequestMapping("/workPeople")
public class WorkPeopleController  extends BaseController {

    private String PREFIX = "/modular/czh/";

    @Resource
    private WorkPeopleService workPeopleService;

    /**
     * 主页
     * @return
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "work_people.html";
    }

    @RequestMapping("/add")
    public String add() {
        return PREFIX + "work_people_edit.html";
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseData add(WorkPeople workPeople) {
        if(ToolUtil.isEmpty(workPeople.getId())){
            this.workPeopleService.save(workPeople);
        }else{
            this.workPeopleService.updateById(workPeople);
        }
        return SUCCESS_TIP;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(@RequestParam Long id) {
        this.workPeopleService.delete(id);
        return SUCCESS_TIP;
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object list(String condition) {
        if(condition==null){
            condition = "";
        }
        Page<Map<String, Object>> list = this.workPeopleService.selectWorkPeople(condition);
        Page<Map<String, Object>> warpper = new WorkPeopleWrapper(list).wrap();
        return LayuiPageFactory.createPageInfo(warpper);
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Object getUserInfo(@RequestParam Long id) {
        if (ToolUtil.isEmpty(id)) {
            throw new RequestEmptyException();
        }
        WorkPeople workPeople = this.workPeopleService.getById(id);
        Map<String, Object> hashMap = BeanUtil.beanToMap(workPeople);
        return ResponseData.success(hashMap);
    }


}