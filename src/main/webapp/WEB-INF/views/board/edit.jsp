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
  </head>
  <body>
    <div>/board/edit</div>
    <div class="container">
      <form action="/board/list" method="post">
        <div class="input-group">
          <label class="input-group-text" for="">제목</label>
          <input type="text" name="title" id="" class="form-control" value="손흥민 9경기 만에 득점포! 마스크 벗고 포효" />
        </div>
        <div class="input-group mt-2">
          <label for="" class="input-group-text">내용</label>
          <textarea name="" id="" cols="" rows="10" class="form-control" style="resize: none">
답답한 수비 전술로 비판을 받은 콘테 감독은 또한번 스리백을 꺼내든 가운데, 손흥민은 왼쪽 공격수로 선발 출전해 토트넘의 공격을 이끌었습니다.

그러나 이번 시즌 내내 계속된 매끄럽지 않은 공격 흐름은 전반에도 이어졌습니다.

전반을 득점없이 마친 토트텀, 그러나 후반 시작과 함께 골잡이 해리 케인이 머리로 선제골을 뽑아내며 단숨에 흐름을 뒤바꿨습니다.

그리고 5분 만에 해리 케인은 또 한번 크리스털 팰리스의 골망을 흔들며 분위기를 완전히 가져왔습니다.

공격이 살아나자, 손흥민에게도 점점 기회가 찾아왔고, 패널티박스 안에서 침착한 패스로 도허티의 쐐기골을 도우며 예열을 시작했습니다.

그리고 마침내 손흥민의 발끝에서도 골이 터졌습니다.

후반 27분 손흥민은 중원에서 길어넘어온 공을 침착하게 왼발 슈팅으로 마무리했습니다.

무려 9경기 만에 터진 손흥민의 리그 4호골입니다.

그간의 마음 고생을 보여주듯 손흥민은 마스크를 강하게 집어 던지며 포효했습니다.

그리고 그토록 기다리건 찰칵 세리머니로 새해 부활을 알렸습니다.

안면 골절이후 처음 네 달 만에 득점포를 가동한 손흥민은 다시 특유의 웃음을 되찾았습니다.

손흥민이 부활을 알린 토트넘은 크리스털 팰리스를 대파하고 다시 4위 경쟁에 불을 지폈습니다.</textarea
          >
        </div>
        <div>
          <button class="btn btn-outline-info float-right mt-2">수정</button>
        </div>
      </form>
    </div>
  </body>
</html>
