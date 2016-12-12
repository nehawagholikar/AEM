package com.model;

public class User {
	private String mDasId;
	private String mUserName;
	private String mPassword;
	private String mMobileNo;
	private String mEmailId;
	private String mDob;
	private String mOrgUnit;
	private String mBaseLocn;
	private Boolean mFlag;
	
	public User()
	{
		mDasId=" ";
		mUserName=" ";
		mPassword=" ";
		mMobileNo=" ";
		mEmailId=" ";
		mDob=" ";
		mOrgUnit=" ";
		mBaseLocn=" ";
		mFlag=false;
	}
	
	public String getmDasId() {
		return mDasId;
	}
	public void setmDasId(String mDasId) {
		this.mDasId = mDasId;
	}
	public String getmUserName() {
		return mUserName;
	}
	public void setmUserName(String mUserName) {
		this.mUserName = mUserName;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	public String getmMobileNo() {
		return mMobileNo;
	}
	public void setmMobileNo(String mMobileNo) {
		this.mMobileNo = mMobileNo;
	}
	public String getmEmailId() {
		return mEmailId;
	}
	public void setmEmailId(String mEmailId) {
		this.mEmailId = mEmailId;
	}
	public String getmDob() {
		return mDob;
	}
	public void setmDob(String mDob) {
		this.mDob = mDob;
	}
	public String getmOrgUnit() {
		return mOrgUnit;
	}
	public void setmOrgUnit(String mOrgUnit) {
		this.mOrgUnit = mOrgUnit;
	}
	public String getmBaseLocn() {
		return mBaseLocn;
	}
	public void setmBaseLocn(String mBaseLocn) {
		this.mBaseLocn = mBaseLocn;
	}
	public Boolean getmFlag() {
		return mFlag;
	}
	public void setmFlag(Boolean mFlag) {
		this.mFlag = mFlag;
	}
	

}
