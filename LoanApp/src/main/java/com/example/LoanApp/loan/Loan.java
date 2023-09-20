package com.example.LoanApp.loan;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    public Loan(LoanRequestDTO loanRequestDTO) {
        this.principle = loanRequestDTO.getPrinciple();
        this.frequency = loanRequestDTO.getFrequency();
        this.period = loanRequestDTO.getPeriod();
        this.startDate = loanRequestDTO.getStartDate();
        this.interestType = loanRequestDTO.getInterestType();
        this.rate = loanRequestDTO.getRate();
    }

    private Double principle;
    public Double rate;
    private Integer frequency;
    private Integer period;
    private Date startDate;
    private String interestType;
    private Double processingFees = 3.0/100;
    private Double exciseDuty = 60.0/10000;
    private Double legalFees = 10000.0;
}
