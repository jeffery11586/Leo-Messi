<%@ page import="com.xx.entity.Product" %><%--
  Created by IntelliJ IDEA.
  User: Jeffery
  Date: 2019/9/23
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Product product= (Product)request.getAttribute("product");%>
<form action="UpdateProductServlet">
    <input type="hidden" name="id" value="<%=product.getId()%>">
    <table border="1" width="500px" height="300px" align="center">
        <tr>
            <td>商品名称</td>
            <td><input type="text" name="name" size="25" value="<%=product.getName()%>" /></td>
        </tr>

        <tr>
            <td>商品单价</td>
            <td><input type="text" name="price" size="25" value="<%=product.getPrice()%>"/></td>
        </tr>
        <tr>
            <td>商品数量</td>
            <td><input type="text" name="account" size="25" value="<%=product.getAccount()%>"/></td>
        </tr>
        <tr>
            <td>商品状态</td>
            <td>
                <input type="radio" name="status" value="0" />下架
                <input type="radio" name="status" value="1" checked="checked" />上架


            </td>

        </tr>
        <tr>
            <td>商品描述</td>
            <td>
                <textarea rows="10" cols="30" name="description" ><%=product.getDescription()%></textarea>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="保存" />
            </td>
        </tr>

    </table>
</form>
</body>
</html>
