package kr.hanbee.townmission.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MissionCategoryType {
    // 외식_매장
    SERVING("서빙"), COOKING("요리"), BEVERAGE("음료 제조"),
    KITCHEN_HAND("주방 보조"), DISH_WASHER("설거지"),
    STORE_MANAGER("매장 관리"), SALES_MANAGER("판매 관리"),
    RESTAURANT("음식점"), CAFE("카페"),
    PUB("주점"), MART("편의점･마트"),
    // 배달_운송
    PICKUP_FOOD("음식 배달"), PICKUP_CONVENIENCE_STORE("편의점 배달"),
    REPLACEMENT_DRIVER("대리 운전"), QUICK_PICKUP("퀵 배달"),
    PARCEL("택배 배달"), BAGGAGE("탁송"), CARGO_TRANSPORT("화물 운송"),
    // 홈케어
    HOME_CLEANING("집 청소"), MOVE_CLEANING("이사 청소"), LAUNDRY("세탁"),
    SEPARATE_GARBAGE("분리수거"), APPLIANCES_AFTER_SERVICE("가전 설치･수리･청소"),
    INTERIOR("인테리어"), ASSEMBLE("가구 조립"), CAREGIVER("간병"),
    // 생활_심부름
    CHILD_HELPER("아이 등･하원"), CARE_PET("반려동물 돌봄"), WALKING_PET("반려동물 산책"),
    OPEN_RUN("줄서기"), PURCHASE("구매 대행"), ACTING_GUEST("하객 대행"),
    ACCOMPANY("동행"), CAR_WASH("세차"), CATCHING_BUG("벌레 잡기"),
    CHANGE_LIGHT("전구 교체"),
    // IT_디자인_비즈니스
    DOCUMENT("문서 작성"), TRANSLATE("통･번역"), DATA_LABEL("데이터 라벨링"),
    PRINT_PRODUCE("인쇄물 제작"), SNS_MARKETING("SNS 마케팅"), MUSIC_VIDEO_PRODUCE("음악/영상 제작"),
    SOFTWARE_DEVELOP("웹/앱 개발"), SERVER_DEVELOP("서버/백엔드 개발"), FRONTEND_DEVELOP("프론트엔드 개발"),
    GRAPHIC_DESIGNER("그래픽 디자이너"), UI_UX_DESIGN("UI/UX 디자인"), BX_CX_DESIGN("BX/CX 디자인"),
    // 교육_과외
    ELEMENTARY_CLASS("초등학교 수업"), MIDDLE_HIGH_CLASS("중･고등학교 수업"), LANGUAGE_CLASS("외국어 수업"),
    ART_ATHLETICS_CLASS("예체능 수업"), CONSULTING("논문･취업 컨설팅");

    private final String name;
}
