package com.springweb.springbootweb.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "gaurdian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "gaurdian_email")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "gaurdian_mobile")
        )
})
public class Guardian {

    private String name;
    private String email;
    private String mobile;
}
