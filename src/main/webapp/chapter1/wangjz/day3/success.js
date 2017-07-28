
	var para=document.createElement("p");
	var node=document.createTextNode("这是一个新的段落！(创建的新的节点)");
	para.appendChild(node);
	var element =document.getElementById("div1");
	element.appendChild(para);
	
	function change(id){
		id.src="w.jpg";
		document.getElementById("h").innerHTML="谢谢";
	}
