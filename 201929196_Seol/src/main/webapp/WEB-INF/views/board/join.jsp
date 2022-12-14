<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="csrf-token" content="{{ csrf_token() }}">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
  <meta name="author" content="GeeksLabs">
  <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
  <link rel="shortcut icon" href="resources/origin/img/favicon.png">

  <!-- Bootstrap CSS -->
  <link href="resources/origin/css/bootstrap.min.css" rel="stylesheet">
  <!-- bootstrap theme -->
  <link href="resources/origin/css/bootstrap-theme.css" rel="stylesheet">
  <!--external css-->
  <!-- font icon -->
  <link href="resources/origin/css/elegant-icons-style.css" rel="stylesheet" />
  <link href="resources/origin/css/font-awesome.css" rel="stylesheet" />
  <!-- Custom styles -->
  <link href="resources/origin/css/style.css" rel="stylesheet">
  <link href="resources/origin/css/style-responsive.css" rel="stylesheet" />
  <!-- ajax -->
  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
   <!-- Tree -->
  <link rel="stylesheet" href="resources/Tree/css/jquery.treeview.css" />
  <link rel="stylesheet" href="resources/Tree/css/screen.css" />
  <script src="resources/Tree/lib/jquery.js" type="text/javascript"></script>
  <script src="resources/Tree/lib/jquery.cookie.js" type="text/javascript"></script>
  <script src="resources/Tree/lib/jquery.treeview.js" type="text/javascript"></script>
  <!-- Custom -->
  <link href="resources/custom/css/popupGroup.css" rel="stylesheet" />
  <script src="resources/custom/js/join.js"></script>
  
  <script>
  function check_file(){
  	$(".fileName").text($("#file").val());
  }
  </script>
  <style type="text/css">
  	table{
  		width: 100%;
  	}

  	.file{
	    margin-top: 5px;
	    margin-bottom: 5px;
  	}
  </style>
</head>
<body class="login-img3-body">
<div class="container">

    <form class="login-form" name = "joinForm" action="joinAction" method = "post" 
    	style="max-width: 550px; margin-top: 100px;"onsubmit="return formCheck();" enctype="multipart/form-data">
      <div class="login-wrap">
        <p class="login-img"><i class="icon_lock_alt"></i></p>
			<table>
				
				<tr>
					<td rowspan = "3" style="width:160px; height:200px;">
						<img src="resources/custom/img/noImage.jpg" id="blah" width="160" height="200" alt="">
					</td>		
					<td>
						<div class="input-group" style="width:100%;">
				          <span class="input-group-addon"><i class="icon_profile"></i></span>
				          <input type="text" class="form-control" name = "name" placeholder="????????? ??????????????????.." autofocus>
				        </div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="input-group" style="width:100%;">
				          <span class="input-group-addon"><i class="icon_profile"></i></span>
				          <input type="text" class="form-control" name = "email" placeholder="???????????? ??????????????????.." autofocus>
				        </div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="input-group" style="width:100%;">
				          <span class="input-group-addon"><i class="icon_profile"></i></span>
				          <input type="text" class="form-control" name = "phone" placeholder="????????? ????????? ??????????????????.." autofocus>
				        </div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="file" class="file" name = "file" id = "file" onchange="readURL(this);">
					</td>
				</tr>
				<tr>	
					<td colspan="2">
						<div class="input-group" style="width:100%;">
				          <span class="input-group-addon"><i class="icon_profile"></i></span>
				          <input type="text" class="form-control" name = "id" placeholder="???????????? ??????????????????.." autofocus
				          		id = "idzon" oninput="check_id();">
				        </div>
				        <div class = "id-text">
				        </div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="input-group" style="width:100%;">
				          <button type="button" class="form-control" name = "group" autofocus onclick="click_group();"
				          		style="width: 160px; border:0; margin-left:34%; background:#D6E3F4; border-radius:10px; color:white;">
				          		??????/?????? ????????????
				          		</button>
				        </div>
				        <div class = "group-text">
        				</div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="input-group" style="width:100%;">
				          <span class="input-group-addon"><i class="icon_key_alt"></i></span>
				          <input type="password" class="form-control" name = "pw" placeholder="??????????????? ??????????????????.."
				          		id = "pw" oninput="check_pw();">
				        </div>
				        <div class = "pw-text">
				        </div>
			        </td>
		        </tr>
		        <tr>
			        <td colspan="2">
				        <div class="input-group" style="width:100%;">
				          <span class="input-group-addon"><i class="icon_key_alt"></i></span>
				          <input type="password" class="form-control" placeholder="??????????????? ?????? ??? ??????????????????.."
				          		id = "checkPw" oninput="check_pw();">
				        </div>
				        <div class = "ok-text">
				        </div>
			        </td>
		        </tr>
			</table>
				<input type = "hidden" id = "dept" name="dept_no" value = "">
	      		<input type = "hidden" id = "rank" name="rank_no" value = "">
	<button class="btn btn-primary btn-lg btn-block" type="submit" id = "joinSubmit" disabled>??????</button>
      </div>
    </form>
  </div>
  
  	<!-- popupGroup -->
<div class = "group" id = "popupGroup">	
	<div class = "group-head">
		<h1 class = "zTree-h1"> ??????/?????? ?????? </h1>
		<button class = "close-button" type = "button" onclick="close_group();">??????</button>
	</div>
	<div class = "group-body">
		<div class = "dept">
			<div class = "dept-head">
				?????? ??????
			</div>
			<div class = "dept-body">
				<div id="sidetree">
					<ul id="tree"> 
						
						<li>
							<input class = "tree-button" type = "button" name = "1" value = "??????" onclick="click_dept(name,value);">
						</li>
						<li>
							<input class = "tree-button" type = "button" name = "2" value = "??????" onclick="click_dept(name,value);">
						</li>
						<li>
							<input class = "tree-button" type = "button" name = "3" value = "??????" onclick="click_dept(name,value);">
						</li>
						<li>
							<input class = "tree-button" type = "button" name = "4" value = "????????????" onclick="click_dept(name,value);">
								<ul>
									<li>
										<input class = "tree-button-sub" type = "button" name = "5" value = "??????1???" onclick="click_dept(name,value);">
									</li>
								</ul>
								<ul>
									<li>
										<input class = "tree-button-sub" type = "button" name = "6" value = "??????2???" onclick="click_dept(name,value);">
									</li>
								</ul>
						</li>
						<li>
							<input class = "tree-button" type = "button" name = "7" value = "?????????" onclick="click_dept(name,value);">
						</li>
						<li>
							<input class = "tree-button" type = "button" name = "8" value = "IT" onclick="click_dept(name,value);">
								<ul>
									<li>
										<input class = "tree-button-sub" type = "button" name = "9" value = "??????1???" onclick="click_dept(name,value);">
									</li>
								</ul>
								<ul>
									<li>
										<input class = "tree-button-sub" type = "button" name = "10" value = "??????2???" onclick="click_dept(name,value);">
									</li>
								</ul>
								<ul>
									<li>
										<input class = "tree-button-sub" type = "button" name = "11" value = "??????3???" onclick="click_dept(name,value);">
									</li>
								</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class = "position">
			<div class = "position-head">
				?????? ??????
			</div>
			<div class = "position-body">
				<input class= "position-button" type = "button" name = "1" value = "??????" onclick="click_rank(name,value);">
				<input class= "position-button" type = "button" name = "2" value = "??????" onclick="click_rank(name,value);">
				<input class= "position-button" type = "button" name = "3" value = "??????" onclick="click_rank(name,value);">
				<input class= "position-button" type = "button" name = "4" value = "??????" onclick="click_rank(name,value);">
				<input class= "position-button" type = "button" name = "5" value = "??????" onclick="click_rank(name,value);">
				<input class= "position-button" type = "button" name = "6" value = "??????" onclick="click_rank(name,value);">
				
				<!-- <ul>
					<li>??????</li>
					<li>??????</li>
					<li>??????</li>
					<li>??????</li>
					<li>??????</li>
				</ul> -->
			</div>
		</div>
		<div class = "group-foot">
			<div class = "result-view-zone">
				<div class = "result-dept">
				</div>
				<div class = "result-rank">
				</div>
			</div>
		</div>
		<button class = "ok-button" type= "button" onclick="click_Ok();">??????</button>
		
	</div>	
</div>
  
</body>
<script type="text/javascript">
function readURL(input) {     
	if (input.files && input.files[0]) {         
		var reader = new FileReader();         
		reader.onload = function(e) {            
			$('#blah').attr('src', e.target.result)            
			.width(width)            
			.height(height);        
			};       
			reader.readAsDataURL(input.files[0]);     
			} 
	}
</script>
</html>
