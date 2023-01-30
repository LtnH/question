package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * classe gérant les messages de bienvenue.
 *
 * @author djer1
 */
@Entity
public class Salutation {

  /** message id. */
  @GeneratedValue
  @Id
  private Long id;
  /** salutation message. */
  private String message;

  /**
   * fonction de récupération d'id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * fonction pour définir id.
   *
   * @param theId the id to set
   */
  public void setId(final Long theId) {
    this.id = theId;
  }

  /**
   * fonction de récupération de message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * fonction pour définir message.
   *
   * @param theMessage the message to set
   */
  public void setMessage(final String theMessage) {
    this.message = theMessage;
  }

}
