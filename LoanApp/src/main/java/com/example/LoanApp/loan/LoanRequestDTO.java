package com.example.LoanApp.loan;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoanRequestDTO {


    private Double principle;
    private Integer frequency;
    private Integer period;
    private Date startDate;
    private String interestType;
    private  Double rate;

}
