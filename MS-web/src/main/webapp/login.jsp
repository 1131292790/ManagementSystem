<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-登陆</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="https://www.layuicdn.com/layui/css/layui.css" media="all">
    <script src="https://upcdn.b0.upaiyun.com/libs/jquery/jquery-2.0.2.min.js"></script>
    <link rel="stylesheet" href="static/css/admin_login.css">

    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<h1>${requestScope.msg}</h1>
<div class="layui-container">
    <div class="admin-login-background">
        <form id="login_form" class="layui-form login-form">
            <div class="layui-form">
                <div class="layui-form-item logo-title">
                    <h1>App后台登录</h1>
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-username" for="username"></label>
                    <input id="username" type="text" name="username" lay-verify="required|account" placeholder="用户名" autocomplete="off" class="layui-input" required>
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-password" for="password"></label>
                    <input id="password" name="password" type="password"  lay-verify="required|password" placeholder="密码" autocomplete="off" class="layui-input" required>
                </div>
                <!--              <div class="layui-form-item">
                                  <label class="layui-icon layui-icon-vercode" for="captcha"></label>
                                  <input type="text" name="captcha" lay-verify="required|captcha" placeholder="验证码" autocomplete="off" class="layui-input verification captcha" required>
                                  <div class="captcha-img">
                                      <img id="captchaPic" src="#">
                                  </div>
                              </div>-->
                <div class="layui-form-item">
                    <input type="checkbox" name="rememberMe" value="true" lay-skin="primary" title="记住密码">
                </div>
                <div class="layui-form-item">
                    <button type="button" class="layui-btn layui-btn-fluid layui-bg-blue" lay-submit="" lay-filter="do_login" >登 录</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script src="https://www.layuicdn.com/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form','layer'], function () {
        var form = layui.form;
        var layer = layui.layer;

        form.on('submit(do_login)',function () {
            var param = {username:$("#username").val(),password:$("#password").val()};
            $.ajax({
                type: "POST",
                url: "/admin/adminlogin",
                data: JSON.stringify(param),
                contentType: "application/json;charset=utf-8",
                dataType: "json",
                error: function (data) {
                    console.log("error");

                },
                success: function (data) {
                    if(data.success=="success"){
                        layer.msg("登陆成功！",{icon:1,anim:2,time:1500},function(){
                            //交给controller跳转
                            window.location.href="/admin/index";
                        });
                    }else{
                        layer.msg("登陆失败！请检查用户名和密码后重试！",{icon:5,anim:6,time:2000});
                    }
                }

            });
        });


    });

</script>
</body>
</html>