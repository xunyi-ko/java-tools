jQuery.download = function(url, method){
    jQuery('<form action="'+url+'" method="'+(method||'post')+'">' + '</form>').appendTo('body').submit().remove();
};

// 在修改信息的页面调用此方法，在修改了信息后，离开页面时会被拦截。
function onBeforeUnload(){
    $("input,textarea").bind("change",function(){
        window.onbeforeunload = function (e) {
            var e = window.event || e;
            e.returnValue = ("确定离开当前页面吗？(修改的信息不会保留)");
        }
    })
}

// 去除离开页面会拦截的事件
function onSaveDispatcher(){
    window.onbeforeunload = function (e) {}
}
