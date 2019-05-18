
			//添加颜色尺码
			function addnode(){
				var option = $(".options").last().clone(false);				
				$(".options").last().after(option) ;
				
			}
			//删除颜色尺码
			function deletnode(){
				var length = $(".options").length
			
				if(length > 1){
					$(".options").last().remove();
				}else{
					alert("最少要有一条数据，不能再删除了！");
				}
				
			}
		    
		    //点击图片改变图片
			function click_image(index) {
				$("#file_" + index).click();

			}
			//替换图片
			function replace_image(index) {
				//获得图片对象
				var blob_image = $("#file_" + index)[0].files[0];
				//alert(blob_image);
				var urls = window.URL.createObjectURL(blob_image);
				
				//替换image
				$("#image_" + index).attr("src", urls);

				var length = $(":file").length;

				if((index + 1) == length) {
					//用户选择的是最后一张图片就添加，否则替换
					add_image(index);
				}
				
				//添加图片
				function add_image(index) {
					var a = '<div id="d_' + (index + 1) + '" style="float: left;margin-left: 10px;border: 1px solid #cccccc;">';
					var b = '<input type="file" name="files" id="file_' + (index + 1) + '" style="display: none;"  onchange="replace_image(' + (index + 1) + ')" />';
					var c = '<img id="image_' + (index + 1) + '" onclick="click_image(' + (index + 1) + ')" style="cursor: pointer;" width="100px" height="100px" src="images/shangchan.png"/>'
					var d = '</div>';
					$("#d_" + index).after(a + b + c + d);
				}

			};
			
			$(function(){			
			//添加商品提交
			/*$(".addsubmit").click(function(){
				//alert(0);
				var pname=$(".pname").val().trim();
				var price=$(".price").val().trim();
				//alert(!isNaN(price));
				var colors=$(".colors").val();
				alert(colors);
				if(pname != ''&& price !='' && !isNaN(price)){
					$("form").submit();
				}
				
			});*/
	
			});
