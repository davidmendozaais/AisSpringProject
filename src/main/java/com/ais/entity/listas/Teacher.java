package com.ais.entity.listas;

public class Teacher {
	
	private int idTeacher;
	private String name;
	
	/**
	 * @param idTeacher
	 * @param name
	 */
	public Teacher(int idTeacher, String name) {
		this.idTeacher = idTeacher;
		this.name = name;
	}
	
	/**
	 * 
	 */
	public Teacher() {}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [idTeacher=" + idTeacher + ", name=" + name + "]";
	}
	
	/**
	 * @return the idTeacher
	 */
	public int getIdTeacher() {
		return idTeacher;
	}
	
	/**
	 * @param idTeacher the idTeacher to set
	 */
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
