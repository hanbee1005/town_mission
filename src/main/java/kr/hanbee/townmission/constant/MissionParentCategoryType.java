package kr.hanbee.townmission.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static kr.hanbee.townmission.constant.MissionCategoryType.*;

@Getter
@RequiredArgsConstructor
public enum MissionParentCategoryType {
    FOOD_STORE("외식･매장"
            , Arrays.asList(SERVING, COOKING, BEVERAGE, KITCHEN_HAND, DISH_WASHER, STORE_MANAGER, SALES_MANAGER,
            RESTAURANT, CAFE, PUB, MART)
    ),
    DELIVERY("배달･운송"
            , Arrays.asList(PICKUP_FOOD, PICKUP_CONVENIENCE_STORE, REPLACEMENT_DRIVER, QUICK_PICKUP, PARCEL, BAGGAGE, CARGO_TRANSPORT)
    ),
    HOME_CARE("홈케어"
            , Arrays.asList(HOME_CLEANING, MOVE_CLEANING, LAUNDRY, SEPARATE_GARBAGE, APPLIANCES_AFTER_SERVICE, INTERIOR, ASSEMBLE, CAREGIVER)
    ),
    ERRAND("생활 심부름"
            , Arrays.asList(CHILD_HELPER, CARE_PET, WALKING_PET, OPEN_RUN, PURCHASE, ACTING_GUEST,
            ACCOMPANY, CAR_WASH, CATCHING_BUG, CHANGE_LIGHT)
    ),
    IT_DESIGN_BUSINESS("IT･디자인･비즈니스"
            , Arrays.asList(DOCUMENT, TRANSLATE, DATA_LABEL, PRINT_PRODUCE, SNS_MARKETING, MUSIC_VIDEO_PRODUCE,
            SOFTWARE_DEVELOP, SERVER_DEVELOP, FRONTEND_DEVELOP, GRAPHIC_DESIGNER, UI_UX_DESIGN, BX_CX_DESIGN)
    ),
    EDUCATION_LESSON("교육･과외"
            , Arrays.asList(ELEMENTARY_CLASS, MIDDLE_HIGH_CLASS, LANGUAGE_CLASS, ART_ATHLETICS_CLASS, CONSULTING)
    ),
    ETC("기타", Collections.EMPTY_LIST);

    private final String name;
    private final List<MissionCategoryType> categories;

}
