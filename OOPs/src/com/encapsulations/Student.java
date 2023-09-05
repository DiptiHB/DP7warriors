package com.encapsulations;

public class Student {
	 private int studId;
		private String name;
		private int percent;
		private String faculty;
		
		public void setStudId(int studId)
		{
			this.studId=studId;
		}
		public int getStudId()
		{
			return studId;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		public void setPercent(int percent)
		{
			this.percent=percent;
		}
		public int getPercent()
		{
			return percent;
		}
		public void setFaculty(String faculty)
		{
			this.faculty=faculty;
		}
		public String getFaculty()
		{
			return faculty;
		}

}
