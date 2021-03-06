package com.zhaopin.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Apply implements Serializable{
	private Integer id;
	private User user; 				//申请人
	private Position position;		//申请岗位
	private Date applyDate;			//申请时间
	private Date finishDate;		//完成时间
	private Date startAnswerDate;	//用户开始答题时间
	private String state;			//申请状态	待审核，待答卷，待批阅，已完成，已拒绝
	
	private Paper paper;			//用户答题试卷
	private String answer;			//用户答案
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="position_id")
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getStartAnswerDate() {
		return startAnswerDate;
	}
	public void setStartAnswerDate(Date startAnswerDate) {
		this.startAnswerDate = startAnswerDate;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="paper_id")
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	@Column(length=65500)
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}
