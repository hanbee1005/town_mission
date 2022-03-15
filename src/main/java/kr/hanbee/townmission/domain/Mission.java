package kr.hanbee.townmission.domain;

import kr.hanbee.townmission.constant.SettlementType;
import kr.hanbee.townmission.constant.StatusType;
import kr.hanbee.townmission.constant.YesOrNoType;
import kr.hanbee.townmission.dto.MissionCreateRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "missions")
public class Mission extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private StatusType status;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private YesOrNoType adjustedYn;
    private String postalCode;
    private YesOrNoType contactYn;
    private Integer pay;
    private SettlementType settlementType;
    private String description;

    public Mission(MissionCreateRequest request) {
        this.status = request.getStatus();
        this.startAt = request.getStartAt();
        this.endAt = request.getEndAt();
        this.adjustedYn = request.getAdjustedYn();
        this.postalCode = request.getPostalCode();
        this.contactYn = request.getContactYn();
        this.pay = request.getPay();
        this.settlementType = request.getSettlementType();
        this.description = request.getDescription();
    }
}
