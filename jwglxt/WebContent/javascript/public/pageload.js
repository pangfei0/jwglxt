/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function opentab(tabs,plugin,action){
    if(action=="#"||action=="") return;
    var selector="#"+tabs;
    if ($(selector).tabs('exists',plugin)){
            var thetabs=$(selector);
            thetabs.tabs('select', plugin);
            var tab =thetabs.tabs('getSelected'); 
            tab.panel('refresh');
    } 
    else {
            action=encodeURI(action);
            $(selector).tabs('add',{
                    title:plugin,
                    href:action,
                    closable:true
            });
    }
}
function navigatepage(target,url){
    if(undefined==target||target==""){
        window.location.href=url;
        return;
    }
    if("undefined"==typeof mytabs||undefined==mytabs){
        var selector=$("#"+target);
        if(selector.length==0){
            $("body").html("<div id='"+target+"'></div>");
            $("#"+target).panel({
                fit:true,
                href:url,
                noheader:false,
                border:false
            });
            return;
        }
        else{
            selector.panel("refresh",url);
            return;
        }
    }
    else{
        var selector=$("#"+mytabs);
        if ($(selector).tabs('exists',target)){
            $(selector).tabs('select', target);
            var tab =$(selector).tabs('getSelected');  
            $(selector).tabs('update',{tab:tab,options:{href: url}});
        }  
    }
}
function openwindow(parent,url){
    if(undefined==parent||parent==""){
        window.location.href=url;
        return;
    }
     var selector=$("#"+parent);
     if(selector.length==0){
        //var htm="<div class='easyui-panel'>asd</div>";
        $("body").append("<div id='"+parent+"'></div>");
        $("#"+parent).panel({
                fit:true,
                href:url,
                noheader:false,
                border:false
            });
        return;
     }
     else{
        $.messager.progress({msg: "正在加载数据..."}); 
        $.ajax({
              url: url,
              success: function(data){
                $.messager.progress("close"); 
                var pattern = /<body[^>]*>((.|[\n\r])*)<\/body>/im;
                var matches = pattern.exec(data);
                if (matches) data=matches[1];
                selector.append(data);
                $.parser.parse("#"+parent);
              },
              error:function(){
                $.messager.progress("close"); 
                $.messager.alert("网络通信失败！");
              }
          });
        return;
    }
}
function loadpage(ctnr,action,rp,options){
    var selector="#"+ctnr;
    setoptions=function(){};
     $.messager.progress({
             msg: "正在加载数据..."
        }); 
     $.ajax({
        url: action,
        success: function(data){
            $.messager.progress("close"); 
            var pattern = /<body[^>]*>((.|[\n\r])*)<\/body>/im;
            var matches = pattern.exec(data);
            if (matches) data=matches[1];
            
            if(rp==true)
                $(selector).replaceWith(data);
            else
                $(selector).html(data);
            $.parser.parse(selector);
            setoptions(options);
        },
        error:function(){
            $.messager.progress("close"); 
            $.messager.alert("网络通信失败！");
        }
    });
}
function subwindowdata(ctnr,action,datas,callfunc){
    var selector="#"+ctnr;
    $.messager.progress({
             msg: "正在发送数据..."
        }); 
    $.ajax({
        url: action,
        async : false,
        success: function(data){
            $.messager.progress("close"); 
            var pattern = /<body[^>]*>((.|[\n\r])*)<\/body>/im;
            var matches = pattern.exec(data);
            if (matches) data=matches[1];
            if(callfunc!=undefined) callfunc(data);
        },
        error:function(){
            $.messager.progress("close"); 
            if(callfunc!=undefined) callfunc("broken","网络通信失败！");
        },
        type:'post',
        data:datas
    });
}

function getpagedata(action,datas,callfunc){
    $.messager.progress({
             msg: "正在发送数据..."
        }); 
    $.ajax({
        url: action,
        success: function(data){
            $.messager.progress("close"); 
            var pattern = /<body[^>]*>((.|[\n\r])*)<\/body>/im;
            var matches = pattern.exec(data);
            if (matches) data=matches[1];
            if(callfunc!=undefined) callfunc(data);
        },
        error:function(){
             $.messager.progress("close"); 
             if(callfunc!=undefined) callfunc("broken","网络通信失败！");
        },
        data:datas
    });
}

function subformdata(frm,action,mask,callfunc){
    var ff;
    if($(frm).length>0)
        ff=$(frm);
    else
        ff=$("#"+frm);
    tresult='';
    $(ff).form('submit', {
        url:action,
        onSubmit: function(){
            $('input.easyui-textbox',$(ff)).textbox('enableValidation');
            var bVal= $(this).form('validate');
            if(bVal==true&&mask==true)
                $.messager.progress({msg: "正在发送数据..."}); 
            return bVal; 
        },
        success:function(data){
            $.messager.progress("close"); 
            var pattern = /<body[^>]*>((.|[\n\r])*)<\/body>/im;
            var matches = pattern.exec(data);
            if (matches) data=matches[1];
            if(callfunc!=undefined) callfunc(data);
        },
        error:function(){
             $.messager.progress("close"); 
             if(callfunc!=undefined) callfunc("broken","网络通信失败！");
        }
    });
}
function addRow(theGrid){
    var datagd=$("#"+theGrid);
    if("undefined"!=typeof datagd.attr("editRow")) return;
    datagd.datagrid("unselectAll");
    datagd.datagrid("insertRow",{index:0,row:{}}).datagrid("beginEdit",0);
    datagd.attr("editRow",0);
}
function editRow(theGrid){
    var datagd=$("#"+theGrid);
    if("undefined"!=typeof datagd.attr("editRow")) return;
    var row = datagd.datagrid("getSelected");
        if (row){
            var idx=datagd.datagrid("getRowIndex",row);
            datagd.datagrid("beginEdit", idx);
            datagd.attr("editRow",idx);
        }
        else
        {
            $.messager.alert('警告','您还没有选择操作行！');
        }
}
function cancelRow(theGrid){
    var datagd=$("#"+theGrid);
    if(typeof datagd.attr("editRow")=="undefined") return;
    var idx=datagd.attr("editRow");
    datagd.datagrid("cancelEdit",idx);
    datagd.datagrid("rejectChanges");
    datagd.removeAttr("editRow");
}
function saveRow(theGrid){
    var datagd=$("#"+theGrid);
    if(typeof datagd.attr("editRow")=="undefined") return;
    var idx=datagd.attr("editRow");
    if(datagd.datagrid("validateRow",idx)!=true) return;
    var callFunc=datagd.datagrid("options").onBeforeEnd;
    if(callFunc){
        var editors=datagd.datagrid('getEditors',idx); 
        var row={};
        for(i=0;i<editors.length;i++){
            //根据editor type类型的不同，有可能需要新加判断分支
            //这个三元运算符，主要是处理添加子项的时候，用户可以新建，也可以选择现有的，则需要对comobox的值做处理
            if(editors[i].type == "combobox"||editors[i].type == "datetimebox")
            {
                if(editors[i].field!='roleid')
                    row[editors[i].field] = (i == 0) ? $(editors[i].target).combobox('getText') : $(editors[i].target).combobox('getValue');
                else
                    row[editors[i].field]=$(editors[i].target).combobox('getValue');
            }
            else
                row[editors[i].field]=$(editors[i].target).val();
        }
        var bRes=callFunc.call(datagd[0],idx,row);
        if(bRes==false){
            return;
        }
    }
    datagd.datagrid('endEdit',idx); 
    datagd.removeAttr("editRow");
    datagd.datagrid('acceptChanges');
    datagd.datagrid("reload");
}
function deleteRow(theGrid){
    var datagd;
    if($(theGrid).length>0)
        datagd=$(theGrid);
    else
        datagd=$("#"+theGrid);
    if(datagd.attr("editRow")!=undefined) return;
    var row = datagd.datagrid("getSelected");
    if (row){
        var idx=datagd.datagrid("getRowIndex",row);
        $.messager.confirm("提示","是否需要删该选择项？",function(a){
            if(a==false) return;
            var callFunc=datagd.datagrid("options").onDelete;
            if(callFunc){
                var bRes=callFunc.call(datagd[0],row,idx);
                if(bRes==false) return;
            }
            datagd.datagrid("deleteRow", idx);
            datagd.datagrid('acceptChanges');
            datagd.datagrid("reload");
        })
    }
    else
    {
        $.messager.alert('警告','您还没有选择操作行！');
    }
}

function setSelection(index,row,theGrid){
    var datagd=$('#'+theGrid);
    if(datagd.attr('editRow')!=undefined  && index != datagd.attr('editRow')){
        datagd.datagrid('unselectRow',index);
        datagd.datagrid('selectRow',datagd.attr('editRow'));
    }
}
var messageHelper  = {
    show:function(title,msg,showType,timeout)
    {
        $.messager.show({
            title: title,
            msg: msg,
            showType: showType||'slide',
            timeout: timeout||5000
        });
    },
    info:function(title,msg,icon,fn){
        $.messager.alert({
            title: title,
            msg: msg,
            icon: icon||'info',
            fn: fn
        });
    }
}
var parseParam=function(param, key){
    if(!param&&!key)
        return 'a=1';
    var paramStr="";
    if(param instanceof String||param instanceof Number||param instanceof Boolean){
        paramStr+="&"+key+"="+encodeURIComponent(param);
    }else{
        $.each(param,function(i){
            var k=key==null?i:key+(param instanceof Array?"["+i+"]":"."+i);
            paramStr+='&'+parseParam(this, k);
        });
    }
    return paramStr.substr(1);
};