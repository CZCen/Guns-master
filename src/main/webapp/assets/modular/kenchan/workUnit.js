edit_flag=0;
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
    //  unit_name
    // zi_zhi
    // mobile
    // create_time
    // create_user
    // principal
    // type_name
    // mgr_id
    // 用于施工单位、维护单位名称和资质录入
    // 单位名称 资质 联系电话
    //单位名称 资质 联系电话 负责人 单位类型

    Dict.initColumn = function () {
        return [[

            {type: 'checkbox'},
            {field: 'id', hide: true, sort: true, title: 'id'},
            {field: 'unitName', sort: true, title: '单位名称'},
            {field: 'ziZhi', sort: true, title: '资质'},
            {field: 'mobile', sort: true, title: '联系电话'},
            {field: 'principalName', sort: true, title: '负责人'},
            {field: 'unitType', sort: true, title: '单位类型'},
            {align: 'center', toolbar: '#tableBar', title: '操作', minWidth: 200}
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
        var title = '单位信息录入';
        var lianjie = '/workUnit/add?typeName='+typeName;
        if (data !== undefined) {
            if (data.id) {
                title = '单位信息修改';
                lianjie = '/workUnit/add?id=' + data.id+"&typeName="+typeName
            }
        }

        top.layui.admin.open({
            type: 2,
            title: title,
            content: Feng.ctxPath + lianjie,
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
        console.log(data)
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/workUnit/delete", function (resp) {
                Feng.success("删除成功!");
                table.reload(Dict.tableId);
            }, function (data) {
                Feng.error("删除失败!" + data.responseJSON.message + "!");
            });
            ajax.set("id", data.id);
            ajax.start();
        };
        Feng.confirm("确认刪除 ?", operation);
        // Feng.confirm("是否刪除 " + data.name + "?", operation);
    };

    // 渲染表格
    var tableResult = table.render({
        elem: '#' + Dict.tableId,
        url: Feng.ctxPath + '/workUnit/list?typeName='+typeName,
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
        Dict.openAddDict('add');
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
