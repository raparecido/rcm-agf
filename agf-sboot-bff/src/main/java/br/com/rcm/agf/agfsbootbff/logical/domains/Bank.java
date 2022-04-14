package br.com.rcm.agf.agfsbootbff.logical.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

    private String id;
    private String name;
    private String code;
}
