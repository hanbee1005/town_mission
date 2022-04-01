package kr.hanbee.townmission.dto.mission.request;

import kr.hanbee.townmission.constant.MissionCategoryType;
import kr.hanbee.townmission.constant.MissionParentCategoryType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MissionCategoryRequest {
    private MissionParentCategoryType parentType;
    private MissionCategoryType type;
    private Integer ordinal;
}
