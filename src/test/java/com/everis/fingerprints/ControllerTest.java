package com.everis.fingerprints;


import com.everis.fingerprints.controller.FingerprintController;
import com.everis.fingerprints.dto.ATMDepositRequest;
import com.everis.fingerprints.dto.FingerprintResponse;
import io.reactivex.observers.TestObserver;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ControllerTest {


    private FingerprintController fingerprintController=new FingerprintController();

    @Test
    public void ControllerTest(){
        ATMDepositRequest request=new ATMDepositRequest();
        request.setDocumentNumber("10000000");

        TestObserver<FingerprintResponse> testObserver=fingerprintController.validate(request).test();

        FingerprintResponse responseCheck=new FingerprintResponse();
        responseCheck.setEntityName("Core");
        responseCheck.setSuccess(true);

        testObserver
                .assertSubscribed()
                .assertNever(response->!response.getEntityName().equals(responseCheck.getEntityName()))
                .assertNever(response->response.getSuccess().booleanValue()!=responseCheck.getSuccess())
                .assertValueCount(1)
                .assertNoErrors();


    }

}
