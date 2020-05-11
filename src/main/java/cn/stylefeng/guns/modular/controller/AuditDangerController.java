package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.core.common.page.LayuiPageFactory;
import cn.stylefeng.guns.core.common.page.LayuiPageInfo;
import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.core.util.KommonUtil;
import cn.stylefeng.guns.modular.dao.AuditDangerDao;
import cn.stylefeng.guns.modular.entity.AuditDanger;
import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.core.reqres.response.ErrorResponseData;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * (AuditDanger)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@Controller
@RequestMapping("auditDanger")
@Slf4j
public class AuditDangerController extends BaseController {

    private static final String PREFIX = "modular/kenchan/";
    private static final ErrorResponseData ERROR_TIP = ResponseData.error("请检查输入是否合法");

    @Resource
    AuditDangerDao auditDangerDao;

    @RequestMapping("")
    public String api1(String typeName, Model model) {
        model.addAttribute("typeName", typeName);
        return PREFIX + "auditDanger" + KommonUtil.HTML_SUFFIX;
    }

    @RequestMapping("/add")
    public String add(String typeName, Model model) {
        model.addAttribute("typeName", typeName);
        return PREFIX + "auditDangerEdit" + KommonUtil.HTML_SUFFIX;
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseData add(AuditDanger auditDanger) {
        try {
            auditDanger.insertOrUpdate();
            return SUCCESS_TIP;
        } catch (Exception e) {
            log.error(null, e);
            return ERROR_TIP;
        }
    }
    @RequestMapping("/pass")
    @ResponseBody
    public ResponseData pass(AuditDanger workTicket) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            workTicket.setAuditPeople(ShiroKit.getUser().getId());
            workTicket.insertOrUpdate();
            return SUCCESS_TIP;
        } catch (Exception e) {
            log.error(null, e);
            return ERROR_TIP;
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(@RequestParam Long id) {
        try {
            AuditDanger.builder().id(id).build().deleteById();
            return SUCCESS_TIP;
        } catch (Exception e) {
            log.error(null, e);
            return ERROR_TIP;
        }
    }

    @RequestMapping("/list")
    @ResponseBody
    public LayuiPageInfo list(long page, long limit, String condition,String typeName) {
        try {
            IPage<AuditDanger> auditDangerIPage;
            final List<AuditDanger> auditDangers = auditDangerDao.queryAllByLimit(((int) page - 1) * (int) limit, (int) limit, typeName, condition);
            auditDangerIPage = new Page<>(page, limit, auditDangerDao.selectCount(null));
            auditDangerIPage.setRecords(auditDangers);

           /* if (StringUtils.isEmpty(condition)) {
                auditDangerIPage = auditDangerDao
                        .selectPage(new Page<>(page, limit)
                                , new QueryWrapper<>(AuditDanger.builder().typeName(typeName).build()));
            } else {
                auditDangerIPage = auditDangerDao
                        .selectPage(new Page<>(page, limit),
                                new QueryWrapper<AuditDanger>(AuditDanger.builder().typeName(typeName).build())
                                        .like("danger_point", condition).select());
            }*/
            return LayuiPageFactory.createPageInfo(auditDangerIPage);

        } catch (Exception e) {
            log.error(null, e);
            return LayuiPageFactory.createPageInfo(new Page(0, 0));
        }

    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Object getUserInfo(@RequestParam Long id) {
        AuditDanger auditDanger;
        try {
            auditDanger = AuditDanger.builder().id(id).build().selectById();
        } catch (Exception e) {
            log.error(null, e);
            return ERROR_TIP;
        }
        return ResponseData.success(auditDanger);
    }
}