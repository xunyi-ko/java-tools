jQuery.download = function(url, method){
    jQuery('<form action="'+url+'" method="'+(method||'post')+'">' + '</form>').appendTo('body').submit().remove();
};