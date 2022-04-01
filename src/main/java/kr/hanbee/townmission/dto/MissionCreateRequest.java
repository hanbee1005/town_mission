package kr.hanbee.townmission.dto;

import kr.hanbee.townmission.constant.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class MissionCreateRequest {
    // about mission
    private StatusType status;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private YesOrNoType adjustedYn;
    private YesOrNoType contactYn;
    private Integer pay;
    private SettlementType settlementType;
    private String description;

    // about category
    private List<MissionCategoryRequest> categories;

    // about address

    // about attachment

    // about question
}
