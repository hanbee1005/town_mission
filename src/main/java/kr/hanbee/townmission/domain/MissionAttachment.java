package kr.hanbee.townmission.domain;

import javax.persistence.*;

@Entity
public class MissionAttachment extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Mission mission;

    private String bucketType;
    private String originalFileName;
    private String fileName;
    private String filePath;
    private Integer ordinal;
}
