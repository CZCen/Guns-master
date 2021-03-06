var dt = {};
layui.use(['layer', 'form', 'admin', 'ax'], function () {
    var $ = layui.jquery;
    var $ax = layui.ax;
    var form = layui.form;
    var admin = layui.admin;
    var layer = layui.layer;

    // 让当前iframe弹层高度适应
    admin.iframeAuto();

    // 表单提交事件
    /*form.on('submit(btnSubmit)', function (data) {
        add_flag = data.field.id === '';
        var ajax = new $ax(Feng.ctxPath + "/workUnit/save", function (resp) {

            if (data.field.id === '') {
                Feng.success("添加成功！");
            } else {
                Feng.success("修改成功！");
            }

            //传给上个页面，刷新table用
            admin.putTempData('formOk', true);

            //关掉对话框
            admin.closeThisDialog();
        }, function (data) {
            Feng.error("添加失败！" + data.responseJSON.message)
        });
        if (add_flag) {
            data.field.typeName = typeName
        }
        var ajax1 = new $ax(Feng.ctxPath + "/workUnit/getOneByName", function (resp) {
            if (resp === '' || resp == null) {
                Feng.error("人员不存在！");
            } else {
                data.field.principal = resp;
                ajax.set(data.field);
                ajax.start();
            }
        }, function (data) {
            Feng.error("添加失败！" + data.responseJSON.message)
        });
        ajax1.set(data.field);
        ajax1.start();
    });*/
    form.on('submit(btnSubmit)', function (data) {
        add_flag = data.field.id === '';
        var ajax = new $ax(Feng.ctxPath + "/workUnit/save", function (resp) {

            if (data.field.id === '') {
                Feng.success("添加成功！");
            } else {
                Feng.success("修改成功！");
            }

            //传给上个页面，刷新table用
            admin.putTempData('formOk', true);

            //关掉对话框
            admin.closeThisDialog();
        }, function (data) {
            Feng.error("添加失败！" + data.responseJSON.message)
        });
        if (add_flag) {
            data.field.typeName = typeName
        }
        ajax.set(data.field);
        ajax.start();
    });


    var getPeople = function (data) {
        var ajax = new $ax(Feng.ctxPath + "/workTicket/getPeople", function (data) {
            var list = data.data;
            var text = "<option value=''>请选择项目</option>"
            for (var i = 0; i < list.length ; i++) {
                text += " <option value='"+list[i].id+"'>"+list[i].name+"</option>"
            }
            $("#principalName").append(text)
            layui.form.render("select");
        }, function (data) {
            Feng.error("getCombo失败!" + data.responseJSON.message + "!");
        });
        ajax.start();
    };
    getPeople();

    var id = Feng.getUrlParam("id");
    if (id) {
        var ajax_ = new $ax(Feng.ctxPath + "/workUnit/getOne?id=" + id);
        var result = ajax_.start();
        // result.data.principalName = parent.edit_data.principalName;
        form.val('myForm', result.data);
        // getPeople();
        layui.form.render("select");
    }
    var getCombo = function (data) {
        var ajax = new $ax(Feng.ctxPath + "/workPeople/getCombo", function (data) {
            var list = data.data;
            var text = "<option value=''>请选择项目</option>"
            for (var i = 0; i < list.length ; i++) {
                text += " <option value='"+list[i].value+"'>"+list[i].text+"</option>"
            }
            $("#combo").append(text)
            layui.form.render("select");
        }, function (data) {
            Feng.error("getCombo失败!" + data.responseJSON.message + "!");
        });
        ajax.start();
    };
    getCombo();


});


