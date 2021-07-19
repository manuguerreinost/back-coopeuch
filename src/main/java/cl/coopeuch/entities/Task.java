package cl.coopeuch.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;



@Entity
@Table(name="tasks")
public class Task implements Serializable{
	
	private static final long serialVersionUID = 7736573090686748268L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	

	public String description;
	

	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	public Date createAt;
	
	
	public boolean vigent;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public boolean isVigent() {
		return vigent;
	}

	public void setVigent(boolean vigent) {
		this.vigent = vigent;
	}

	
	

}
