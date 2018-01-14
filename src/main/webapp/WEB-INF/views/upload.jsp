<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC 文件上传案例</title>
</head>
<body>
	<h1>Spring MVC 文件上传练习</h1>
	<br>
	<h3>请选择上传文件(文件大小在30M以内)</h3>
	<br>
	<form method="post" action="/SpringMVCFileUpload/doUpload"
		enctype="multipart/form-data">
		<input type="file" name="file" />
		<button type="submit">提交</button>
		<button type="reset">重置</button>
	</form>
</body>
</html>