package kr.hanbee.townmission.constant;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StatusType {
    OPEN("모집중"),
    ONGOING("진행중"),
    CLOSE("종료");

    private final String name;
}
