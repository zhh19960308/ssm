<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客戶列表</title>
</head>
<body>
	<form name="customForm"
		action="${pageContext.request.contextPath}/findAllCustom.action"
		method="post">
		查询条件：
		<table width="100%" border=1>
			<tr>
				<td>客戶名称：<input name="hhCustom.name" />
				</td>
				<%-- <td>客戶类型： <select name="customType">
						<c:forEach items="${customType}" var="customType">
							<option value="${customType.key }">${customType.value}</option>
						</c:forEach>
				</select>
				</td> --%>
				<td><button type="submit" value="查询" >查询</button></td>

			</tr>
		</table>
		客戶列表：
		<table width="100%" border=1>
			<tr>
				<th>选择</th> 
				<th>客戶名称</th>
				<th>客戶邮箱</th>
				<th>客戶电话</th>
				<th>客户类型</th>
				<!-- <th>操作</th> -->
			</tr>
			<c:forEach items="${customlist}" var="custom">
				<tr>
					<td><input type="checkbox" name="custom_id" value="${custom.id}" /></td>
					<td>${custom.name }</td>
					<td>${custom.mail }</td>
					<td>${custom.phoneNumber }</td>
					<td>${custom.category }</td>
					<%--<td><fmt:formatDate value="${custom.birthday }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	 <td><a href="${pageContext.request.contextPath }/items/editItems.action?id=${item.id }">修改</a></td> --%>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>

</html>