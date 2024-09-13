package com.example.demo;

public class TestData {
		private String name;
		private String mobileNumber;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public TestData(String name, String mobileNumber) {
			super();
			this.name = name;
			this.mobileNumber = mobileNumber;
		}
		public TestData() {
			super();
		}
		
		
}
