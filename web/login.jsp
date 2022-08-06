<%-- 
    Document   : login
    Created on : 2022/7/19, 上午 09:20:58
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/newcss.css">
        <title>project2.0</title>
    </head>
    <body>
        <header class="header ">
            <div class="header__mobileBtn pc-none">
                <a class="text--white" href="index.jsp">回前頁</a> 
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
                <a class="header__subMenu-member mb-none" href="index.jsp">
                    <span class="text--white">回前頁</span>
                </a>
                <a class="header__subMenu-cart" href="index.jsp">
                    <i class="fa-solid fa-cart-shopping icon"></i>
                    <span class="text--white">回首頁</span>
                </a>
                 <a class="header__subMenu-cart pc-none" href="logoutController">
                    <i class="fa-solid fa-cart-shopping icon"></i>
                    <span class="text--white">登出</span>
                </a>
            </div>
        </header>
        <h2 align="center">---歡迎${username}~您已成功登入!---</h2>
        <h2 align="center">---請直接選取您需要的操作---</h2>
        <h2 align="center" class="pc-none">
            <a href="new.jsp" style="color:blue;">●新增</a>
            <a href="search.jsp" style="color:blue;">●查詢</a>
        </h2>


    </body>
</html>
