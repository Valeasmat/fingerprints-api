package com.everis.fingerprints.controller;


import com.everis.fingerprints.dao.ATMDepositRequest;
import com.everis.fingerprints.dao.FingerprintResponse;
import io.reactivex.Single;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FingerprintController {

    @PostMapping("/core/fingerprints/validate")
    public Single<FingerprintResponse> validate(@RequestBody ATMDepositRequest request){
        return Single.just(new FingerprintResponse("Core",true));
    }


}
