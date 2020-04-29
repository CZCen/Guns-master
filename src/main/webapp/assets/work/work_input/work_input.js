console.log('test input')
layui.use(['layer', 'form', 'table', 'admin', 'ax'], function () {
    var $ = layui.$;
    var layer = layui.layer;
    var form = layui.form;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;

    /**
     * 系统管理--角色管理
     */
    var Role = {
        tableId: "roleTable",    //表格id
        condition: {
            roleName: ""
        }
    };

    /**
     * 初始化表格的列  "施工地点、时间、任务、工作内容、材料配备、工器具"
     */
    Role.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'work_place', hide: true, sort: true, title: '施工地点'},
            {field: 'work_time', sort: true, title: '时间'},
            {field: 'work_content', sort: true, title: '工作内容'},
            {field: 'equipment', sort: true, title: '设备'},
            {align: 'material', toolbar: '#tableBar', title: '材料配备', minWidth: 200},
            {align: 'ping_jia', toolbar: '#tableBar', title: '评价', minWidth: 200}
            // {align: 'type_name', toolbar: '#tableBar', title: '任务', minWidth: 200}
            // {align: 'mgr_id', toolbar: '#tableBar', title: '', minWidth: 200}
        ]];
    };

    /**
     * 点击查询按钮
     */
    Role.search = function () {
        var queryData = {};
        queryData['roleName'] = $("#roleName").val();
        table.reload(Role.tableId, {where: queryData});
    };

    /**
     * 弹出添加角色
     */
    Role.openAddRole = function () {
        admin.putTempData('formOk', false);
        top.layui.admin.open({
            type: 2,
            title: '添加角色',
            content: Feng.ctxPath + '/role/role_add',
            end: function () {
                admin.getTempData('formOk') && table.reload(Role.tableId);
            }
        });
    };

    /**
     * 导出excel按钮
     */
    Role.exportExcel = function () {
        var checkRows = table.checkStatus(Role.tableId);
        if (checkRows.data.length === 0) {
            Feng.error("请选择要导出的数据");
        } else {
            table.exportFile(tableResult.config.id, checkRows.data, 'xls');
        }
    };

    /**
     * 点击编辑角色
     *
     * @param data 点击按钮时候的行数据
     */
    Role.onEditRole = function (data) {
        admin.putTempData('formOk', false);
        top.layui.admin.open({
            type: 2,
            title: '修改角色',
            content: Feng.ctxPath + '/role/role_edit?roleId=' + data.roleId,
            end: function () {
                admin.getTempData('formOk') && table.reload(Role.tableId);
            }
        });
    };

    /**
     * 点击删除角色
     *
     * @param data 点击按钮时候的行数据
     */
    Role.onDeleteRole = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/role/remove", function () {
                Feng.success("删除成功!");
                table.reload(Role.tableId);
            }, function (data) {
                Feng.error("删除失败!" + data.responseJSON.message + "!");
            });
            ajax.set("roleId", data.roleId);
            ajax.start();
        };
        Feng.confirm("是否删除角色 " + data.name + "?", operation);
    };

    /**
     * 分配菜单
     *
     * @param data 点击按钮时候的行数据
     */
    Role.roleAssign = function (data) {
        layer.open({
            type: 2,
            title: '权限配置',
            area: ['300px', '450px'], //宽高
            fix: false,
            maxmin: true,
            content: Feng.ctxPath + '/role/role_assign/' + data.roleId,
            end: function () {
                table.reload(Role.tableId);
            }
        });
    };

    // 渲染表格
    var tableResult = table.render({
        elem: '#' + Role.tableId,
        url: Feng.ctxPath + '/role/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: Role.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        Role.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {
        Role.openAddRole();
    });

    // 导出excel
    $('#btnExp').click(function () {
        Role.exportExcel();
    });

    // 工具条点击事件
    table.on('tool(' + Role.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            Role.onEditRole(data);
        } else if (layEvent === 'delete') {
            Role.onDeleteRole(data);
        } else if (layEvent === 'roleAssign') {
            Role.roleAssign(data);
        }
    });
});
