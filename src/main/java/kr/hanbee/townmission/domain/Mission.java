package kr.hanbee.townmission.domain;

import kr.hanbee.townmission.constant.SettlementType;
import kr.hanbee.townmission.constant.StatusType;
import kr.hanbee.townmission.constant.YesOrNoType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

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
}
