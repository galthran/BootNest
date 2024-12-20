package com.jarosinski.bootnest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentErrorResponseDTO {

    private int status;
    private String message;
    private long timeStamp;
}
