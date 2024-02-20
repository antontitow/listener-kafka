package ru.titov.kafkaconsumer.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@ToString
@Getter
public class DiskParam {
    private Double db;
    private Double dbAngle;
}
