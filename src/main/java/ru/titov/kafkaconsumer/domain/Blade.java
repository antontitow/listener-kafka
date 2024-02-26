package ru.titov.kafkaconsumer.domain;

import lombok.*;

@Builder
@EqualsAndHashCode
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Blade {
    private String caption;
    private Integer value;
}
