package com.vihan.realestate.model;

import java.math.BigDecimal;

public class UserInfo {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailId;
    private String projectLocation;
    private String projectName;
    private Integer platNumber;
    private BigDecimal platPrice;
    private String referralCode;

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

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getPlatNumber() {
        return platNumber;
    }

    public void setPlatNumber(Integer platNumber) {
        this.platNumber = platNumber;
    }

    public BigDecimal getPlatPrice() {
        return platPrice;
    }

    public void setPlatPrice(BigDecimal platPrice) {
        this.platPrice = platPrice;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }
}
