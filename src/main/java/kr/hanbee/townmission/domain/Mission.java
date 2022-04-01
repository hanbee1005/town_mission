package kr.hanbee.townmission.domain;

import kr.hanbee.townmission.constant.SettlementType;
import kr.hanbee.townmission.constant.StatusType;
import kr.hanbee.townmission.constant.YesOrNoType;
import kr.hanbee.townmission.dto.mission.MissionCreateRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Mission extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatusType status;

    private LocalDateTime startAt;
    private LocalDateTime endAt;

    @Enumerated(EnumType.STRING)
    private YesOrNoType adjustedYn;
    @Enumerated(EnumType.STRING)
    private YesOrNoType contactYn;

    private Integer pay;
    @Enumerated(EnumType.STRING)
    private SettlementType settlementType;

    private String description;

    public Mission(MissionCreateRequest request) {
        this.status = request.getStatus();
        this.startAt = request.getStartAt();
        this.endAt = request.getEndAt();
        this.adjustedYn = request.getAdjustedYn();
        this.contactYn = request.getContactYn();
        this.pay = request.getPay();
        this.settlementType = request.getSettlementType();
        this.description = request.getDescription();
    }
}
