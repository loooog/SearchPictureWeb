function checkCode(){
    var form=$('.page-container form');
    var username = form.find('.username').val();
    if(username == '') {
        form.find('.error').fadeOut('fast', function(){
            $(this).css('top', '27px');
        });
        form.find('.error').fadeIn('fast', function(){
            $(this).parent().find('.username').focus();
        });
    }
}

$('.page-container form .username, .page-container form .password').keyup(function(){
    $(this).parent().find('.error').fadeOut('fast');
});

$('.page-container form').submit(function(){
    var username = $(this).find('.username').val();
    var password = $(this).find('.password').val();
    var code = $(this).find('.code').val();
    if(username == '') {
        $(this).find('.error').fadeOut('fast', function(){
            $(this).css('top', '27px');
        });
        $(this).find('.error').fadeIn('fast', function(){
            $(this).parent().find('.username').focus();
        });
        return false;
    }
    if(password == '') {
        $(this).find('.error').fadeOut('fast', function(){
            $(this).css('top', '96px');
        });
        $(this).find('.error').fadeIn('fast', function(){
            $(this).parent().find('.password').focus();
        });
        return false;
    }
    if(code == '') {
        $(this).find('.error').fadeOut('fast', function(){
            $(this).css('top', '165px');
        });
        $(this).find('.error').fadeIn('fast', function(){
            $(this).parent().find('.code').focus();
        });
        return false;
    }
});


