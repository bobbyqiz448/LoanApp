package com.example.LoanApp.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoanController {

    @Autowired
    LoanService loanService;


    @GetMapping("/calculator")
    String calculate(){
        return "Thsi is Working";
    }



    @PostMapping("/calculate")
    @ResponseBody
    public ResponseEntity<?> calculateLoan(@RequestBody LoanRequestDTO request) {
        // Implement loan calculation logic here : alrady implemented in the service
        // Create a LoanResponse object with installment details : alrady implemented in the service
        // Return the response as JSON   ....being implemented
            // emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);

        LoanResponse loanResponse = loanService.calculateLoan(request);

        return ResponseEntity.ok(loanResponse);
    }
}
