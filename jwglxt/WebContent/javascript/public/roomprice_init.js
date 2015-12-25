function roomprice_init(){
    var Status = [{ 'value': '1', 'text': '正常' }, { 'value': '2', 'text': '禁用'}];
    $("#${tv}grid").datagrid({
        iconCls : 'icon-search',
        singleSelect : true,
        striped : true,
        toolbar : '#${tv}tbar',
        fit : false,
        fitColumns:true,
        pagination : true,
        pageSize:10,
        //url:'./javascript/roomdatagrid.json',
        url:'getRoom',
        //method: 'get',
        columns : [[
            {
                field : 'roomname',
                title : '房间名称',
                width : 70
            },
            {
                field : '',
                title : '选择',
                width : 20,
                checkbox : true
            },
            {
                field : 'roomid',
                title : '房间ID',
                width : 70,
                hidden:true
            }
        ]],
        view: detailview,
        detailFormatter:function(index,row){
            return '<div style="padding:2px"><table class="ddv"></table></div>';
        },
        onExpandRow: function(index,row){
            var ddv = $(this).datagrid('getRowDetail',index).find('table.ddv');
            ddv.datagrid({
                url:'getRoomPrice?roomid='+row.roomid,
                // data:[{"roomid":row.roomid,"weekday":"星期一","time":"10:00-14:00","hourprice":10,"roomsize":2},{"roomid":row.roomid,"weekday":"星期二","time":"10:00-14:00","hourprice":20,"roomsize":4}],
                /*fitColumns:true,*/
                singleSelect:true,
                rownumbers:true,
                loadMsg:'',
                height:'auto',
                columns:[[
                    {field:'roomid',title:'房间ID',width:100},
                    {field:'weekday',title:'星期',width:200},
                    {field:'time',title:'时间段',width:100},
                    {field:'hourprice',title:'一小时单价',width:100},
                    {field:"roomsize",title:'房间大小',width:70,align:'right'}
                ]],
                onResize:function(){
                    $("#${tv}grid").datagrid('fixDetailRowHeight',index);
                },
                onLoadSuccess:function(){
                    setTimeout(function(){
                        $("#${tv}grid").datagrid('fixDetailRowHeight',index);
                    },0);
                }
            });
            $("#${tv}grid").datagrid('fixDetailRowHeight',index);
        }
    });

    //给星期控件赋值
    /* 多选取值$('#week').combobox('getText') $('#week').combobox('getText').split(',')$('#week').combobox('getText').split(',')[0]  $('#cc').combobox('getValues')*/
    $('#week').combotree({
        url: './javascript/week.json',
        method: 'get',
        valueField: 'id',
        textField: 'text',
        panelHeight: 'auto'
    });

    //给房间赋值
    $('#room').combotree({
        //url:'javascript/room.json'
        url:'./javascript/room.json',
        method:'get',
        valueField:'id',
        textField:'text',
        panelHeight:'auto'
    });

    //设置分页控件
    var p = $("#${tv}grid").datagrid("getPager");
    $(p).pagination({
        //pageSize: 10,//每页显示的记录条数，默认为10
        //pageList: [5,10,15],//可以设置每页记录条数的列表
        beforePageText: "第",//页数文本框前显示的汉字
        afterPageText: "页    共 {pages} 页",
        displayMsg: "当前显示 {from} - {to} 条记录   共 {total} 条记录",
        /*onBeforeRefresh:function(){
         $(this).pagination('loading');
         alert('before refresh');
         $(this).pagination('loaded');
         }*/
    });

}