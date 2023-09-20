package com.example.LoanApp.loan;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class LoanResponse {

    public LoanResponse(Loan loan) {
        this.principle = loan.getPrinciple();
        this.frequency = loan.getFrequency();
        this.period = loan.getPeriod();
        this.startDate = loan.getStartDate();
        this.interestType = loan.getInterestType();
        this.processingFees = loan.getProcessingFees();
        this.exciseDuty = loan.getExciseDuty();
        this.legalFees = loan.getLegalFees();
    }

    private Double principle;
    private Integer frequency;
    private Integer period;
    private Date startDate;
    private String interestType;
    private Double processingFees = 3.0/100;
    private Double exciseDuty = 60.0/10000;
    private Double legalFees = 10000.0;
    private Double monthlyInterest;
}
