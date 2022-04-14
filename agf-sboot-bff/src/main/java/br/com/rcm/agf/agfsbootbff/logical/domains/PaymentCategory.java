package br.com.rcm.agf.agfsbootbff.logical.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentCategory {

    private String categoryId;
    private String name;
    private String description;
    private String color;
}