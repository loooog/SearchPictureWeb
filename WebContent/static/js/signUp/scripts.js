$('form :input').blur(function(){
    var parent=$(this).parent();
    parent.find('.formTip').remove();
    if($(this).is('.username')){
        if(this.value.length!=11){
            var errorMsg='请输入正确的手机号码';
            parent.append('<div class="formTip error formTip1"><span>'+errorMsg+'</span></div>');
            $('.formTip1').css('width', '182px');
        }else{
            parent.append('<div class="formTip right formTip1"></div>');
        }
        $('.formTip1').css('top', '27px');
    }
    if($(this).is('.password')){
        if(this.value.length<6){
            var errorMsg='密码至少包含六位';
            parent.append('<div class="formTip error formTip2"><span>'+errorMsg+'</span></div>');
            $('.formTip2').css('width', '154px');
        }else{
            parent.append('<div class="formTip right formTip2"></div>');
        }
        $('.formTip2').css('top', '96px');
    }
    if($(this).is('.code')){
        if(this.value.length!=6){
            var errorMsg='请输入正确的验证码';
            parent.append('<div class="formTip error formTip3"><span>'+errorMsg+'</span></div>');
            $('.formTip3').css('width', '168px');
        }else{
            parent.append('<div class="formTip right formTip3"></div>');
        }
        $('.formTip3').css('top', '165px');
    }
}).keyup(function(){
    $(this).triggerHandler("blur");
}).focus(function(){
    $(this).triggerHandler("blur");
});

$('.signUp').click(function(){
    $('form :input').trigger('blur');
    var errorNum=$('form .error').length;
    if(errorNum){
        return false;
    }
});

$('.sendCode').click(function(){
    var username=$('.login-box .username').val();
    if(username.length!=11){
        $('.login-box .username')[0].focus();   //将Jquery对象转换成DOM对象，使username文本框获得焦点
    }
});
