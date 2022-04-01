package kr.hanbee.townmission.dto.mission.request;

import lombok.Getter;

@Getter
public class MissionAddressRequest {
    private String address;
    private String addressDetail;
    private String postalCode;
}
