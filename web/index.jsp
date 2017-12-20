<%--
  Created by IntelliJ IDEA.
  User: Диана
  Date: 10.12.2017
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>my site</title>
  </head>
  <%--<body>--%>
  <%--<h1> Введите стороны треугольника для опредления его типа</h1>--%>
  <%--<form action="servlet" method="post">--%>
    <%--<div>--%>
      <%--<input type="number" name="age" value="" placeholder="Введите сторону a"> <br /> <br />--%>
      <%--<input type="number" name="b" value="" placeholder="Введите сторону b"> <br /> <br />--%>
      <%--<input type="number" name="c" value="" placeholder="Введите сторону c"> <br /> <br />--%>
    <%--</div>--%>
  <%--</form>--%>
  <%--<input type="submit" value="Определить тип" />--%>

  <%--</body>--%>

  <body>
  <h1>Введите стороны треугольника</h1>
  <!-- Форма, содержащая в себе кнопку и техтовое поле.
       По нажатию на кнопку отправит POST запрос на сервлет-->
  <form action="servlet" method="POST">
    <div>

      <%--<input type="text" name="age" value="" placeholder="Введите ваш возраст">--%>
      <input type="number" name="a" value="" placeholder="Введите сторону a" min="1"> <br /> <br />
      <input type="number" name="b" value="" placeholder="Введите сторону b" min="1"> <br /> <br />
      <input type="number" name="c" value="" placeholder="Введите сторону c" min="1"> <br /> <br />
    </div>
    <input type="submit" value="Определить тип треугольника" />
  </form>
  </body>


</html>
