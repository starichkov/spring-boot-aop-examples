package org.starichkov.java.spring.aop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vadim Starichkov
 * @since 20.11.2018 18:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleDto {
    private Long id;
    private String name;
}
