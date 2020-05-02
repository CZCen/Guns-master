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
            {field: 'name', sort: true, title: '名称'},
            {field: 'mobile', sort: true, title: '手机号码'},
            {field: 'ege', sort: true, title: '年龄'},
            {field: 'zi_zhi', sort: true, title: '资质'},
            {field: 'audit_status', sort: true, title: '审核状态'},
            {field: 'audit_people', sort: true, title: '审核人'},
            {field: 'audit_time', sort: true, title: '审核时间'},
            {align: 'center', toolbar: '#tableBar', title: '操作', minWidth: 200}
        ]];
    };

    /**
     * 点击查询按钮
     */
    Dict.search = function () {
        var queryData = {};
        queryData['condition'] = $("#condition").val();
        queryData['typeName'] = '工作票';
        table.reload(Dict.tableId, {where: queryData});
    };

    Dict.openAddDict = function (data) {
        admin.putTempData('formOk', false);
        var title = '人员信息录入';
        var lianjie = '/workPeople/add';
        if(data != undefined){
            if(data.id){
                title = '人员信息修改';
                lianjie = '/workPeople/add?id=' + data.id
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


    /**
     * 点击删除字典
     *
     * @param data 点击按钮时候的行数据
     */
    Dict.onDeleteRole = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/workPeople/delete?id="+data.id, function (data) {
                Feng.success("删除成功!");
                table.reload(Dict.tableId);
            }, function (data) {
                Feng.error("删除失败!" + data.responseJSON.message + "!");
            });
            ajax.set("dictId", data.dictId);
            ajax.start();
        };
        Feng.confirm("是否刪除 " + data.name + "?", operation);
    };

    // 渲染表格
    var tableResult = table.render({
        elem: '#' + Dict.tableId,
        url: Feng.ctxPath + '/workPeople/list',
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
        }
    });
});
