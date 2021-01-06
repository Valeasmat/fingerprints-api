package com.everis.fingerprints.controller;


import com.everis.fingerprints.dto.ATMDepositRequest;
import com.everis.fingerprints.dto.FingerprintResponse;
import io.reactivex.Single;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FingerprintController {
    @ApiOperation(value = "Post request to retrieve fingerprint validation",
            response = FingerprintResponse.class,
            produces = "application/stream+json")
    @ApiResponse(code = 200,message = "Successful operation",response = FingerprintResponse.class)
    @PostMapping(value = "/core/fingerprints/validate",produces = MediaType.APPLICATION_JSON_VALUE)
    public Single<FingerprintResponse> validate(@RequestBody ATMDepositRequest request){
        return Single.just(new FingerprintResponse("Core",true));
    }


}
