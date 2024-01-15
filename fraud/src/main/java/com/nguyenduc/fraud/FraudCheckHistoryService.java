package com.nguyenduc.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FraudCheckHistoryService {

    private final FraudCheckHistoryRepository repo;
    public boolean isFraudulentCustomer(Integer customerId) {
        repo.save(FraudCheckHistory.builder()
                        .customerId(customerId)
                        .createAt(LocalDateTime.now())
                        .build());
        // config simple everyone is fraud
        return false;
    }
}
