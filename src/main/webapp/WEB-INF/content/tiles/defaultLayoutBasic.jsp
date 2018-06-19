<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Copyright" content="arirusmanto.com">
    <meta name="description" content="Admin MOS Template">
    <meta name="keywords" content="Admin Page">
    <meta name="author" content="Ari Rusmanto">
    <meta name="language" content="Bahasa Indonesia">
    <!--Core CSS -->
    <link rel="shortcut icon" href="sub/img/devil-icon.png"> <!--Pemanggilan gambar favicon-->
    <link rel="stylesheet" type="text/css" href="sub/mos-style.css"> <!--pemanggilan file css-->
</head>
<body>
    <div id="header">
        <div class="inHeader">
            <div class="mosAdmin">
            Welcome, <s:property value="userName"/><br>
            <a href="login.jsp">Login page</a> | <a href="">Help</a> | <a href="">Keluar</a>
            </div>
           <div class="clear"></div>
        </div>
    </div>
    <div id="wrapper">
    <div id="leftBar">
    <ul>
        <li><a href="index.html">Dashboard</a></li>
        <li><a href="<s:url action ="alluser"/>">User</a></li>
        <li><a href="<s:url action ="allorder"/>">Order</a></li>
        <li><a href="<s:url action ="allcustomer"/>">Customer</a></li>
        <li><a href="<s:url action ="alladvtype"/>">Adv Type</a></li>
        <li><a href="<s:url action ="allprice"/>">Adv Price</a></li>
    </ul>
    </div>
     <tiles:insertAttribute ignore="true" name="main" />
    <div class="clear"></div>
    <div id="footer">
        &copy; 2018 Advertising network LTD | All rights reversed. | Mainbase <a href="https://goo.gl/maps/CQ3uSThmwTx" style="color: #FFCC99" rel="nofollow" target="_blank"> #CBASE FINTECH Lab LLC</a><br>
        Support #support@cross.technology</a> 
    </div>
    </div>
</body>
</html>