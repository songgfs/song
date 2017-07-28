/**
 * Created by del on 2017/7/17.
 */
function testUser() {
    alert("请先登录");
    document.getElementById("pdiv").style="display:' '";
}
function addPing(){
    var li=document.createElement("li");
    li.setAttribute("id","oth");
    li.setAttribute("onclick","delPing()");
    li.innerHTML=document.getElementById("ptext").value;
    var image=document.createElement("img");
    image.setAttribute("src","img/03.jpg");
    var ol=document.getElementById("pol");
    ol.appendChild(li);
    li.appendChild(image);

}
function delPing(){
    if(!confirm("确认要删除这条评论吗？")){
        window.event.returnValue = false;
    }else{
        var ol=document.getElementById("pol");
       // var li=document.getElementById("oth");
        var li=document.getElementsByClassName("li");
        var a;
        for(var i=0;i<li.length;i++){
            a=li[i];
            a.index=i;
        }




    }
}
function upFunction(){
    var li=document.createElement("li");
    li.setAttribute("id","rright");
    li.innerHTML=document.getElementById("text").value+" @#";
    var ul=document.getElementById("list");
    ul.appendChild(li);

}
function lookFunction(){
    document.getElementById("edit").style="display:' '";
}
var w;
function oneFunction(){
    w=window.open('send.html','', 'width=460,height=500');
    w.focus();
}

function test(){
    //登录成功
    var name=document.getElementById("user").value;
    var pwd=document.getElementById("password").value;
    if(name=="zhangle" && pwd==1234){
        document.getElementById("zhuce").style="display:none";
        var l=document.getElementById("deng");
        l.innerHTML="欢迎 "+document.getElementById("user").value+" 您的使用";
        l.style="color: lightskyblue";
        document.getElementById("person").style="display:' '";
    }
    //登录失败
    else if(name!="zhangle" || pwd!=1234){
        alert("用户名或密码出错");
    }
}
function makesure(){
    if(!confirm("确认提交修改后的个人信息")){
        window.event.returnValue = false;
        document.getElementById("edit").style="display:' '";
    }
}