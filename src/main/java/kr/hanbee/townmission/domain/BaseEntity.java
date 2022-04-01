package kr.hanbee.townmission.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    private LocalDateTime lastModifiedAt;

    // TODO: 실제 사용자가 들어갈 수 있도록 추가 기능 구현 필요
    @CreatedBy
    @Column(updatable = false)
    private Integer creator = -1;

    // TODO: 실제 사용자가 들어갈 수 있도록 추가 기능 구현 필요
    @LastModifiedBy
    private Integer lastModifier;

}
