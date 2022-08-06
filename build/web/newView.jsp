<%-- 
    Document   : search
    Created on : 2022/7/7, 下午 02:45:24
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/newcss.css">
        <title>project2.0</title>
    </head>
    <body align="center">
        <header class="header ">
            <div class="header__mobileBtn pc-none">
                <a class="text--white" href="new.jsp">回前頁</a> 
            </div>
            <nav class="header__nav">
                <a class="header__logo">
                    <img class="logo" src="pic/header.png" alt="記帳本圖片">
                </a>
                <h1 class="menu__item">記帳本</h1>

                <ul class="menu mb-none">
                    <li class="menu__item">
                        <a class="menu__link menu__link--red" href="new.jsp">新增</a>
                    </li>
                    <li class="menu__item">
                        <a class="menu__link" href="search.jsp">查詢</a>
                    </li>
                    <li class="menu__item">
                        <a class="menu__link" href="logoutController">登出</a>
                    </li>
                </ul>
            </nav>
            <div class="header__subMenu">
                <a class="header__subMenu-member mb-none" href="new.jsp">
                    <span class="text--white">回前頁</span>
                </a>
                <a class="header__subMenu-cart" href="index.jsp">
                    <i class="fa-solid fa-cart-shopping icon"></i>
                    <span class="text--white">回首頁</span>
                </a>
                </a>
                <a class="header__subMenu-cart pc-none" href="logoutController">
                    <i class="fa-solid fa-cart-shopping icon"></i>
                    <span class="text--white">登出</span>
                </a>
            </div>
        </header>
        <div>
            <h2>---記帳結果---</h2>
            <p>姓名:${user.name}</p>
            <p>記帳本:${book}</p>
            <p>物品:${user.product}</p>
            <p>價格:${user.price}元</p>
            <p>數量:${user.number}</p>
            <p>總額:${user.total}元</p>
        </div>
    </body>
</html>
