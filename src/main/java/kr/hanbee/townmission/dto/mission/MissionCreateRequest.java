package kr.hanbee.townmission.dto.mission;

import kr.hanbee.townmission.constant.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.util.ObjectUtils;

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
    private MissionAddressRequest address;

    // about attachment
    private List<MissionAttachmentRequest> attachments;

    // about question
    private List<MissionQuestionRequest> questions;

    public boolean hasAttachment() {
        return !ObjectUtils.isEmpty(attachments);
    }

    public boolean hasQuestion() {
        return !ObjectUtils.isEmpty(questions);
    }
}
