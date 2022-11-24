package com.ip.dao;

public class StudentDTO {

		private int roll;
		private String name;
		private String email;
		
		private String cname;
		private int marks;
		
		public StudentDTO() {
		
		}

		public StudentDTO(int roll, String name, String email, String cname, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.email = email;
			this.cname = cname;
			this.marks = marks;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

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

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "StudentDTO [roll=" + roll + ", name=" + name + ", email=" + email + ", cname=" + cname + ", marks="
					+ marks + "]";
		}
		
		
}
