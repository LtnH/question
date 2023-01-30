package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * classe gérant les questions.
 *
 * @author djer1
 */
@Entity
public class Question {

  /**
   * id de la question.
   */
  @GeneratedValue
  @Id
  private long id;
  /**
   * contenu de la question.
   */
  private String content;

  /**
   * fonction pour récupérer id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * fonction pour définir id.
   *
   * @param newId the id to set
   */
  public void setId(final int newId) {
    this.id = newId;
  }

  /**
   * fonction de récupération de content.
   *
   * @return the content
   */
  public String getContent() {
    return content;
  }

  /**
   * fonction pour définir content.
   *
   * @param newContent the content to set
   */
  public void setContent(final String newContent) {
    this.content = newContent;
  }

}
