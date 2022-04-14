package br.com.rcm.agf.agfsbootbff.logical.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private String paymentId;
    private Account account;
    private PaymentCategory category;
    private Boolean variable;
    private LocalDate paymentDate;
    private LocalDate dueDate;
    private String description;
    private BigDecimal value;
    private Boolean confirmed;
}