package com.learn.customHashMap;
class Employee {
		private Integer id;
		private String name;

		Employee(Integer id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public int hashCode() {
			// this ensures all hashcodes are between 0 and 15
			return id % 10;
		}

		@Override
		public boolean equals(Object obj) {
			/*
			 * Employee otherEmp = (Employee) obj; return this.name.equals(otherEmp.name);
			 */
			if (this == obj)
	            return true;
			
	        if (obj == null)
	            return false;
	        
	        if (getClass() != obj.getClass())
	            return false;
	        
	        Employee otherEmp = (Employee) obj;
	        return this.name.equals(otherEmp.name);
		}

		@Override
		public String toString() {
			return this.id + "-" + name;
		}
	}