package Data;

/**
 *
 * @author Álvaro Rofa Aranda
 */
public class Player {
    private final String completeName;
    private final char failedLetter[];
    private final char guessedLetter[];
    int fails;
    int guessed;
    private boolean dead;
    
    /**
     * Constructor con parámetros
     * @param name nombre del jugador
     */
    public Player(String name){
        this.fails = 0;
        this.guessed = 0;
        this.completeName = name;
        failedLetter = new char[6];  //NUMERO MAXIMO DE TURNOS
        guessedLetter = new char[27];//ABECEDARIO CASTELLANO
        dead = false;
    }
    
    /**
     * Devuelve el nombre completo del jugador.
     * @return nombre completo del jugador
     */
    public String getCompleteName(){
        return this.completeName;
    }
    
    /**
     * Añade una letra incorrecta a la lista de palabras incorrectas, incrementando en 1 los fallos.
     * @param letter letra fallada
     */
    public void addFailed(char letter){
        this.failedLetter[fails] = letter;
        fails++;
    }
    
    /**
     * Añade una letra correcta a la lista de palabras correctas
     * @param letter letra correcta
     */
    public void addGuessed(char letter){
        this.guessedLetter[guessed] = letter;
        this.guessed++;
    }
    
    /**
     * Devuelve el array con todas las letras que hemos fallado
     * @return array con todas las letras que hemos fallado
     */
    public char [] getFailedLetters(){
        return this.failedLetter;
    }
    
    /**
     * Devuelve el array con todas las letras que hemos acertado
     * @return array con todas las letras que hemos acertado
     */
    public char [] getGuessedLetters(){
        return this.guessedLetter;
    }
    
    /**
     * Devuelve el estado del jugador
     * @return True si está ahorcado, false si sigue en juego.
     */
    public boolean isDead(){
        if(fails == 6){
            dead = true;
            return dead;
        }
        else return dead;
    }
}
