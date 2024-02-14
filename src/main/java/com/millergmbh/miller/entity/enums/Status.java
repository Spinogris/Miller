package com.millergmbh.miller.entity.enums;

public enum Status {
    ACTIVE(0),
    WAIT(1),
    REPAIR(2);

    private final int value;

    Status(int value){
        this.value = value;
    }
}
