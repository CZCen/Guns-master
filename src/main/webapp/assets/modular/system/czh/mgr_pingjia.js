layui.use(['layer', 'form', 'admin', 'ax'], function () {
    var $ = layui.jquery;
    var $ax = layui.ax;
    var form = layui.form;
    var admin = layui.admin;
    var layer = layui.layer;

    // 让当前iframe弹层高度适应
    admin.iframeAuto();

    // 表单提交事件
    form.on('submit(btnSubmit)', function (data) {
        var ajax = new $ax(Feng.ctxPath + "/myMgr/save", function (data) {
            Feng.success("评价成功！");
            //传给上个页面，刷新table用
            admin.putTempData('formOk', true);
            //关掉对话框
            admin.closeThisDialog();
        }, function (data) {
            Feng.error("评价失败！" + data.responseJSON.message)
        });
        ajax.set(data.field);
        ajax.start();
    });


    var id = Feng.getUrlParam("id");
    if(id){
        var ajax_ = new $ax(Feng.ctxPath + "/myMgr/getOne?id=" + id);
        var result = ajax_.start();
        form.val('myForm', result.data);
        layui.form.render("select");
    }
});