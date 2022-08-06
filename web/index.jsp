<%-- 
    Document   : index
    Created on : 2022/7/15, 上午 10:35:25
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
    <body>
        <c:choose>
            <c:when test="${user == null}">
                <header class="header ">
                    <nav class="header__nav">
                        <a class="header__logo">
                            <img class="logo" src="pic/header.png" alt="記帳本圖片">
                        </a>
                        <h1 class="menu__item">記帳本</h1>
                    </nav>
                </header>
                <div align="center">
                    <h2>---歡迎~請先登入!---</h2>
                    <form action="loginController">
                        帳號:<input type="text" name="username" required/><br>   
                        密碼:<input type="password" name="password" required/><br>
                        <input type="submit"/><input type="reset"required/>
                    </form>
                </div>
            </c:when>
            <c:otherwise>
                <header class="header ">
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
                    <a class="header__subMenu-cart pc-none" href="logoutController">
                        <i class="fa-solid fa-cart-shopping icon"></i>
                        <span class="text--white">登出</span>
                    </a>
                </div>
                </header>
                
                <div align="center">
                    <h2>---您已登入---</h2>
                    <h2>---請直接選取您需要的操作---</h2>
                </div>
                <h2 align="center" class="pc-none" >
                    <a class="menu__link menu__link--red" href="new.jsp" style="color:blue;">●新增</a>
                    <a class="menu__link " href="search.jsp" style="color:blue;">●查詢</a>
                </h2>
            </c:otherwise>
        </c:choose>
    </body>
</html>
