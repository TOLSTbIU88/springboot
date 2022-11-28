package org.example.emploee;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class EmloyeeDtoRq {

    @JsonProperty("name")
    private String emploee;
}
