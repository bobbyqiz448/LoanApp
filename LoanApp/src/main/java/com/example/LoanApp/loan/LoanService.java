package com.example.LoanApp.loan;

import org.springframework.stereotype.Service;

@Service
public class LoanService {
    public LoanResponse calculateLoan(LoanRequestDTO request) {
        //My Implement loan calculation logic here

        Loan loan = new Loan(request);

        Double interest;

        if (loan.getInterestType().equals("Flat Rate")){
            interest =  (loan.getPrinciple() * loan.getRate() * loan.getPeriod()) / 100;
        }
        else{
            interest =  (loan.getPrinciple()*loan.getRate()*Math.pow(1+loan.getRate(), loan.getPeriod()))/(Math.pow(1+ loan.getRate(), loan.getPeriod())-1);
        }


        LoanResponse loanResponse = new LoanResponse(loan);


        loanResponse.setMonthlyInterest(interest);

        return loanResponse;
    }
}
