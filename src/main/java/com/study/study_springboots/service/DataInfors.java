package com.study.study_springboots.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.study.study_springboots.beans.BoardBean;

@Service
public class DataInfors {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "요주의랩");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListData() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors DataInfors = new DataInfors();
        HashMap<String, String> searchForm = DataInfors.getSearchFormData();
        ArrayList<String> tablesListWithString = DataInfors.getTablesListData();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        return bundlesData;
    }

    public BoardBean getDataWithMemberBean() {
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }

    public BoardBean getDataWithMemberBean(String data) {
        ArrayList<BoardBean> memberList = getDataListWithBoardBean();
        BoardBean boardBean = new BoardBean();
        for (BoardBean board : memberList) {
            if (data.equals(board.getTitle())) {
                boardBean.setContent(board.getContent());
                boardBean.setDate(board.getDate());
                boardBean.setTitle(board.getTitle());
                boardBean.setUserName(board.getUserName());
                return boardBean;
            }
        }
        boardBean.setTitle("error");
        boardBean.setContent("error");
        boardBean.setUserName("@error");
        boardBean.setDate("error");

        return boardBean;
    }

    public ArrayList<BoardBean> getDataListWithBoardBean() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("성층권 머물며 지면 샅샅이 정찰… 위성으로 원거리 조종 가능");
        boardBean.setContent("지난해 말 북한의 드론(소형 무인기)이 수도권 상공을 침범했다."
                + " 백주 대낮에 경기 북부와 서울 한복판을 휘젓고 다녔다."
                + " 군은 드론을 포착했으나 격추시키지 못했다."
                + " 드론에 우리 하늘이 속수무책으로 뚫린 것이다."
                + " 이번 사태는 드론 기술의 발전과 궤를 같이한다."
                + " 날개 길이 1m 이내의 아주 작은 드론이 더 빠르게, 더 멀리 그리고 더 높게 날 수 있는 능력을 갖게 되며 대응에 어려움을 겪게 된 것이다."
                + " 전문가들은 북한의 드론이 한국 전역의 하늘을 위협하는 상황이 펼쳐질 수도 있다고 전망한다.");
        boardBean.setUserName("고재원 기자");
        boardBean.setDate("2023-01-13");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("시름하는 중국, 활짝 웃는 베트남…애플·레고·코카콜라 몰려온다");
        boardBean.setContent("베트남 경제가 지난해 8%대 성장률을 기록했다."
                + " 시름하는 중국 경제의 대안으로 떠오른 점이 최근 베트남 경제의 높은 성장을 이끌고 있다."
                + "베트남 통계청(GSO)은 지난달 29일 2022년 국내총생산(GDP) 성장률이 8.02%로 집계됐다고 밝혔다."
                + " 한해 전인 2021년 2.58%보다 세배 넘게 성장했고, 2022년 목표치였던 6.0~6.5%를 훌쩍 넘긴 수치였다."
                + " <로이터> 통신은 베트남 경제가 1997년 이후 최고 성장률을 기록했다며, 코로나19 대유행이 끝나 국민들의 소비 여력이 높아졌고, 지역 내 제조업 공장들이 생산을 재개한 점을 성장의 원인으로 꼽았다."
                + " 세계 경제엔 저성장의 그림자가 드리웠지만, 국제통화기금(IMF)은 지난해 4월 발간한 ‘세계 경제 전망’ 보고서를 통해 베트남이 2023년부터 2027년까지 연평균 6.96% 성장률을 기록할 것이라 예측했다.");
        boardBean.setUserName("김미향 기자");
        boardBean.setDate("2023-01-12");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("혹한기 훈련 태백 군부대 이등병, 연병장 텐트서 잠자다 숨져");
        boardBean.setContent("12일 오전 6시 54분께 강원 태백의 한 육군 부대에서 혹한기 훈련을 받던 병사가 숨졌다."
                + "13일 경찰 등에 따르면 이등병 A씨는 추운 날씨에 적응하는 '내한 훈련'을 위해 연병장에 설치한 텐트에서 잠을 자다가 숨진 것으로 알려졌다."
                + "경찰과 군 당국은 정확한 사고 원인을 조사하고 있다.");
        boardBean.setUserName("양지웅 기자");
        boardBean.setDate("2023-01-13");
        membersList.add(boardBean);

        return membersList;
    }

    public BoardBean addData(HashMap<String, String> data) {
        String title = data.get("title");
        String content = data.get("content");
        String userName = data.get("userName");
        String date = data.get("date");

        BoardBean boardBean = new BoardBean();
        boardBean.setContent(content);
        boardBean.setDate(date);
        boardBean.setTitle(title);
        boardBean.setUserName(userName);

        return boardBean;
    }
}
