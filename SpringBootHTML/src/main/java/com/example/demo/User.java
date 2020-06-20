package com.example.demo;

public class User {
	
	    private String name;
	    private String email;
	    private String password;
	    private String gender;
	    private String note;
	    
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		private String profession;
		@Override
		public String toString() {
			return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender
					+ ", note=" + note + ", profession=" + profession + ", getName()="
					+ getName() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getGender()="
					+ getGender() + ", getNote()=" + getNote() + ", getProfession()="
					+ getProfession() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	 
	    // getters
	    // setters
	     
	    // override toString()
	 
	
}
