<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>

</head>
<body >
<style type="text/css">
#stuDetailtable td.label{
background-color: #878E87;;
}
#stuDetailtable td { 
border-right: 1px solid #C1DAD7; 
border-bottom: 1px solid #C1DAD7; 
background: #fff; 
font-size:12px; 
} 
#stuDetailtable a {
  cursor: pointer;
}
#stuDetailtable a:HOVER {
	background-color: green;
}
#stuDetailtable a:LINK {
	border-bottom-color:gray;
}
</style>
<table  id="stuDetailtable"style="border: 0px;border-color:green;font-size: 10px;color: black;text-align: center;border-width: 0px;">
<tr>
<td colspan="1" rowspan="5" style="width:200px;height: 120px;">

</td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td colspan="1" rowspan="5" style="width:200px;height: 120px;">
<a id="${tv}up" onclick="${tv}up(${stu.id})" >
编 &nbsp;&nbsp;辑
</a>
<a id="${tv}de" onclick="${tv}de(${stu.id})">
删&nbsp;&nbsp;除
</a>
</td>
</tr>
<tr>
<td class="label" style="width:100px;">学号：</td>
<td style="width:100px;">${stu.snum}</td>
<td class="label">姓名：</td>
<td>${stu.sname}</td>
<td class="label">性别：</td>
<td>${stu.ssex}</td>
<td class="label">民族：</td>
<td>${stu.snation}</td>
</tr>
<tr>
<td  class="label" class="label" style="width:100px;">政治面貌：</td>
<td style="width:100px;">${stu.spolstatus}</td>
<td class="label">籍贯：</td>
<td>${stu.snation}</td>
<td class="label">身份证号码：</td>
<td>${stu.scard}</td>
<td class="label">学籍号：</td>
<td>${stu.snum}</td>
</tr>
<tr>
<td class="label" style="width:100px;">户口性质：</td>
<td style="width:100px;">${stu.snative}</td>
<td class="label">家长姓名：</td>
<td>${stu.spname}</td>
<td class="label">家庭地址：</td>
<td>${stu.saddress}</td>
<td class="label" style="width:100px;">联系电话：</td>
<td style="width:100px;">${stu.stelephone}</td>
</tr>
<tr>
<td class="label" style="width:100px;">住校：</td>
<td style="width:100px;">${stu.isschool}</td>
<td class="label">计划内/外</td>
<td>${stu.splan}</td>
<td class="label">享受资助情况：</td>
<td>${stu.said}</td>
<td class="label">备注</td>
<td>${stu.remark}</td>
</tr>
</table>
<div id="stu${tv}update">


</div>
<script type="text/javascript">
function ${tv}up(id)
{
	
	$('#stu${tv}update').dialog({   
	    title: 'My Dialog',   
	    width: 400,   
	    height: 200,   
	    closed: false,   
	    cache: false,   
	    href: 'stuUpdateJsp.do?id='+id+"&tv=${tv}",   
	    modal: true  
	});  
	
	}
	
function ${tv}de(id)
{
	$.messager.confirm('Confirm', 'Are you sure to exit this system?', function(r){
		var url='deleteStudent.do';
		var data={'id':id};
		if (r){
			 subwindowdata("${tv}dg", url, data, function(data){
                 bRes = $("input",$(data)).val() == "Success";
                 if(bRes == false)
                 {
                     $.messager.alert("失败", $("span", $(data)).text() || $(data).eq(0).text());
                 }
                 else{  
                     messageHelper.info("成功", $("span", $(data)).text());
                     $('#${tv}dg').datagrid('reload');  
                 }
             });
		}
	});

	 
	}
	


</script>
</body>

</html>