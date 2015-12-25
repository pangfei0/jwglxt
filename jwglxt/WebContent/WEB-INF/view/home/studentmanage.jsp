<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理</title>
</head>
<body>
<div class="easyui-panel" data-options="fit:true">
	<div  class="easyui-panel" data-options="border:false,title:'条件查询',collapsible:true" style="height:200px;" >
		<div>
			<label>字段1：</label><input type="text" class="easyui-textbox"/><br/>
			<label>字段1：</label><input type="text" class="easyui-textbox"/><br/>
			<label>字段1：</label><input type="text" class="easyui-textbox"/><br/>
			<label>字段1：</label><input type="text" class="easyui-textbox"/><br/>
			<label>字段1：</label><input type="text" class="easyui-textbox"/><br/>
		</div>
	        <a class="easyui-linkbutton">搜索</a>
	</div>
	<div id="${tv}" class="easyui-panel" data-options="border:false,,title:'学生信息',collapsible:true,height:500px,fit:true" style="margin-top: 10px;">
	    <table id="${tv}dg" url="getStudent.do" pagination="true" sortName="snum" sortOrder="desc"  striped='true' fitColumns='true' pageSize=20 toolbar='#${tv}tbar'>
	        <thead>
	            <tr>
	                <th field="id" width="80">编号</th>
	                <th field="snum" width="80">学号</th>
	                <th field="ssex" width="100">性别</th>
	                <th field="snation" width="100">民族</th>
	                <th field="snative" width="100">籍贯</th>
	                <th field="spolstatus" width="100">政治面貌</th>
	                <th field="scard" width="100">身份证号码</th>
	                <th field="studynum" width="100">学籍号</th>
	                <th field="" width="100">户口性质</th>
	                <th field="spname" width="100">家长姓名</th>
	                <th field="saddress" width="100">家庭住址</th>
	                <th field="stelephone" width="100">联系电话</th>
	                <th field="isschool" width="100">住校</th>
	                <th field="iplan" width="100">计划内/外</th>
	                <th field="said" width="100">享受资助情况</th>
	                <th field="remark" width="100">备注</th>
	            </tr>
	        </thead>
	    </table>
	    <!-- 操作按钮 -->
			 <div id="${tv}tbar" style="padding : 2px 5px;">
			    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newStuDialog({title:'添加学生信息',href:'stuAddJsp.do',tv:'${tv}',height:500,width:800})">添加学生信息</a>
		        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="saveRow('${tv}grid')">导入学生信息</a>
		        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="stu${tv}Export()">导出学生信息</a>
			 </div>
	</div>
	<div id="stu${tv}Add"></div>
</div>
 <script type="text/javascript">
        $(function(){
            $('#${tv}dg').datagrid({
                view: detailview,
                detailFormatter:function(index,row){
                    return '<div class="ddv" style="padding:5px 0"></div>';
                },
                onExpandRow: function(index,row){
                    var ddv = $(this).datagrid('getRowDetail',index).find('div.ddv');
                    ddv.panel({
                        height:140,
                        border:false,
                        cache:false,
                        href:'stuDetail.do?id='+row.id+"&tv="+'${tv}',
                        onLoad:function(){
                            $('#${tv}dg').datagrid('fixDetailRowHeight',index);
                        }
                    });
                    $('#${tv}dg').datagrid('fixDetailRowHeight',index);
                }
            });
            //设置分页控件
            var p = $("#${tv}dg").datagrid("getPager");
            $(p).pagination({
              pageSize: 20,//每页显示的记录条数，默认为10
              pageList: [20,50,100],//可以设置每页记录条数的列表
              beforePageText: "第",//页数文本框前显示的汉字
              afterPageText: "页    共 {pages} 页",
              displayMsg: "当前显示 {from} - {to} 条记录   共 {total} 条记录",
              /*onBeforeRefresh:function(){
               $(this).pagination('loading');
               alert('before refresh');
               $(this).pagination('loaded');
               }*/
            });
        });
        function newStuDialog(options)
        {
          //添加
            $('#stu' + options.tv + 'Add').dialog({
              href: options.href,
              width: options.width || 800,
              height: options.height || 200,
              closed: false,
              modal: true,
              title: options.title,
              iconCls: 'icon-save',
              method: 'post',
              queryParams: options.data || {tv: options.tv}
            })
        }
        function stu${tv}Export()
        {
        	$.ajax({
                 url : 'exportStuExcelFile.do',
                 success : function(data) {
                     
                 }
        		
        	});
        }
  
        
    </script>
</body>
</html>