<%@page import="shop.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	ProductDAO dao = new ProductDAO();
	dao.deleteProduct(id);
%>
<jsp:forward page="products.jsp"/>