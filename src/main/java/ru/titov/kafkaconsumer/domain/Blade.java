package ru.titov.kafkaconsumer.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@ToString
@Getter
public class Blade {
    private String caption;
    private Integer value;
}
