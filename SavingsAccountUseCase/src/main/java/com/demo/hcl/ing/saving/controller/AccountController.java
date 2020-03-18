package com.demo.hcl.ing.saving.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hcl.ing.saving.controller.response.CustomerResponse;
import com.demo.hcl.ing.saving.controller.response.Message;
import com.demo.hcl.ing.saving.controller.response.ResponseObject;
import com.demo.hcl.ing.saving.dto.BeneficiaryDTO;
import com.demo.hcl.ing.saving.dto.CustomerDTO;
import com.demo.hcl.ing.saving.dto.CustomerLoginDTO;
import com.demo.hcl.ing.saving.dto.TransactionDTO;
import com.demo.hcl.ing.saving.entity.Beneficiary;
import com.demo.hcl.ing.saving.entity.Customer;
import com.demo.hcl.ing.saving.entity.Transaction;
import com.demo.hcl.ing.saving.service.RegisterNewBeneficiary;
import com.demo.hcl.ing.saving.service.RegisterNewCustomer;
import com.demo.hcl.ing.saving.service.TransactionService;

@RestController
@RequestMapping("/bank")
public class AccountController {

	@Autowired
	RegisterNewCustomer registerNewCustomer;
	@Autowired
	RegisterNewBeneficiary registerNewBeneficiary;
	@Autowired
	TransactionService transactionService;

	private ResponseObject responseObject = null;
	private Message message = null;

	private HttpStatus statusCodeHttp;

	/*
	 * @PostMapping("/register") public ResponseEntity<String>
	 * newCustomerRegistrationDetails(@RequestBody CustomerDTO customer) {
	 * System.out.println("Customer is in controller " + customer); Customer
	 * customerDetails =
	 * registerNewCustomer.newCustomerDetails(customer.getCustomer()); if
	 * (customerDetails != null) { return new
	 * ResponseEntity<>("Customer Details saved successfully!", HttpStatus.OK); }
	 * else return new ResponseEntity<>("Customer Details are not saved",
	 * HttpStatus.BAD_REQUEST); }
	 */
	@PostMapping("/register")
	public ResponseEntity<ResponseObject> newCustomerRegistrationDetails(@RequestBody CustomerDTO customer) {
		responseObject = new ResponseObject();
		message = new Message();
		Customer customerDetails = registerNewCustomer.newCustomerDetails(customer.getCustomer());
		if (customerDetails != null) {

			CustomerResponse customerResponse = new CustomerResponse();
			customerResponse.setCustomerName(customerDetails.getFirstName() + " " + customerDetails.getLastName());
			customerResponse.setAccountNumber(customerDetails.getAccount());

			/* Message are set here */
			message.setMessage("Account Created Successfully.");
			message.setStatusCode("200");

			responseObject.setObject(customerResponse);
			responseObject.setMessage(message);
			// statusCodeHttp = HttpStatus.CREATED;

		} else {

			message.setMessage("Account creation failed, please try later.");
			message.setStatusCode("400");

			responseObject.setMessage(message);
			// statusCodeHttp = HttpStatus.EXPECTATION_FAILED;
		}
		return new ResponseEntity<ResponseObject>(responseObject, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<Message> applogin(@RequestBody CustomerLoginDTO customerLoginDTO) {
		message = new Message();
		Boolean b = registerNewCustomer.validateUser(customerLoginDTO.getCustomerCredentials());
		if (b) {
			message.setMessage("Login Successful");
			message.setStatusCode("200");
		} else {
			message.setMessage("Incorrect UserName or Password.");
			message.setStatusCode("406");
		}
		return new ResponseEntity<Message>(message, HttpStatus.OK);
	}

	@PostMapping("/beneficiary")
	public ResponseEntity<ResponseObject> addNewBeneficiary(@RequestBody BeneficiaryDTO beneficiaryDTO) {
		responseObject = new ResponseObject();
		message = new Message();
		Beneficiary savedBeneficiary = registerNewBeneficiary.saveBeneficiary(beneficiaryDTO.getBeneficiary());
		if (savedBeneficiary != null) {
			message.setStatusCode("200");
			message.setMessage("Beneficiary Account added successfully.");
			responseObject.setObject(savedBeneficiary);
			responseObject.setMessage(message);

		} else {
			message.setStatusCode("406");
			message.setMessage("Beneficiary Account could not be added, please try later.");
			responseObject.setMessage(message);
		}
		return new ResponseEntity<ResponseObject>(responseObject, HttpStatus.OK);
	}

	@PostMapping("/fundTransfer")
	public ResponseEntity<ResponseObject> beneficiaryFundTransfer(@RequestBody TransactionDTO transactionDTO) {
		responseObject = new ResponseObject();
		message = new Message();
		Transaction transaction = transactionService.performTransaction(transactionDTO.getTransaction());
		if (transaction != null) {
			message.setStatusCode("200");
			message.setMessage("Transaction completed successfully.");
			responseObject.setObject(transaction);
			responseObject.setMessage(message);

		} else {
			message.setStatusCode("406");
			message.setMessage("Transaction Failed, please try later.");
			responseObject.setMessage(message);
		}
		return new ResponseEntity<ResponseObject>(responseObject, HttpStatus.OK);
	}
}
