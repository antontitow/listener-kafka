package ru.titov.kafkaconsumer.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Builder
@EqualsAndHashCode
@ToString
@Getter
public class IncomingMessage {
    private String comment;
    private Integer count;
    private DiskParam diskParam;
    private Boolean range;
    private Boolean range2;
    private List<Blade> blades;
}
