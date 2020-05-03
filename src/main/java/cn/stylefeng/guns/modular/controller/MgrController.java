package cn.stylefeng.guns.modular.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.stylefeng.guns.core.common.page.LayuiPageFactory;
import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.core.shiro.ShiroUser;
import cn.stylefeng.guns.modular.entity.Mgr;
import cn.stylefeng.guns.modular.entity.WorkPlan;
import cn.stylefeng.guns.modular.service.MgrService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import cn.stylefeng.roses.core.util.ToolUtil;
import cn.stylefeng.roses.kernel.model.exception.RequestEmptyException;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * (Mgr)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@Controller
@RequestMapping("/myMgr")
public class MgrController  extends BaseController {

    private String PREFIX = "/modular/czh/";


    /**
     * 服务对象
     */
    @Resource
    private MgrService mgrService;


    /**
     * 主页
     * @return
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "mgr.html";
    }

    @RequestMapping("/add")
    public String add() {
        return PREFIX + "mgr_edit.html";
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseData add(Mgr mgr) {
        if(ToolUtil.isEmpty(mgr.getId())){
            this.mgrService.insert(mgr);
        }else{
            this.mgrService.update(mgr);
        }
        return SUCCESS_TIP;
    }


    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(@RequestParam Long id) {
        this.mgrService.deleteById(id);
        return SUCCESS_TIP;
    }

    @RequestMapping("/pingjia")
    public String pingjia() {
        return PREFIX + "mgr_pingjia.html";
    }


    @RequestMapping("/list")
    @ResponseBody
    public Object list(String condition,int page, int limit,String typeName) {
        List<Mgr> list = this.mgrService.queryAllByLimit((page-1)*limit,limit,condition,typeName);
        Page<Mgr> rsult = new Page<>((page-1)*limit,limit);
        rsult.setRecords(list);
        rsult.setTotal(this.mgrService.queryTotal());
        return LayuiPageFactory.createPageInfo(rsult);
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Object getUserInfo(@RequestParam Long id) {
        if (ToolUtil.isEmpty(id)) {
            throw new RequestEmptyException();
        }
        Mgr mgr = this.mgrService.queryById(id);
        Map<String, Object> hashMap = BeanUtil.beanToMap(mgr);
        return ResponseData.success(hashMap);
    }
}