	window.onload = function() {
		var btn = document.querySelector('input');
		var text = document.querySelector('textarea');
		var list = document.querySelector('#list');
		var colors = [ "red", "pink" ];
		var nub = 0;
		btn.onclick = function() {
			if (text.value.trim() == "") {
				alert("打点字吧");
				return false;
			}
			var li = document.createElement("li");
			li.innerHTML = text.value;
			// li.className = colors[nub%colors.length];
			/* 判断a标签已经被添加，就让a标签显示出来，否则就添加 */
			if (list.children[0] && list.children[0].className == "red") {
				li.className = "pink";
			} else {
				li.className = "red";
			}
			var a = null;
			li.onmouseover = function() {
				if (a) {
					a.style.display = "block";
				} else {
					a = document.createElement("a");
					a.href = "javascript:;";
					a.className = "clos";
					a.innerHTML = "删除";
					a.onclick = function() {
						list.removeChild(this.parentNode);
					};
					this.appendChild(a);
				}
			};
			li.onmouseout = function() {
				a.style.display = "none";
			};
			list.insertBefore(li, list.children[0]);
			text.value = "";
			nub++;
		};
	};