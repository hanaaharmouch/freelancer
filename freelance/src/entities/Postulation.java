package entities;

import java.io.Serializable;

public class Postulation implements Serializable {
	
	private Integer id_postulation;
	private Integer id_offre;
	private String nomp;
	
	private Integer id_freelancer;
	private String nomf;
	private String prenomf;
	private Integer budget;
	private String motivation;
	private String dure;
	
	public String getNomf() {
		return nomf;
	}
	public void setNomf(String nomf) {
		this.nomf = nomf;
	}
	public String getPrenomf() {
		return prenomf;
	}
	public void setPrenomf(String prenomf) {
		this.prenomf = prenomf;
	}
	
	public Integer getId_postulation() {
		return id_postulation;
	}
	public void setId_postulation(Integer id_postulation) {
		this.id_postulation = id_postulation;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	
	public Integer getId_freelancer() {
		return id_freelancer;
	}
	public void setId_freelancer(Integer id_freelancer) {
		this.id_freelancer = id_freelancer;
	}
	public String getMotivation() {
		return motivation;
	}
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}
	public String getDure() {
		return dure;
	}
	public void setDure(String dure) {
		this.dure = dure;
	}
	
	
	
	
	public Postulation(Integer id_postulation,Integer id_offre, String nomp, Integer id_freelancer, String nomf,
			String prenomf, Integer budget, String motivation, String dure) {
		super();
		this.id_postulation = id_postulation;
		this.nomp = nomp;
		this.id_freelancer = id_freelancer;
		this.nomf = nomf;
		this.prenomf = prenomf;
		this.budget = budget;
		this.motivation = motivation;
		this.dure = dure;
	}
	public String getNomp() {
		return nomp;
	}
	public void setNomp(String nomp) {
		this.nomp = nomp;
	}
	public Postulation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId_offre() {
		return id_offre;
	}
	public void setId_offre(Integer id_offre) {
		this.id_offre = id_offre;
	}
	
	
	
	
}
