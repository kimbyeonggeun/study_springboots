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
    <div>board/list</div>
    <div class="container">
      <div class="fs-3">Board</div>
      <table class="table table-hover text-center">
        <thead>
          <tr>
            <th class="col-md-1">number</th>
            <th>Title</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td><a href="/board/view">Title_1</a></td>
          </tr>
        </tbody>
      </table>
      <a href="/board/form" class="btn btn-outline-info float-right" style="color: black">글쓰기</a>
    </div>
    <br />
    <div><a href="/board/form">/board/form BoardController form() /board/form.jsp</a></div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
