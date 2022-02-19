package kr.hanbee.townmission.constant;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SettlementType {
    ON_SITE("현장 지급"),
    ACCOUNT_TRANSFER("계좌 지급");

    private final String name;
}
