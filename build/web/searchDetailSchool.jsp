<%-- 
    Document   : searchDetailSchool
    Created on : 2022/7/15, 下午 03:05:14
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
    <body align="center">
        <header class="header ">
            <div class="header__mobileBtn pc-none">
                <a class="text--white" href="search.jsp">回前頁</a> 
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
                <a class="header__subMenu-member mb-none" href="search.jsp">
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
        <h2>---School記帳本查詢系統---</h2>
        <h4 style="color:red;">若想查找所有資料,請輸入"ALL"</h4>
        <form action="ViewController">
            姓名:<input type="text" name="name" value="ALL" required/>
            <input type="submit" value="查詢" />
            <input type="hidden" name="set" value="school"/>
        </form>
    </body>
</html>
