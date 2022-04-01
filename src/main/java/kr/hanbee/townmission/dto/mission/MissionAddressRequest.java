package kr.hanbee.townmission.dto.mission;

import lombok.Getter;

@Getter
public class MissionAddressRequest {
    private String address;
    private String addressDetail;
    private String postalCode;
}
