package fr.gamedev.question.greeting;

/**
 * Class Greeting.
 *
 * @author djer1
 */
public class Greeting {

  /**
   * variable id.
   */
  private final long id;
  /**
   * variable content.
   */
  private final String content;

  /**
   * Public fonction Greeting.
   *
   * @param newId new id to set
   * @param newContent new content to set
   */
  public Greeting(final long newId, final String newContent) {
    this.id = newId;
    this.content = newContent;
  }

  /**
   * fonction de récupération d'id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * fonction de récupération du content.
   *
   * @return the content
   */
  public String getContent() {
    return content;
  }


}
