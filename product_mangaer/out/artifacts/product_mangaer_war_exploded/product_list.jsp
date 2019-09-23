<%@ page import="java.util.List" %>
<%@ page import="com.xx.entity.Product" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href="product_add.jsp">新增</a>
<table border="1" width="800px" height="300px" align="center">
    <tr>
        <th>id</th>
        <th>商品名称</th>
        <th>商品描述</th>
        <th>商品单价</th>
        <th>商品数量</th>
        <th>商品状态</th>
        <th>商品上架时间</th>
        <th>操作</th>
    </tr>

    <%
       List <Product> products = (List<Product>) request.getAttribute("products");
        for (Product product:products){
            
    %>  
        <tr>
            <td><%=product.getId()%></td>
            <td><%=product.getName()%></td>
            <td><%=product.getDescription()%></td>
            <td><%=product.getPrice()%></td>
            <td><%=product.getAccount()%></td>
            <td>
                <%
                if(product.getStatus()==1){
                    
                    
                %>
                上架
                <%
                }else {
                %>
                下架
                <%
                }
                
                %>
                
            </td>
            <td><fmt:formatDate value="<%=product.getAddtime()%>" pattern="yyyy-MM-dd"/></td>
            &nbsp;&nbsp;
            <td><a href="DelectProductServlet?id=<%=product.getId()%>">删除</a>
                &nbsp;&nbsp;&nbsp;
            <a href="QueryProductByIdServlet?id=<%=product.getId()%>">修改</a>
            </td>
        </tr>
        
        
        
        
           <% 
        }

            %>

    
    
    
</table>



</body>
</html>
