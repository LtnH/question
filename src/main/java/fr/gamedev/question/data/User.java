package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * classe gérant les utilisateurs.
 *
 * @author djer1
 */
@Entity
public class User {

  /**
   * id de l'utilisateur.
   */
  @GeneratedValue
  @Id
  private long id;
  /**
   * login de l'utilisateur.
   */
  private String login;
  /**
   * nom de l'utilisateur.
   */
  private String lastName;

  /**
   * fonction de récupération d'id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * fonction de définition d'id.
   *
   * @param newId the id to set
   */
  public void setId(final long newId) {
    this.id = newId;
  }

  /**
   * fonction de récupération de login.
   *
   * @return the login
   */
  public String getLogin() {
    return login;
  }

  /**
   * fonction de définition de login.
   *
   * @param newLogin the login to set
   */
  public void setLogin(final String newLogin) {
    this.login = newLogin;
  }

  /**
   * fonction de récupération de lastName.
   *
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * fonction de définition de lastName.
   *
   * @param newLastName the lastName to set
   */
  public void setLastName(final String newLastName) {
    this.lastName = newLastName;
  }

}
