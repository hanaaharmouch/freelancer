package web;

import java.util.ArrayList;
import java.util.List;

import entities.Postulation;

public class PostModel {
	
	private Postulation postulation=new Postulation();
	private List<Postulation> postulations=new ArrayList<Postulation>();
	private String errors;
	
	public Postulation getPostulation() {
		return postulation;
	}
	public void setPostulation(Postulation postulation) {
		this.postulation = postulation;
	}
	public List<Postulation> getPostulations() {
		return postulations;
	}
	public void setPostulations(List<Postulation> postulations) {
		this.postulations = postulations;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	

}
