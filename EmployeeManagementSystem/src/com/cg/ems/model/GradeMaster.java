package com.cg.ems.model;

public class GradeMaster {

	private String GradeCode;
	private String Description;
	private int MinSal;
	private int MaxSal;

	public GradeMaster() {

	}

	public GradeMaster(String gradeCode, String description, int minSal,
			int maxSal) {
		super();
		GradeCode = gradeCode;
		Description = description;
		MinSal = minSal;
		MaxSal = maxSal;
	}

	public String getGradeCode() {
		return GradeCode;
	}

	public void setGradeCode(String gradeCode) {
		GradeCode = gradeCode;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getMinSal() {
		return MinSal;
	}

	public void setMinSal(int minSal) {
		MinSal = minSal;
	}

	public int getMaxSal() {
		return MaxSal;
	}

	public void setMaxSal(int maxSal) {
		MaxSal = maxSal;
	}

}
