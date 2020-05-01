/**
 * Copyright 2018-2020 stylefeng & fengshuonan (https://gitee.com/stylefeng)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.stylefeng.guns.modular.service.wrap;

import cn.hutool.core.util.StrUtil;
import cn.stylefeng.guns.core.common.constant.factory.ConstantFactory;
import cn.stylefeng.guns.modular.system.entity.Dict;
import cn.stylefeng.roses.core.base.warpper.BaseControllerWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
import java.util.Map;

public class WorkPeopleWrapper extends BaseControllerWrapper {

    public WorkPeopleWrapper(Page<Map<String, Object>> page) {
        super(page);
    }

    @Override
    protected void wrapTheMap(Map<String, Object> map) {
//        StringBuilder detail = new StringBuilder();
//        Long id = Long.valueOf(map.get("dictId").toString());
//        List<Dict> dicts = ConstantFactory.me().findInDict(id);
//        if (dicts != null) {
//            for (Dict dict : dicts) {
//                detail.append(dict.getCode()).append(":").append(dict.getName()).append(",");
//            }
//            map.put("detail", StrUtil.removeSuffix(detail.toString(), ","));
//        }
    }
}
