package ru.titov.kafkaconsumer.domain;

import lombok.*;

@Builder
@EqualsAndHashCode
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DiskParam {
    private Double db;
    private Double dbAngle;
}
