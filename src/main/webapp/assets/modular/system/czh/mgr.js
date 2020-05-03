layui.use(['layer', 'form', 'table', 'admin', 'ax'], function () {
    var $ = layui.$;
    var layer = layui.layer;
    var form = layui.form;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;

    /**
     * 系统管理--字典管理
     */
    var Dict = {
        tableId: "dictTable",    //表格id
        condition: {
            condition: ""
        }
    };

    /**
     * 初始化表格的列
     */
    Dict.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'id', hide: true, sort: true, title: 'id'},
            {field: 'mgrNo', sort: true, title: '项目编号'},
            {field: 'mgrName', sort: true, title: '项目名称'},
            {field: 'rencaiFengxian', sort: true, title: '人才风险'},
            {field: 'xingweiFengxian', sort: true, title: '行为风险'},
            {field: 'guanliFengxian', sort: true, title: '管理风险'},
            {field: 'jishuFengxian', sort: true, title: '技术风险'},
            {field: 'jingjiFengxian', sort: true, title: '经济风险'},
            {field: 'pingjia', sort: true, title: 'pingjia'},
            {align: 'center', toolbar: '#tableBar', title: '操作', minWidth: 250}
        ]];
    };

    /**
     * 点击查询按钮
     */
    Dict.search = function () {
        var queryData = {};
        queryData['condition'] = $("#condition").val();
        table.reload(Dict.tableId, {where: queryData});
    };

    Dict.openAddDict = function (data) {
        admin.putTempData('formOk', false);
        var title = '工程项目录入';
        var lianjie = '/myMgr/add';
        if(data != undefined){
            if(data.id){
                title = '工程项目修改';
                lianjie = '/myMgr/add?id=' + data.id
            }
        }

        top.layui.admin.open({
            type: 2,
            title: title,
            content: Feng.ctxPath +lianjie ,
            end: function () {
                admin.getTempData('formOk') && table.reload(Dict.tableId);
            }
        });
    };

    Dict.pingjia = function (data) {
        admin.putTempData('formOk', false);
        var title = '评价';
        var lianjie = '/myMgr/pingjia';
        if(data != undefined){
            if(data.id){
                title = '评价修改';
                lianjie = '/myMgr/pingjia?id=' + data.id
            }
        }
        top.layui.admin.open({
            type: 2,
            title: title,
            content: Feng.ctxPath +lianjie ,
            end: function () {
                admin.getTempData('formOk') && table.reload(Dict.tableId);
            }
        });
    };

    function toPercent(num, total) {
        return (Math.round(num / total * 10000) / 100.00 + "%");// 小数点后两位百分比
    }

    Dict.jisuan = function (data) {
        var jishufengxian  = data.jishuFengxian;
        var jingjifengxian =  data.jingjiFengxian;
        var guanlifengxian = data.guanliFengxian;
        var xingweifengxian = data.xingweiFengxian;
        var rencaifengxian = data.rencaiFengxian;

        var totale = jishufengxian*1 + jingjifengxian*1 + guanlifengxian*1 + xingweifengxian*1 +rencaifengxian*1;

        layer.msg("行为风险比重："+toPercent(xingweifengxian,totale)+"<br>"+
            "技术风险比重："+toPercent(jishufengxian,totale)+"<br>"+
        "管理风险比重："+toPercent(guanlifengxian,totale)+"<br>"+
        "人才风险比重："+toPercent(rencaifengxian,totale)+"<br>"+
        "经济风险比重："+toPercent(jingjifengxian,totale)+"<br>");

    };


    Dict.onDeleteRole = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/myMgr/delete?id="+data.id, function (data) {
                Feng.success("删除成功!");
                table.reload(Dict.tableId);
            }, function (data) {
                Feng.error("删除失败!" + data.responseJSON.message + "!");
            });
            ajax.set("dictId", data.dictId);
            ajax.start();
        };
        Feng.confirm("是否刪除 " + data.mgrName + "?", operation);
    };


    Dict.shenhe = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/myMgr/shenhe?id="+data.id+"&auditStatus="+1, function (data) {
                Feng.success("审核成功!");
                table.reload(Dict.tableId);
            }, function (data) {
                Feng.error("审核失败!" + data.responseJSON.message + "!");
            });
            ajax.set("dictId", data.dictId);
            ajax.start();
        };
        Feng.confirm("是否通过方案： " + data.workPlan + "?", operation);
    };



    // 渲染表格
    var tableResult = table.render({
        elem: '#' + Dict.tableId,
        url: Feng.ctxPath + '/myMgr/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: Dict.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        Dict.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {
        Dict.openAddDict();
    });


    // 工具条点击事件
    table.on('tool(' + Dict.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            Dict.openAddDict(data);
        } else if (layEvent === 'delete') {
            Dict.onDeleteRole(data);
        } else if (layEvent === 'pingjia') {
            Dict.pingjia(data);
        }else if (layEvent === 'jisuan') {
            Dict.jisuan(data);
        }
    });
});
