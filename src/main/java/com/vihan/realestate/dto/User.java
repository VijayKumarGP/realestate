package com.vihan.realestate.dto;

import com.vihan.realestate.generator.PrimarykeyPrefixGenerator;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "user_seq")
    @GenericGenerator(name = "user_seq", strategy = "com.vihan.realestate.generator.PrimarykeyPrefixGenerator", parameters = {
            @org.hibernate.annotations.Parameter(name = PrimarykeyPrefixGenerator.VALUE_PREFIX_PARAMETER, value = "VVR_"),
            @org.hibernate.annotations.Parameter(name = PrimarykeyPrefixGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")
    })
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "referral_code")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "referral_seq")
    @GenericGenerator(name = "referral_seq", strategy = "com.vihan.realestate.generator.PrimarykeyPrefixGenerator", parameters = {
            @org.hibernate.annotations.Parameter(name = PrimarykeyPrefixGenerator.VALUE_PREFIX_PARAMETER, value = "VVRF_"),
            @org.hibernate.annotations.Parameter(name = PrimarykeyPrefixGenerator.NUMBER_FORMAT_PARAMETER, value = "%06d")
    })
    private String referralCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

}
