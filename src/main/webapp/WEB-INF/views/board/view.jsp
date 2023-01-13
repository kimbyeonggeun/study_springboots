<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  </head>
  <body>
    <div>board/view</div>
    <div class="container">
    ${boardBean}
      <div class="fs-3 text-center">${boardBean.title}</div>
      <div class="border rounded mt-2 bg-primary bg-opacity-10">
        ${boardBean.content}
      </div>
      <div class="mt-2">
        <a href="/board/edit" class="btn btn-outline-info float-right text-dark">수정</a>
        <a href="/board/list" class="btn btn-outline-info float-right text-dark">뒤로가기</a>
      </div>
    </div>
  </body>
</html>
