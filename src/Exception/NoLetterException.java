package Exception;

/**
 *
 * @author Álvaro Rofa Aranda
 */
public class NoLetterException extends Exception{
    public NoLetterException(char letter){
        super("No se ha encontrado la letra " + letter + " en la palabra oculta");
    }
}
