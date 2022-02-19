package kr.hanbee.townmission.dto;

import kr.hanbee.townmission.constant.SettlementType;
import kr.hanbee.townmission.constant.StatusType;
import kr.hanbee.townmission.constant.YesOrNoType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MissionCreateRequest {
    // about category

    // about mission
    private StatusType status;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private YesOrNoType adjustedYn;
    private String postalCode;
    private YesOrNoType contactYn;
    private Integer pay;
    private SettlementType settlementType;
    private String description;

    // about attachment

    // about question
}
