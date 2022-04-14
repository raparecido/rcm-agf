package br.com.rcm.agf.agfsbootbff.logical.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String accountId;
    private String name;
    private String description;
    private Bank bank;
}
