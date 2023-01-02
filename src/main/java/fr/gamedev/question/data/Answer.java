package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * classe comprenant les méthodes Answer.
 *
 * @author djer1
 */
@Entity
public class Answer {

  /**
   * variable Id.
   */
  @GeneratedValue
  @Id
  private long id;

  /**
   * variable question.
   */
  @OneToOne
  private Question question;
  /**
   * variable correctAnswer.
   */
  private Boolean correctAnswer;


  /**
   * fonction de récupération d'id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * Fonction de paramétrage d'id.
   *
   * @param newId the id to set
   */
  public void setId(final long newId) {
    this.id = newId;
  }

  /**
   * fonction de récupération de question.
   *
   * @return the question
   */
  public Question getQuestion() {
    return question;
  }

  /**
   * fonction de paramétrage de question.
   *
   * @param newQuestion the question to set
   */
  public void setQuestion(final Question newQuestion) {
    this.question = newQuestion;
  }

  /**
   * fonction de récupération de correctAnswer.
   *
   * @return the correctAnswer
   */
  public Boolean getCorrectAnswer() {
    return correctAnswer;
  }

  /**
   * fonction de paramétrage de correctAnswer.
   *
   * @param newCorrectAnswer the correctAnswer to set
   */
  public void setCorrectAnswer(final Boolean newCorrectAnswer) {
    this.correctAnswer = newCorrectAnswer;
  }

}
