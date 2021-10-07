package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.dto.AccountDto;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.FetchAccountFlow;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {

    private final FetchAccountFlow fetchAccountFlow;

    @Autowired
    public AccountController(FetchAccountFlow fetchAccountFlow) {
        this.fetchAccountFlow = fetchAccountFlow;
    }
    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Accounts.", notes = "Returns a list of account balances")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account balance returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<List<AccountDto>>> getAll(){
        List<AccountDto> accounts = FetchAccountFlow.getTotal_Points();
        GeneralResponse<List<AccountDto>> response = new GeneralResponse<>(true, accounts);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
