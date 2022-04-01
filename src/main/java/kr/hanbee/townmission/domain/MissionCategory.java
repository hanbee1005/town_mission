package kr.hanbee.townmission.domain;

import kr.hanbee.townmission.constant.MissionCategoryType;
import kr.hanbee.townmission.constant.MissionParentCategoryType;
import kr.hanbee.townmission.dto.MissionCategoryRequest;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class MissionCategory extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

    @Enumerated(EnumType.STRING)
    private MissionParentCategoryType parentType;
    @Enumerated(EnumType.STRING)
    private MissionCategoryType type;
    private String typeName;

    private Integer ordinal;

    public MissionCategory(Mission mission, MissionCategoryRequest request) {
        this.mission = mission;  // TODO: 연결부분 수정 필요
        this.parentType = request.getParentType();
        this.type = request.getType();
        this.typeName = request.getType().getName();
        this.ordinal = request.getOrdinal();
    }
}
