package com.everis.fingerprints.controller;


import com.everis.fingerprints.dto.ATMDepositRequest;
import com.everis.fingerprints.dto.FingerprintResponse;
import io.reactivex.Single;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FingerprintController {

    @PostMapping(value = "/core/fingerprints/validate",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Single<FingerprintResponse> validate(@RequestBody ATMDepositRequest request){
        return Single.just(new FingerprintResponse("Core",true));
    }


}
