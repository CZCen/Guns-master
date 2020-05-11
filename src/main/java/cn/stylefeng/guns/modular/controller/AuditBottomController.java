package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.core.common.page.LayuiPageFactory;
import cn.stylefeng.guns.core.common.page.LayuiPageInfo;
import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.core.util.KommonUtil;
import cn.stylefeng.guns.modular.dao.AuditBottomDao;
import cn.stylefeng.guns.modular.entity.AuditBottom;
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
import java.util.Date;
import java.util.List;

/**
 * (AuditBottom)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@Controller
@RequestMapping("auditBottom")
@Slf4j
public class AuditBottomController extends BaseController {

    private static final String PREFIX = "modular/kenchan/";
    private static final ErrorResponseData ERROR_TIP = ResponseData.error("请检查输入是否合法");

    @Resource
    AuditBottomDao auditBottomDao;

    @RequestMapping("")
    public String api1(String typeName, Model model) {
        model.addAttribute("typeName", typeName);
        return PREFIX + "auditBottom" + KommonUtil.HTML_SUFFIX;
    }

    @RequestMapping("/add")
    public String add(String typeName, Model model) {
        model.addAttribute("typeName", typeName);
        return PREFIX + "auditBottomEdit" + KommonUtil.HTML_SUFFIX;
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseData add( AuditBottom auditBottom) {
        try {
            auditBottom.insertOrUpdate();
            return SUCCESS_TIP;
        } catch (Exception e) {
            log.error(null, e);
            return ERROR_TIP;
        }
    }

    @RequestMapping("/pass")
    @ResponseBody
    public ResponseData pass(AuditBottom workTicket) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            workTicket.setAuditDate( new Date() );
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
            AuditBottom.builder().id(id).build().deleteById();
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
            IPage<AuditBottom> auditBottomIPage;

            final List<AuditBottom> auditDangers = auditBottomDao.queryAllByLimit(((int) page - 1) * (int) limit, (int) limit, typeName, condition);
            auditBottomIPage = new Page<>(page, limit, auditBottomDao.selectCount(null));
            auditBottomIPage.setRecords(auditDangers);
            /*if (StringUtils.isEmpty(condition)) {
                auditBottomIPage = auditBottomDao
                        .selectPage(new Page<>(page, limit)
                                , new QueryWrapper<>(AuditBottom.builder().typeName(typeName).build()));
            } else {
                auditBottomIPage = auditBottomDao
                        .selectPage(new Page<>(page, limit),
                                new QueryWrapper<AuditBottom>(AuditBottom.builder().typeName(typeName).build())
                                        .like("des", condition).select());
            }*/
            return LayuiPageFactory.createPageInfo(auditBottomIPage);

        } catch (Exception e) {
            log.error(null, e);
            return LayuiPageFactory.createPageInfo(new Page(0, 0));
        }

    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Object getUserInfo(@RequestParam Long id) {
        AuditBottom auditBottom;
        try {
            auditBottom = AuditBottom.builder().id(id).build().selectById();
        } catch (Exception e) {
            log.error(null, e);
            return ERROR_TIP;
        }
        return ResponseData.success(auditBottom);
    }
}