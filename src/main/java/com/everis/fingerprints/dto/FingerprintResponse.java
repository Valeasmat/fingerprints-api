package com.everis.fingerprints.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel("Fingerprint response")
public class FingerprintResponse {
    @ApiModelProperty(example = "Core")
    private String entityName;
    @ApiModelProperty(example = "true")
    private Boolean success;
}
