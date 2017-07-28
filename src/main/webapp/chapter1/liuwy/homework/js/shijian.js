// JavaScript Document
//login.html 登录界面
function update(){
	document.write("a")
	}
	function entry(){
	x=document.getElementById("username").value
	y=document.getElementById("password").value
	if(x==null||x==""){
	alert("请输入用户名！")}
	else if(y==null||y==""){
	alert("请输入密码！")
	}else{ if(x=="liu"&&y=="123"){
	alert("登录成功！\n欢迎你liu！")
	var parent=document.getElementById("aa1");
var child=document.getElementById("aa");
parent.removeChild(child);
var para=document.createElement("p");

var node=document.createTextNode("欢迎您，亲爱的"+x+"!");
para.appendChild(node);

var element=document.getElementById("aa1");
element.appendChild(para);
	
		}else
		{
			alert("用户名或密码错误！")
			}
	}
	
}

function setmyimg(obj){
	document.getElementById("myimg").src=obj.src;
	}

var i=1;
function imgstart(){
document.getElementById("myimg").src="images/image"+i+".jpg";
i++;
if(i>5)
{
i=1;
	};
	setTimeout(imgstart,2000);

}
//regist.html 注册页面
function username(){
	 x=document.getElementById("username").value
	 y=document.getElementById("una")
	 if(x==""||x==null||x.length<4){
		
		 y.innerHTML="输入用户名不少于四个字符！"
		 y.style.color="#F00"
		 
		 }else{
			
			 y.innerHTML="输入正确！"
			 y.style.color="#3F6";
			 
			 
			 }
		 }
		 function password(){
			 username();
	 x=document.getElementById("password").value
	 y=document.getElementById("psa")
	 if(x==""||x==null||x.length<8){
		 
         y.innerHTML="设置密码不少于八个字符！"
		y.style.color="#F00"	 
		 }else{
			  
			 y.innerHTML="输入正确！"
			 y.style.color="#3F6";
			 }
	 
   }
    function copassword(){
			 username();
			 password();
	 x=document.getElementById("cofirmpassword").value
	 y=document.getElementById("password").value
	 z=document.getElementById("cpsa")
	 if(x==""||x==null||x!=y){
		
		 z.innerHTML="两次密码输入不一致！"
		 z.style.color="#F00"
		 
		 }else{
			 
			 z.innerHTML="输入正确！"
			 z.style.color="#3F6";
			 
			 }
	 
   }
    function phonenumber(){
		
			 username();
			 password();
			 copassword();
		
	 x=document.getElementById("phonenumber").value
	 y=document.getElementById("pna")
	if(x==""||x==null||x.length!=11){
		 
		 y.innerHTML="手机号输入不正确！"
		 y.style.color="#F00"
		 
		 }else{
			 
			 y.innerHTML="输入正确！"
			 y.style.color="#3F6";
			 
			 
			 }
		 }
		 

function emil(){
	
		
			 username();
			 password();
		     phonenumber();
			 copassword();
	 x=document.getElementById("emil").value
	 y=document.getElementById("ea")
	if (x.search(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) != -1){
		
			 y.innerHTML="输入正确！"
			 y.style.color="#3F6";
			 alert("注册成功！")
			 window.history.back(-1); 
		
		}

else{

			 
		 y.innerHTML="邮箱格式输入不正确！"
		 y.style.color="#F00"}
		 }

function rdel(){
	document.getElementById("username").value="";
	document.getElementById("password").value="";
	document.getElementById("cofirmpassword").value="";
	document.getElementById("phonenumber").value="";
	document.getElementById("emil").value="";
	
	}
	
	
//post.html 评论页面


function post(){
	x=document.getElementById("huifu").value
	if(x==null||x==""){
		alert("请输入回复内容！")
		}else{
var div=document.createElement("div");
div.style.textAlign="left"
var div2=document.createElement("div2");
div2.style.width="600px";
div2.style.backgroundColor="#999";
div2.style.textAlign="left";
var nodediv2=document.createTextNode("网名：liuwy");
div2.appendChild(nodediv2);
//para5.onclick=function post(){}
var date=new Date();
var y=date.getYear()+1900;
var month= date.getMonth()+1;
var d=date.getDate();
var h=date.getHours();
var m=date.getMinutes();
var s=date.getSeconds();
var day=date.getDay();
//var time=document.getElementById("time");

//time.innerHTML=(y+"-"+month+"-"+d+" "+h+":"+m+":"+s);
var node6=document.createTextNode(y+"-"+month+"-"+d+" "+h+":"+m+":"+s);
div2.appendChild(node6);

	var para=document.createElement("p");
	para.style.textAlign="left"
var node=document.createTextNode(x);
para.appendChild(node);
para.id="a";


alert("回复成功！")
document.getElementById("huifu").value=""


var para3=document.createElement("hr");
var para4=document.createElement("br");
var para2=document.createElement("button");

para2.onclick=function del(){
	var x= confirm("您确认删除本条评论吗?")
	if(x==true){
	var parent=document.getElementById("div1");

parent.removeChild(this.parentNode);


 }
	
	};
para2.style.cssFloat="right";
para2.style.color="red";
var node2=document.createTextNode("删除");
para2.appendChild(node2);
var para5=document.createElement("div");

var node5=document.createTextNode("回复");
para5.appendChild(node5);
para5.onclick=function hui(){
	//alert("请在下方输入回复内容！");
var ll=prompt("请输入回复内容：");

	var cccc=document.getElementById("div1");
var huifu=document.createTextNode("回复："+ll);
cccc.appendChild(huifu);
//post();
var hr=document.createElement("hr");
cccc.appendChild(hr);
	
	};

var element=document.getElementById("div1");
div.appendChild(div2);
div.appendChild(para);
div.appendChild(para3);
div.appendChild(para4);
div.appendChild(para2);
div.appendChild(para5);

element.appendChild(div);

}
	}
	
/*community.html 社区公告*/
function changeColor(){ 
var color="#00f|red"; 
color=color.split("|"); 
document.getElementById("blink").style.color=color[parseInt(Math.random() * color.length)]; 
} 
setInterval("changeColor()",200); 
	
