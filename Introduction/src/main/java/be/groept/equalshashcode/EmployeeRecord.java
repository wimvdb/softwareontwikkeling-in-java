package be.groept.equalshashcode;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class EmployeeRecord {

	private final String employeeFirstName;
	private final String employeeLastName;

	public EmployeeRecord(String employeeFirstName, String employeeLastName) {
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof EmployeeRecord) {
			EmployeeRecord er = (EmployeeRecord) o;
			return new EqualsBuilder()
					.append(this.getEmployeeFirstName(),
							er.getEmployeeFirstName())
					.append(this.getEmployeeLastName(),
							er.getEmployeeLastName()).isEquals();
		}

		/*
		 * if (o instanceof EmployeeRecord) { EmployeeRecord er =
		 * (EmployeeRecord) o; if (er.getEmployeeFirstName() != null &&
		 * er.getEmployeeLastName() != null) { return
		 * er.getEmployeeFirstName().equals(employeeFirstName) &&
		 * er.getEmployeeLastName().equals(employeeLastName); }
		 * 
		 * }
		 */

		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.getEmployeeFirstName())
				.append(this.getEmployeeLastName()).toHashCode();
		/*
		 * if (employeeFirstName != null && employeeLastName != null) { return
		 * employeeFirstName.length() + employeeLastName.length(); } else {
		 * return 0; }
		 */
	}

}
