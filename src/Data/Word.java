package Data;

import Exception.NoLetterException;

/**
 *
 * @author Álvaro Rofa Aranda
 */
public class Word {
    private final char letters[];
    private final String word;
    private final boolean hideWord[];
    
    /**
     * Constructor con parámetros.
     * @param word palabra oculta 
     */
    public Word(String word){
        this.word = word.toUpperCase();
        this.letters = new char[this.word.length()];
        this.hideWord = new boolean[this.word.length()];
        for (int i = 0; i < this.word.length(); i++) {
            this.letters[i] = this.word.charAt(i);
            this.hideWord[i] = false;
        }
    }

    /**
     * Devuelve la palabra oculta
     * @return palabra oculta
     */
    public String getWord(){
        return this.word;
    }
    
    /**
     * Devuelve un array de todas las letras que componen la palabra oculta
     * @return array de letras de palabra oculta.
     */
    public char[] getLetters(){
        return this.letters;
    }
    
    /**
     * Devuelve un array de todas las posiciones acertadas de la palabra oculta. 
     * @return Devuelve true en las posiciones donde sí se ha acertado y false donde no
     */
    public boolean[] getGuessedWord(){
        return this.hideWord;
    }
    
    /**
     * Si la letra introducida por parámetro coincide con alguna de nuestra palabra oculta, estas letras se mostrarán y devolverá true, sino, no mostrará nada y mostrará false.
     * @param letter
     * @return 
     * @throws Exception.NoLetterException 
     */
    public boolean guessALetter(char letter) throws NoLetterException{
        int detected = 0;
        for (int i = 0; i < this.letters.length; i++) {
            if(this.letters[i] == letter){
                this.hideWord[i] = true;
                detected++;
            }
        }
        if(detected == 0){
            throw new NoLetterException(letter);
        }else return true;
    }
}
