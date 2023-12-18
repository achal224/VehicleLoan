package com.vehicleloan.app.demo.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private int enquiryId;
	private String customerName;
	private String customerDateOfBirth;
	private int customerAge;
	private String customerGender;
	private String customerEmail;
	private long customerMobileNumber;
	private long customerAdditionalMobilenumber;
	private double customerAmountPaidForLoan;
	private double customerTotalLoanRequired;
	@OneToOne(cascade = CascadeType.ALL)
	private EductionalInfo educationalInfo;
   @OneToOne(cascade = CascadeType.ALL)
   private AllPersonalDocs allpersonalDocs;
    @OneToOne(cascade = CascadeType.ALL)
    private CustomerAddress customerAddress;
   @OneToOne(cascade = CascadeType.ALL)
   private Profession prefession;
  @OneToOne(cascade = CascadeType.ALL)
  private Cibil cibilescore;
   @OneToOne(cascade = CascadeType.ALL)
   private CurrentLoanDetails currentloandetails;
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
