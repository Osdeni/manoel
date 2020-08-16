package com.psic.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EnumPresenca {
    PRESENTE("Presente", "secondary"),
    AUSENTE("Ausente", "warning"),
    CANCELADO("Cancelado", "primary");

    private String label;

    private String cssClass;

    EnumPresenca(String label, String cssClass) {
        this.label = label;
        this.cssClass = cssClass;
    }
}
