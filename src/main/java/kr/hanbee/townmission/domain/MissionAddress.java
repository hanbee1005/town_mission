package kr.hanbee.townmission.domain;

import javax.persistence.*;

@Entity
public class MissionAddress extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;

    private String address;
    private String addressDetail;
    private String postalCode;
}
