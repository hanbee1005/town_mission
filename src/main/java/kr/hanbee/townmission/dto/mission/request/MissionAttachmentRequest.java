package kr.hanbee.townmission.dto.mission.request;

import lombok.Getter;

@Getter
public class MissionAttachmentRequest {
    private String bucketType;
    private String originalFileName;
    private String fileName;
    private String filePath;
    private Integer ordinal;
}
