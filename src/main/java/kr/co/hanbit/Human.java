package kr.co.hanbit;

import java.util.Objects;

public class Human {
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return Objects.equals(age, other.age) && Objects.equals(height, other.height)
				&& Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, height, name);
	}

	private String name;
	private Integer age;
	private Double height;
}
