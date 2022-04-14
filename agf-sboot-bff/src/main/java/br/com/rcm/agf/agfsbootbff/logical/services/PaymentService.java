package br.com.rcm.agf.agfsbootbff.logical.services;

import br.com.rcm.agf.agfsbootbff.logical.domains.Payment;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;

public interface PaymentService {

    void save(final Payment payment);

    void confirm(final String paymentId, final BigDecimal value, final LocalDate paymentDate);

    Collection<Payment> between(final LocalDate start, final LocalDate end);
}