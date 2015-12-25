// JavaScript Document
$(document).ready(function(){
	init();
	$("#add").click(function(){
		
		$("#select1 option:selected").appendTo("#select2");
		
		});
		
	$("#add_all").click(function(){
		
		$("#select1 option").appendTo("#select2");
		
		});
		
	$("#remove").click(function(){
		
		$("#select2 option:selected").appendTo("#select1");
		
		});	
		
	$("#remove_all").click(function(){
		
		$("#select2 option").appendTo("#select1");
		
		});	
		
		$("#select1").dblclick(function(){
			
		$("#select1 option:selected").appendTo("#select2");	
			
			});
		
				$("#select2").dblclick(function(){
			
		$("#select2 option:selected").appendTo("#select1");	
			
			});
		

	});
function init()
{
	$.ajax({
		async: false,
		type : "get",
		url : 'getRoleList.do',
		dataType : 'json',
		success : function(data) {
			var str="";
			$.each(data,function(i,n){
					//<option value="1">选项1</option>
					str+="<option value="+ n.roleid+">"+ n.rolename+"</option>";
				}
			);
			$("#select3").append(str);
		}

	})
}