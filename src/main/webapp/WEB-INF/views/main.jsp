<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <style>
      table td a {
        display: block;
        width: 100%;
        height: 100%;
        color: black;
        text-decoration: none;
      }
    </style>
  </head>
  <body>
    <div>Main! - HTML</div>
    <br>
    <div><a href="/board/list">/board/list BoardController list() /board/list.jsp</a></div>
    <div><a href="/board_our/list">/board_our BoardOURController list() /board_our/list.jsp</a></div>
    <div><a href="/notice/list">/notice NoticeController list() /notice/list.jsp</a></div>
    <div><a href="board_our/jstlformats">jstl_formats.jsp</a></div>
    <div><a href="/commonCodeOur/list">commonCodeOur/list.jsp</a></div>
    <div><a href="/commonCodeOur/listPagination/1">commonCodeOur/list_pagination.jsp</a></div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
