package com.vehicleloan.app.demo.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Customer {
	
	@Id
	private int customerId;
	private String customerName;
	private int customerAge;
	private String customerEmail;
	private String customerDateOfBirth;
	private String customerGender;
	private int customerMobileNumber;
	private long customerAdditionalMobilenumber;
	private String localAddress;
	private String permanentAddress;
	private String loanAppStatus;
	private double customerAmountPaidForVehicle;
	private int customerTotalLoanRequired;
	private int loanDuration;
	private double emi;
	private int cibilScore;
	private String remark;
	@OneToOne(cascade = CascadeType.ALL)
	private EductionalInfo educationalInfo;
   @OneToOne(cascade = CascadeType.ALL)
   private AllPersonalDocs allpersonalDocs;
   @OneToOne(cascade = CascadeType.ALL)
   private Profession prefession;
  // @OneToOne(cascade = CascadeType.ALL)
  // private CurrentLoanDetails currentloandetails;
  @OneToOne(cascade = CascadeType.ALL)
  private PreviousLoan previousloan;
 @OneToOne(cascade = CascadeType.ALL)
 private AccountDetails accountdetails;
@OneToOne(cascade = CascadeType.ALL)
GurantorDetails gurantordetails;
@OneToOne(cascade = CascadeType.MERGE.DETACH.REFRESH.REMOVE)
LoanDisbursement loandisbursement;
@OneToOne(cascade = CascadeType.MERGE.DETACH.REFRESH.REMOVE)
SanctionLetter sanctionletter;
@OneToOne(cascade = CascadeType.MERGE.DETACH.REFRESH.REMOVE)
CustomerVerification customerverification;


	

}
