package kr.hanbee.townmission.domain;

import javax.persistence.*;

@Entity
public class MissionQuestion extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

    private String question;
    private Integer ordinal;
}
