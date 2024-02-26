package ru.titov.kafkaconsumer.domain;

import lombok.*;

import java.util.List;

@Builder
@EqualsAndHashCode
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class IncomingMessage {
    private String comment;
    private Integer count;
    private DiskParam diskParam;
    private Boolean range;
    private Boolean range2;
    private List<Blade> blades;
}
