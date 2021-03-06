parent.bottom = {}
parent.bottom.edit_flag = 0;
audit_flag = 1;
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

    /* 
    *id
    des
    auditStatus
    auditPeople
    auditDate
    typeName
    mgrId
    描述
    审核状态
    审核人
    审核时间
    * */

    Dict.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'id', hide: true, sort: true, title: 'id'},
            {field: 'des', sort: true, title: '描述'},
            {
                field: 'auditStatus', sort: true, title: '审核状态',
                templet: function (d) {
                    if (d.auditStatus === '') {
                        return '未审核'
                    } else if (d.auditStatus == 1) {
                        return '已驳回'
                    } else if (d.auditStatus == 0){
                        return '审核通过'
                    }
                }
            },
            {field: 'name', sort: true, title: '审核人'},
            {field: 'auditDate', sort: true, title: '审核时间',
                templet: function (d) {
                    return d.auditDate.substring(0,10)
                }},
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
        var title = '交底会签录入';
        var lianjie = '/auditBottom/add?typeName='+typeName;
        if (data !== undefined) {
            if (data.id) {
                title = '交底会签修改';
                lianjie = '/auditBottom/add?id=' + data.id+"&typeName="+typeName
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
            var ajax = new $ax(Feng.ctxPath + "/auditBottom/delete", function (data) {
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
        url: Feng.ctxPath + '/auditBottom/list?typeName='+typeName,
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: Dict.initColumn(),
        done: function (res, curr, count) {
            //如果是异步请求数据方式，res即为你接口返回的信息。
            //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
            console.log(res);

            //得到当前页码
            console.log(curr);

            //得到数据总量
            console.log(count);
        }
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        Dict.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {
        Dict.openAddDict('add');
    });

    function getNowFormatDate() {
        var date = new Date();
        var year = date.getFullYear();
        var month = date.getMonth() + 1;
        var strDate = date.getDate();
        if (month >= 1 && month <= 9) {
            month = '0' + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = '0' + strDate;
        }
        var currentdate = year + '-' + month + '-' + strDate;
        return currentdate;
    }

    Dict.audit = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/auditBottom/pass", function (resp) {
                if (audit_flag==0) {
                    Feng.success("审核成功!");
                }else {
                    Feng.success("驳回成功!");
                }
                table.reload(Dict.tableId);
            }, function (data) {
                Feng.error("审核失败!" + data.responseJSON.message + "!");
            });
            data.auditStatus = audit_flag;
            data.auditDate = getNowFormatDate();
            ajax.set(data);
            ajax.start();
        };
        if (audit_flag==0) {
            Feng.confirm("是否通过", operation);
        }else {
            Feng.confirm("是否驳回", operation);
        }
    };


    // 工具条点击事件
    table.on('tool(' + Dict.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            Dict.openAddDict(data);
        } else if (layEvent === 'delete') {
            Dict.onDeleteRole(data);
        } else if (layEvent === 'pass') {
            audit_flag = 0;
            Dict.audit(data)
        } else if (layEvent === 'reject') {
            audit_flag = 1;
            Dict.audit(data)
        }
    });
});
